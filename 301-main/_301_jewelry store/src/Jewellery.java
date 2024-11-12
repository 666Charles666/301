import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import java.util.LinkedList;

public class Jewellery {
     private String description, type, targetGender, image, retailPrice,id;

     //the only identifier
     static int counter = 1;
     private int ID;
     List<Components>[] components = new List[3];


     public Jewellery() {
          this.ID = counter++;
          counter++;
     }




     private int size;




     public void addComponents(Components component) {
          if (component == null) {
               System.out.println("wrong");
               return;
          }
          int index = 0;
          if (components[index] == null) {
               components[index] = new LinkedList<>();
          }
          components[index].add(component);
          System.out.println("Component added: " + component);
     }
     public Jewellery searchByComponents(Components component) {
          for (List<Components> componentList : components) {
               if (componentList != null && componentList.contains(component)) {
                    return this;
               }
          }
          return null;
     }


     public int size(){
          return size;
     }

     public String getDescription() {
          return description;
     }

     public void setDescription(String description) {
          this.description = description;
     }

     public String getType() {
          return type;
     }

     public void setType(String type) {
          this.type = type;
     }

     public String getTargetGender() {
          return targetGender;
     }

     public void setTargetGender(String targetGender) {
          this.targetGender = targetGender;
     }

     public String getImage() {
          return image;
     }

     public void setImage(String image) {
          this.image = image;
     }

     public String getRetailPrice() {
          return retailPrice;
     }

     public void setRetailPrice(String retailPrice) {
          this.retailPrice = retailPrice;
     }

     public int getID() {
          return ID;
     }

     public void setID(int ID) {
          this.ID = ID;
     }
     public String toString() {
          return "Jewellery{description: " + description + ", type :" + type + ", targetGender :"+targetGender+ ", image:"+image + ", retailPrice :" + retailPrice + "}";
     }
}
