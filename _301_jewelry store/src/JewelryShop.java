import java.util.LinkedList;
import java.util.List;

/**
 * hash->hash->link
 */
public class JewelryShop {
    private List<Case>[] cases;
    public JewelryShop(int size){
        cases =new List[size];
        for (int i = 0; i < size; i++) {
            cases[i] = new LinkedList<>();
        }
    }
    public int hushFunction(int key){
        return Math.abs(key%cases.length);
    }

    public int add(Case item){
        int key = item.hashCode();
        int index = hushFunction(key);
        cases[index].add(item);
        return index;
    }
    public void displayHashTable(){
        for (int i = 0; i < cases.length; i++) {
            System.out.print("Slot " + i + ": ");
            for (Case item : cases[i]) {
                System.out.print(item + " -> ");
            }
            System.out.println("null");
        }
    }
}
