import java.util.List;
import java.util.Scanner;

public class Controller {
    int sizeShop = 10;
    JewelleryShop shop = new JewelleryShop(sizeShop);

    /**
     * add new tray in JS class
     * @param caseNum
     */
    public String addTray(int caseNum){
        // Find the corresponding Case
        Case selectedCase = null;
        for (List<Case> caseList : shop.cases) {
            for (Case cases : caseList) {
                if (cases.getCaseNum() == caseNum) {
                    selectedCase = cases;
                    break;
                }
            }
        }
        // If a matching Case is found, a new Tray is created and added to that Case
        if (selectedCase != null) {
            Tray newTray = new Tray(0,"defaultInlay","defaultMaterial","defaultColor",0,0,selectedCase);
            selectedCase.addTray(newTray, "defaultType", "defaultLighting");
            return ("Tray added successfully to case " + selectedCase.getCaseNum());
        } else {
            return ("This case Num is invalid.");
        }
    }


    /**
     * search jewelry
     * @param id
     */
    public Jewellery jewelrySearch(String id){
        char caseChar = id.charAt(0);
        int trayNumber = Integer.parseInt(id.substring(1, 3));
        int jewelleryNumber = Integer.parseInt(id.substring(3));
        Case selectedCase = null;
        for (List<Case> caseList : shop.cases) {
            for (Case cases : caseList) {
                if (cases.getTrayIdentifier() == caseChar) {
                    selectedCase = cases;
                    break;
                }

            }
            if (selectedCase != null) {
                break;
            }
        }
        if (selectedCase == null) {
            System.out.println("Case with this ID does not exist.");
            return null;
        }
        String result = String.valueOf(caseChar) + String.format("%02d", trayNumber);
        Tray selectedTray = null;
        // Find the corresponding tray in the selected case's trays array
        for (int i = 0; i < selectedCase.trays.length; i++) {
            // Get the list of trays in this slot
            List<Tray> trayList = selectedCase.trays[i];
            for (Tray tray : trayList) {
                if (tray.getTrayID().equals(result)){
                    selectedTray = tray;
                    break;
                }
            }
        }
        if (selectedTray == null) {
            System.out.println("Tray with this ID does not exist.");
            return null;
        }

        Jewellery jewellery = selectedTray.searchByJewelleryID(jewelleryNumber);

        if (jewellery == null){
            System.out.println("Jewellery with this id does not exist");
        }else {
            System.out.println("The jewellery with this id is in the " + selectedCase.getCaseNum() + " case,the " + trayNumber + "th tray, and the " + jewelleryNumber + " th jewellery");
            System.out.println("detail for this jewellery:");
            System.out.println(jewellery.toString());
             if (jewellery.size() >= 0) {
                System.out.println("Components for this jewellery:");
                for (List<Components> componentList : jewellery.components) {
                    if (componentList != null) {
                        for (Components component : componentList) {
                            System.out.println(component.toString());
                        }
                    }
                }
            }

        }
        return jewellery;
    }


    /**
     * delete jewellery by id that users input
     * @param id
     * @return
     */
    public boolean deleteJewellery(String id){
        char caseChar = id.charAt(0);
        int trayNumber = Integer.parseInt(id.substring(1, 3));
        int jewelleryNumber = Integer.parseInt(id.substring(3));
        Case selectedCase = null;
        for (List<Case> caseList : shop.cases) {
            for (Case cases : caseList) {
                if (cases.getTrayIdentifier() == caseChar) {
                    selectedCase = cases;
                    break;
                }
                else{
                    System.out.println("It is an invalid id");
                    return false;
                }
            }
        }
        String result = caseChar + String.format("%02d", trayNumber);
        Tray selectedTray = null;
        // Find the corresponding tray in the selected case's trays array
        for (int i = 0; i < selectedCase.trays.length; i++) {
            // Get the list of trays in this slot
            List<Tray> trayList = selectedCase.trays[i];
            for (Tray tray : trayList) {
                if (tray.getTrayID().equals(result)){
                    selectedTray = tray;
                    break;
                }
            }
        }
        if (selectedTray == null) {
            System.out.println("Invalid tray number: " + trayNumber);
            return false;
        }
        Jewellery jewelleryToDelete = selectedTray.searchByJewelleryID(jewelleryNumber);
        if (jewelleryToDelete == null) {
            System.out.println("Jewellery with ID " + jewelleryNumber + " not found in this tray.");
            return false;
        }
        boolean deleteJewellery = selectedTray.deleteJewellery(jewelleryNumber);
        if (deleteJewellery) {
            System.out.println("Jewellery with ID " + id + " successfully deleted.");
            return true;
        } else {
            System.out.println("Failed to delete jewellery with ID " + jewelleryNumber);
            return false;
        }
    }

    /**
     * Add a case by calling it directly
     * @param size
     * @param type
     * @param lighting
     */
    public void addCase(int size,String type,String lighting){
        Case addedCase = new Case(size);
        addedCase.setType(type);
        addedCase.setLighting(lighting);
        shop.addCase(addedCase);
        System.out.println("add the case successfully");
    }

    /**
     * Traverse the case to determine the tray add position and add it
     * @param index
     * @param size
     * @param inlay
     * @param material
     * @param color
     * @param length
     * @param width
     * @param type
     * @param lighting
     * @return
     */
    public String addTray(char index,int size,String inlay,String material,String color,int length,int width,String type,String lighting){
        Case selectedCase = null;
        for (List<Case> caseList : shop.cases) {
            for (Case cases : caseList) {
                if (cases.getCaseNum() == index) {
                    selectedCase = cases;
                    break;
                }
            }
            if (selectedCase != null) {
                break;
            }
        }
        if (selectedCase != null) {
            Tray newTray = new Tray(size, inlay, material, color, length, width, selectedCase);
            selectedCase.addTray(newTray, type, lighting);
            return "Add a new tray to the index case successfully" + index;
        } else {
            return "this index is invalid";
        }
    }

    /**
     * Iterating through the case,tray determines where to add the jewelry and adds it
     * @param caseChar
     * @param trayNumber
     * @param description
     * @param type
     * @param gender
     * @param image
     * @param price
     */
    public void addJewellery(char caseChar,String trayNumber,String description,String type,String gender,String image,String price){
        Case selectedCase = null;
        for (List<Case> caseList : shop.cases) {
            for (Case cases : caseList) {
                if (cases.getCaseNum() == caseChar) {
                    selectedCase = cases;
                    break;
                }

            }
            if (selectedCase != null) {

                break;
            }
        }
        if (selectedCase == null) {
            System.out.println("Case with this ID does not exist.");
            return;
        }
        String result = String.valueOf(caseChar) + String.format("%02d", Integer.parseInt(trayNumber));

        Tray selectedTray = null;
        // Find the corresponding tray in the selected case's trays array
        for (int i = 0; i < selectedCase.trays.length; i++) {
            List<Tray> trayList = selectedCase.trays[i];
            for (Tray tray : trayList) {
                if (tray.getTrayID().equals(result)){
                    selectedTray = tray;
                    break;
                }
            }
            if (selectedTray != null) {
                break;
            }
        }
        if (selectedTray == null) {
            System.out.println("Tray with this ID does not exist.");
            return;
        }

        Jewellery newJewellery = new Jewellery();
        newJewellery.setDescription(description);
        newJewellery.setType(type);
        newJewellery.setTargetGender(gender);
        newJewellery.setImage(image);
        newJewellery.setRetailPrice(price);

        selectedTray.add(newJewellery);
        System.out.println("Jewellery is success to add this Tray " + trayNumber );
    }

    /**
     * add components information
     * @param id
     * @param componentName
     * @param componentDescription
     * @param componentQuantity
     * @param componentQuality
     */
    public void addComponents(String id,String componentName, String componentDescription, String componentQuantity, String componentQuality){
        Components newComponent = new Components(componentName, componentDescription, componentQuantity, componentQuality);
        Jewellery jewellery = jewelrySearch(id);
        if (jewellery == null) {
            System.out.println("Can't find Jewellery with this id.");
            return;
        }
        jewellery.addComponents(newComponent);
        System.out.println("Component added successfully to Jewellery with the id : " + jewellery.getID());
    }
    /**
     * display all elements in this project
     */
    public void displayAll(){
        System.out.println("Case:");
        shop.displayHashTable();
        System.out.println("Tray:");
        for (List<Case> caseList : shop.cases) {
            for (Case cases : caseList) {
                cases.displayHashTable();
                System.out.println("Jewellery:");
                for (List<Tray> trayList : cases.trays){
                        for (Tray tray : trayList){
                            tray.display();
                            }
                        }
                }
            }
        }
    /**
     * text and debug process
     */
//    public static void main(String[] args) {
//        Controller controller = new Controller();
//        controller.addCase(3,"wood","light");
//        controller.addTray('A');
//        controller.addJewellery('A',"01","wood","lock","mail","www","23");
//        controller.addComponents("A011","jewellery","stone","good","best");
//        controller.jewelrySearch("A011");
//        controller.displayAll();
//        controller.deleteJewellery("A011");
//        controller.displayAll();
//    }


}
