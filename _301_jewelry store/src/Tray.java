import java.util.List;

public class Tray {
     private String TrayID;
     private String inlay , material ,color;
     private double length,width;
     private int size;

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
     private String calculate(int num){
          if (num >= 1 && num <= 9) {
               // 如果数字在1到9之间，返回格式化为两位数的字符串
               return String.format("%02d", num);  // 格式化为两位数，如 01, 02, ..., 09
          }
          // 如果数字大于9，直接返回数字的字符串
          return String.valueOf(num);  // 或者 return Integer.toString(num);
     }
     private String generateTrayID(Case caseInstance){
          if (caseInstance.getTrayIdentifier() < 'Z'){
               char current = caseInstance.getTrayIdentifier();
               return (String.valueOf(current) + calculate(caseInstance.getNextTrayNum()));
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
