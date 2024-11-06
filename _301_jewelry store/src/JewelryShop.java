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
        for (int i = 0; i < cases.length; i++) {
            System.out.print("Slot " + i + ": ");
            for (Case item : cases[i]) {
                System.out.print(item.getCaseNum() + " -> ");
            }
            System.out.println("null");
        }
    }

    /**
     * add new tray in JS class
     * @param caseNum
     */
    public void addTray(int caseNum){

    }

    /**
     * search jewelry
     * @param caseNum
     * @param trayId
     * @param id
     */
    public void jewelrySearch(int caseNum,String trayId,int id){

    }

    /**
     * display all of elements
     */
    public void displayAll(){

    }
}
