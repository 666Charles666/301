import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import java.util.LinkedList;

public class Jewellery {
     private String description, type, targetGender, image, retailPrice;

     //the only identifier
     private static int counter = 0;
     private int ID;
     List<Components>[] components = new List[5];

     public Jewellery() {
          int current = counter;
          this.ID = current;
          counter++;
     }


     class Node {
          private Node prev;
          private Node next;
          private Jewellery details;

          public Node(Jewellery details) {
               prev = null;
               next = null;
               this.details = details;
          }
     }



     private Node head ;
     private Node tail;
     private int size;

     //AddFirst
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
               newNode.next = head ;
               head.prev = newNode;
               head = newNode;
               System.out.println("ADD SUCCESSFUL");
          }
          size ++;
     }

     //If find the Jewellery , return the Jewellery instance , else return null
     public Jewellery searchByID(int ID){
          Node current = head;
          while(current != null){
               if (current.details.getID() == ID){
                    return current.details;
               }
               current = current.next;
          }
          return null;
     }
     public boolean delete(int ID) {
          Node current = head;
          while (current != null) {
               if (current.details.getID() == ID) {
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
                    return true;
               }
               current = current.next;
          }
          return false;
     }
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
          return "Jewellery{description: " + description + ", type :" + type + ", targetGender :"+targetGender+ ", image:"+image + ", retailPrice :" + retailPrice;
     }
}
