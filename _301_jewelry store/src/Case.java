import java.util.LinkedList;
import java.util.List;

public class Case {

    /**
     * Setting a counter facilitates CaseNum generation
     */
    private static int counter = 0;


    //The initial value of "@" is set to ensure that the first Case number added is A
    private static char identifier = '@';
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
        if (identifier <= 'Y' && identifier >= '@'){
            //Always increment before assignment to ensure uniformity
            identifier++;
            char currentChar = identifier;

            return currentChar;
        }else {
            System.out.println("The maximum capacity is exceeded");
            return ' ';
        }
    }
    /**
     * a hash function
     */
    public int hashFunction(int key){
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
        int index = hashFunction(key);
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
                //Solved the problem of garbled output code
                System.out.print("tray"+ item.getTrayID() + " -> ");
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
    public static char getTrayIdentifier(){
        return identifier;
    }
    public  int getNextTrayNum(){
        return ++this.counter;
    }

    public static void setIdentifier(char identifier) {
        Case.identifier = identifier;
    }
}
