
import java.util.Arrays;
import java.util.List;

public class Tray {
     private final String TrayID;
     private String inlay , material ,color;
     private double length,width;
     private int size;
     private List<Jewellery> jewelleryList;

     public Tray (int size,String inlay,String material,String color,double length,double width,Case caseInstance){
          this.size = size;
          this.inlay = inlay;
          this.color = color;
          this. material = material;
          this. width = width;
          this.length = length;
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
          if (head == null){
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

     // when find the Jewellery , return the Jewellery instance , else return null
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
     private String calculate(int num){
          if (num >= 1 && num <= 9) {
               return String.format("%02d", num);
          }
          return String.valueOf(num);
     }
     private String generateTrayID(Case caseInstance){
          if (caseInstance.getTrayIdentifier() < 'Z'){
               char current = caseInstance.getTrayIdentifier();
               return String.valueOf(current) + String.format("%02d",Integer.parseInt(calculate(caseInstance.getNextTrayNum())));
          }
          else return "more";
     }
     public boolean deleteJewellery(int jewelleryNumber) {
          if (head == null) {
               System.out.println("No jewellery to delete.");
               return false;
          }
          Node current = head;
          while (current != null) {
               if (current.jewelleryInfo.getID() == jewelleryNumber) {
                    if (current.prev != null) {
                         current.prev.next = current.next;
                    } else {
                         head = current.next;
                    }
                    if (current.next != null) {
                         current.next.prev = current.prev;
                    } else {
                         tail = current.prev;
                    }
                    size--;
                    System.out.println("Jewellery deleted: ");
                    System.out.println( current.jewelleryInfo);
                    return true;
               }
               current = current.next;
          }
          System.out.println("can't find jewellery with this id");
          return false;
     }
     public void display() {
          if (head == null) {
               System.out.println("No jewellery in this tray.");
               return;
          }

          Node current = head;
          System.out.println("Jewellery in Tray " + TrayID + ":");
          while (current != null) {
               Jewellery jewellery = current.jewelleryInfo;
               System.out.println(jewellery.toString());
               //I wanted to use components' toString directly,
               // but idea's automatic recommendation worked better ,
               // so I used the compiler's recommendation
               System.out.println(Arrays.toString(jewellery.components));
               current = current.next;
          }
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

     public double getLength() {
          return length;
     }

     public void setLength(double length) {
          this.length = length;
     }

     public double getWidth() {
          return width;
     }

     public void setWidth(double width) {
          this.width = width;
     }

     public String getTrayID(){
          return this.TrayID;
     }
     public int getSize(){
          return this.size;
     }

}
