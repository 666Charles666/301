import java.util.List;

public class Tray {
     private  char identifier;
     private String TrayID;
     private int trayNum ;
     private String inlay , material ,color;
     private double dimension;
     private int size;
     List<Jewelry>[] jewelries;

     public Tray (String inlay,String material,String color,double dimension,int size,Case caseInstance){
          this.size = size;
          this.jewelries = new List[size];
          this.inlay = inlay;
          this.material = material;
          this.color = color;
          this.dimension = dimension;

          //initiate a LinkedList(the Jewelery class) in every slot int the hashTable
          for (int i = 0; i < jewelries.length; i++) {
               jewelries[i].add(new Jewelry());
               this.trayNum = caseInstance.getNextTrayNum();
               this.identifier = caseInstance.getTrayIdentifier();
               TrayID = String.valueOf(identifier) + trayNum;
          }

     }

     private char generateID(){
          if (identifier < 'Z'){
               char current = identifier;
               identifier ++ ;
               return (char)(current + trayNum);
          }
          else return 'E';
     }

     private int hashFunction(int key){
          return Math.abs(key%jewelries.length);
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
}
