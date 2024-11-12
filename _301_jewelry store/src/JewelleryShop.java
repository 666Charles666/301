import java.util.LinkedList;
import java.util.List;

/**
 * project structure
 * hash->hash->link
 */
public class JewelleryShop {
    List<Case>[] cases;
    public JewelleryShop(int size){
        cases =new List[size];
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
    public String displayHashTable(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cases.length; i++) {
            sb.append("Slot").append(i).append(":");
            for (Case item : cases[i]) {
                sb.append(item.getCaseNum()).append("->");
            }
            sb.append("null\n");
        }
        return sb.toString();
    }
}
