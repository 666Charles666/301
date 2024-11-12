import java.util.LinkedList;
import java.util.List;

/**
 * project structure
 * hash->hash->link
 */
public class JewelleryShop {
    //Link to case
    List<Case>[] cases;
    public JewelleryShop(int size){
        cases =new List[size];
        //Put size in the constructor
        for (int i = 0; i < size; i++) {
            cases[i] = new LinkedList<>();
        }
    }

    /**
     * a hash function to get address
     * @param key
     * @return
     */
    public int hashFunction(int key){
        return Math.abs(key%cases.length);
    }

    /**
     * add new case in JS class
     * @param item
     * @return
     */
    public int addCase(Case item){
        int key = item.hashCode();
        int index = hashFunction(key);
        cases[index].add(item);
        return index;
    }

    /**
     * display elements in hash
     */
    public void displayHashTable(){
        //Set string return value for service to GUI

        for (int i = 0; i < cases.length; i++) {
            System.out.print("Slot " + i + ": ");
            for (Case item : cases[i]) {
                System.out.print("Case"+item.getCaseNum()+" -> ");
            }
            System.out.println("null");
        }
    }
}
