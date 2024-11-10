import java.util.List;

public class Controller {
    int sizeShop = 10;
    JewelleryShop shop = new JewelleryShop(sizeShop);

    /**
     * add new tray in JS class
     * @param caseNum
     */
    public void addTray(int caseNum){
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
            Tray newTray = new Tray(1,"defaultInlay","defaultMaterial","defaultColor",0,0,selectedCase);
            selectedCase.addJewellery(newTray, "defaultType", "defaultLighting");
            System.out.println("Tray added successfully to case " + caseNum);
        } else {
            System.out.println("This case Num is invalid.");
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
        String result = caseChar + String.format("%02d", trayNumber);
        Tray selectedTray = null;
        // Find the corresponding tray in the selected case's trays array
        for (int i = 0; i < selectedCase.getSize(); i++) {
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
            System.out.println("Jewelry with this id does not exist");
        }else {
            System.out.println("In the" + selectedCase + "case,the " + trayNumber + "tray, the" + jewelleryNumber + "th jewellery");
            System.out.println(jewellery.toString());
             if (jewellery.size() > 0) {
                System.out.println("Components for the jewellery:");
                for (List<Components> componentList : jewellery.components) {
                    if (componentList != null) {
                        for (Components component : componentList) {
                            // Print each component's
                            System.out.println(component.toString());
                        }
                    }
                }
            }

        }
        return jewellery;
    }


    /**
     * delete jewellery
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
        for (int i = 0; i < selectedCase.getSize(); i++) {
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
            System.out.println("Jewellery with ID " + jewelleryNumber + " successfully deleted.");
            return true;
        } else {
            System.out.println("Failed to delete jewellery with ID " + jewelleryNumber);
            return false;
        }
    }

    /**
     * add case
     */
    public void addCase(int size,String type,String lighting){
        Case addedCase = new Case(size);
        addedCase.setType(type);
        addedCase.setLighting(lighting);
        shop.addCase(addedCase);
    }

    /**
     * add tray in one case
     * @param index
     */
    public void addTray(char index,int size,String inlay,String material,String color,int length,int width,String type,String lighting){
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
            selectedCase.addJewellery(newTray, type, lighting);
            System.out.println("Add a new tray to the index case successfully" + index);
        } else {
            System.out.println("this index is invalid");
        }
    }

    /**
     *
     * @param caseChar
     * @param trayNumber
     */
    public void addJewellery(char caseChar,String trayNumber,String description,String type,String gender,String image,String price){
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
            return;
        }
        String result = caseChar + String.format("%02d", trayNumber);
        Tray selectedTray = null;
        // Find the corresponding tray in the selected case's trays array
        for (int i = 0; i < selectedCase.getSize(); i++) {
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
     * display all of elements
     */
    public void displayAll(){
        System.out.println("Case:");
        shop.displayHashTable();
        System.out.println("Tray:");

    }

}
