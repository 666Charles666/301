import java.util.LinkedList;
import java.util.List;

public class Case {

    /**
     * Setting a counter facilitates CaseNum generation
     */
    private  int counter = 0;


    private static char identifier = 'A';
    private  int size;
    private char caseNum;
    private String type , lighting;
     List<Tray>[] trays;
    public Case(int size){
        this.size = size;

        this.caseNum = generateCaseNum();
        trays = new List[size];
        for (int i=0;i < size; i++){
            trays[i] = new LinkedList<>();
        }
    }
    /**
     * Generating numbers
     */

    private char generateCaseNum() {
        if (identifier <= 'Y' && identifier >= 'A'){
            return identifier++;
        }else {
            System.out.println("The maximum capacity is exceeded");
            return ' ';
        }
    }
    /**
     * a hash function
     */
    public int hushFunction(int key){
        return Math.abs(key%trays.length);
    }

    /**
     * add a jewelry to store
     * @param item
     * @param type
     * @param lighting
     * @return
     */
    public int addTray(Tray item,String type,String lighting){
        this.lighting = lighting;
        this.type = type;
        int key = item.hashCode();
        int index = hushFunction(key);
        trays[index].add(item);
        size++;
        return index;
    }

    /**
     * display elements in this hash
     */
    public void displayHashTable(){
        for (int i = 0; i < trays.length; i++) {
            System.out.print("Slot " + i + ": ");
            for (Tray item : trays[i]) {
                System.out.print(item + " -> ");
            }
            System.out.println("null");
        }
    }

    /**
     * get and set functions
     * @return
     */
    public String getLighting() {
        return lighting;
    }

    public void setLighting(String lighting) {
        this.lighting = lighting;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public  int getSize() {
        return size;
    }

    public  void setSize(int size) {
        this.size = size;
    }


    public char getCaseNum() {
        return caseNum;
    }

    public void setCaseNum(char caseNum) {
        this.caseNum = caseNum;
    }
    public static char getIdentifier() {
        return identifier;
    }
    public  char getTrayIdentifier(){
        return identifier;
    }
    public int getNextTrayNum(){
        return ++this.counter;
    }

    public static void setIdentifier(char identifier) {
        Case.identifier = identifier;
    }
}
