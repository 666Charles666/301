import java.util.LinkedList;
import java.util.List;

public class Case {
    private static int caseNum,size;
    private String type , lighting;
    private List<Tray>[] trays;
    public Case(int size){
        trays = new List[size];
        for (int i=0;i < size; i++){
            trays[i] = new LinkedList<>();
        }
    }
    public int hushFunction(int key){
        return Math.abs(key%trays.length);
    }

    public int add(Tray item){
        int key = item.hashCode();
        int index = hushFunction(key);
        trays[index].add(item);
        return index;
    }
    public void displayHashTable(){
        for (int i = 0; i < trays.length; i++) {
            System.out.print("Slot " + i + ": ");
            for (Tray item : trays[i]) {
                System.out.print(item + " -> ");
            }
            System.out.println("null");
        }
    }
}
