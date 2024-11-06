import java.util.List;

public class Tray {
     private String TrayID;
     private String inlay , material ,color;
     private double dimension;
     private int size;

     public Tray (Tray trayInfo,Case caseInstance){
          this.size = trayInfo.getSize();
          this.inlay = trayInfo.getInlay();
          this.material = trayInfo.getMaterial();
          this.color = trayInfo.getColor();
          this.dimension = trayInfo.getDimension();
          TrayID = generateTrayID(caseInstance);
     }
     class Node {
          private Node prev;
          private Node next;
          private Jewellery jewelleryInfo;

          public Node(Jewellery jewellery) {
               prev = null;
               next = null;
               this.jewelleryInfo =jewellery;
          }
     }
     private Node head ;
     private Node tail;

     //AddLast
     public void add(Jewellery detail){
          Node newNode = new Node(detail);
          if (detail == null){
               System.out.println("Wrong Input");
               return;
          }
          if (head == tail){
               head = newNode;
               tail = newNode;
               System.out.println("ADD SUCCESSFUL");
          }
          else {
              newNode.prev = tail;
              tail.next = newNode;
              tail = newNode;
              System.out.println("ADD SUCCESSFUL");
          }
          size ++;
     }

     //If find the Jewellery , return the Jewellery instance , else return null
     public Jewellery searchByJewelleryID(int ID){
          Node current = head;
          while(current != null){
               if (current.jewelleryInfo.getID() == ID){
                    return current.jewelleryInfo;
               }
               current = current.next;
          }
          return null;
     }
     private String generateTrayID(Case caseInstance){
          if (caseInstance.getIdentifier() < 'Z'){
               char current = caseInstance.getTrayIdentifier();
               return (String.valueOf(current) + caseInstance.getNextTrayNum());
          }
          else return "E";
     }


     public String getInlay() {
          return inlay;
     }

     public void setInlay(String inlay) {
          this.inlay = inlay;
     }

     public String getMaterial() {
          return material;
     }

     public void setMaterial(String material) {
          this.material = material;
     }

     public String getColor() {
          return color;
     }

     public void setColor(String color) {
          this.color = color;
     }

     public double getDimension() {
          return dimension;
     }

     public void setDimension(double dimension) {
          this.dimension = dimension;
     }
     public String getTrayID(){
          return this.TrayID;
     }
     public int getSize(){
          return this.size;
     }
}
