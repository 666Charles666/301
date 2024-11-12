import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFX_GUI extends Application{

    public JavaFX_GUI(Controller controller) {
        this.controller = controller;
    }
    public JavaFX_GUI() {
    }
    Controller controller;
    Jewellery jewellery;
    @Override
    public void start(Stage primaryStage) throws Exception {
        Controller controller = new Controller();
        //button to return to home page
        Button back1 = new Button("Back");
        back1.setLayoutY(400);
        back1.setLayoutX(300);
        Button back2 = new Button("Back");
        back2.setLayoutY(400);
        back2.setLayoutX(300);
        Button back3 = new Button("Back");
        back3.setLayoutY(400);
        back3.setLayoutX(300);
        Button back4 = new Button("Back");
        back4.setLayoutY(400);
        back4.setLayoutX(300);
        Button back5 = new Button("Back");
        back4.setLayoutY(400);
        back4.setLayoutX(300);
        Button back6 = new Button("Back");
        back4.setLayoutY(400);
        back4.setLayoutX(300);
        Button back7 = new Button("Back");
        back4.setLayoutY(400);
        back4.setLayoutX(300);
        Button back8 = new Button("Back");
        back4.setLayoutY(400);
        back4.setLayoutX(300);
        Button back9 = new Button("Back");
        back4.setLayoutY(400);
        back4.setLayoutX(300);
        Button back10 = new Button("Back");
        back4.setLayoutY(400);
        back4.setLayoutX(300);
        Button back11 = new Button("Back");
        back4.setLayoutY(400);
        back4.setLayoutX(300);
        Button back12 = new Button("Back");
        back4.setLayoutY(400);
        back4.setLayoutX(300);
        Button back13 = new Button("Back");
        back4.setLayoutY(400);
        back4.setLayoutX(300);
        Button back14 = new Button("Back");
        back4.setLayoutY(400);
        back4.setLayoutX(300);
        //------------------------------------------------
        //Home Page
        //------------------------------------------------
        Label title = new Label("Welcome to our jewellery shop !");
        title.setStyle("-fx-font-size: 20; -fx-font-weight: bold; -fx-text-fill: #333;");
        title.setLayoutX(200);
        title.setLayoutY(100);

        // Add function button
        Button add = new Button("Add Something");
        add.setLayoutX(200);
        add.setLayoutY(250);

        // Search function button
        Button search = new Button("Search Something");
        search.setLayoutX(200);
        search.setLayoutY(300);

        //delete function button
        Button delete = new Button("Delete Something");
        delete.setLayoutX(200);
        delete.setLayoutY(350);

        Button display = new Button("display all stuff");
        display.setLayoutX(200);
        display.setLayoutY(400);

        Button save = new Button("SAVE");
        display.setLayoutX(200);
        display.setLayoutY(400);

        Button load = new Button("LOAD");
        display.setLayoutX(200);
        display.setLayoutY(400);

        //create a new component manager
        VBox mainRoot = new VBox();
        mainRoot.setAlignment(Pos.CENTER);
        mainRoot.setSpacing(10);


        //add the components to the manager
        mainRoot.getChildren().addAll(title,add,search,delete,display);

        //create a new scene,which is the home page of the window
        Scene homePage = new Scene(mainRoot,400,400);

        primaryStage.setScene(homePage);
        primaryStage.show();







        //------------------------------------------------
        //Add Function Page
        //------------------------------------------------


        Label addTitle  = new Label("ADD");
        title.setLayoutX(200);
        title.setLayoutY(100);

        Button addCase = new Button("Add case");
        add.setLayoutX(200);
        add.setLayoutY(250);

        Button addTray = new Button("Add NewTray 1");
        add.setLayoutX(200);
        add.setLayoutY(250);

        Button addTray1 = new Button("Add NewTray 2");
        add.setLayoutX(200);
        add.setLayoutY(250);

        Button addNewComponent = new Button("Add new component");
        add.setLayoutX(200);
        add.setLayoutY(250);

        Button addJewellery = new Button("Add jewellery");
        add.setLayoutX(200);
        add.setLayoutY(250);



        //create a new component manager
        VBox addRoot = new VBox();
        addRoot.setAlignment(Pos.CENTER);
        addRoot.setSpacing(10);
        //add the components to the manager
        addRoot.getChildren().addAll(addTitle,addTray,addTray1,addNewComponent,addJewellery,addCase,back1);

        //create a new scene,which is the home page of the window
        Scene addPage = new Scene(addRoot,400,400);

        //------------------------------------------------
        //Search Function Page
        //------------------------------------------------


        Label searchTitle  = new Label("SEARCH");
        title.setLayoutX(200);
        title.setLayoutY(100);

        Button searchJewellery = new Button("SEARCH  Jewellery");
        add.setLayoutX(200);
        add.setLayoutY(250);

        //create a new component manager
        VBox searchRoot = new VBox();
        searchRoot.setAlignment(Pos.CENTER);
        searchRoot.setSpacing(10);
        //add the components to the manager
        searchRoot.getChildren().addAll(searchTitle,searchJewellery,back2);

        //create a new scene,which is the home page of the window
        Scene searchPage = new Scene(searchRoot,400,400);

        //------------------------------------------------
        //Delete Function Page
        //------------------------------------------------


        Label deleteTitle  = new Label("DELETE");
        title.setLayoutX(200);
        title.setLayoutY(100);

        Button deleteJ = new Button("DELETE Jewellery");
        add.setLayoutX(200);
        add.setLayoutY(250);


        //create a new component manager
        VBox deleteRoot = new VBox();
        deleteRoot.setAlignment(Pos.CENTER);
        deleteRoot.setSpacing(10);
        //add the components to the manager
        deleteRoot.getChildren().addAll(deleteTitle,deleteJ,back3);

        //create a new scene,which is the home page of the window
        Scene deletePage = new Scene(deleteRoot,400,400);

        //------------------------------------------------
        //Delete Page
        //------------------------------------------------
        Label deleteLabel = new Label("Delete a jewellery");

        TextField deleteID = new TextField();

        TextArea deleteResult = new TextArea();
        deleteResult.setEditable(false);

        Button DELETE = new Button("DELETE");

        Button deleteOneMore = new Button("Delete one more jewellery");

        VBox deletePageRoot = new VBox();
        deletePageRoot.setAlignment(Pos.CENTER); // 设置VBox中的内容居中
        deletePageRoot.setSpacing(10); // 设置组件之间的间距
        deletePageRoot.getChildren().addAll(deleteLabel,deleteID,deleteResult,deleteOneMore,back12,DELETE);

        Scene deletePage1 = new Scene(deletePageRoot,400,400);
        //------------------------------------------------
        //Search Page
        //------------------------------------------------
        Label searchJ = new Label();

        TextField id = new TextField();

        TextArea searchResult = new TextArea();
        searchResult.setEditable(false);


        Button searchExecute = new Button();
        Button searchAgain = new Button();

        VBox searchFRoot = new VBox();
        searchFRoot.setAlignment(Pos.CENTER); // 设置VBox中的内容居中
        searchFRoot.setSpacing(10); // 设置组件之间的间距
        searchFRoot.getChildren().addAll(searchJ,id,searchResult,searchAgain,back11,searchExecute);

        Scene searchFPage = new Scene(searchFRoot,400,400);

        //------------------------------------------------
        //Display Page
        //------------------------------------------------
        Label displayTitle  = new Label("DISPLAY");
        title.setLayoutX(200);
        title.setLayoutY(100);

        Button displayAll = new Button("DISPLAY all");
        add.setLayoutX(200);
        add.setLayoutY(250);


        //create a new component manager
        VBox displayRoot = new VBox();
        displayRoot.setAlignment(Pos.CENTER); // 设置VBox中的内容居中
        displayRoot.setSpacing(10); // 设置组件之间的间距
        //add the components to the manager
        displayRoot.getChildren().addAll(displayTitle,displayAll,back4);

        //create a new scene,which is the home page of the window
        Scene displayPage = new Scene(displayRoot,400,400);

        TextArea displayArea = new TextArea();
        displayArea.setEditable(false);
        VBox displayRoot1 = new VBox();
        displayRoot1.setAlignment(Pos.CENTER); // 设置VBox中的内容居中
        displayRoot1.setSpacing(10); // 设置组件之间的间距
        displayRoot1.getChildren().addAll(displayArea,back10);

        Scene displayPage1 = new Scene(displayRoot1,400,400);

        //-------------------------------------------------------
        //Add New Tray Page   NO.1
        //-------------------------------------------------------
        Label label = new Label("Add a new tray into the case");
        TextField newTrayInput = new TextField();
        newTrayInput.setPromptText("case Num,such as 'A', 'B'...");

        TextArea newTrayOutput = new TextArea();

        //out put can't be changed
        newTrayOutput.setEditable(false);

        Button addNewTrayClearButton = new Button("add one more");

        VBox addTrayRoot = new VBox();
        addTrayRoot.setAlignment(Pos.CENTER); // 设置VBox中的内容居中
        addTrayRoot.setSpacing(10); // 设置组件之间的间距
        addTrayRoot.getChildren().addAll(label,newTrayInput,newTrayOutput,addNewTrayClearButton,back5);

        Scene addTrayPage = new Scene(addTrayRoot,400,400);

        //-----------------------------------------------------------
        //Add New Tray Page No.2 user can define the tray by themselves
        //------------------------------------------------
        Label newTrayLabel = new Label("Add a new tray into the case");

        TextField newTrayCaseNum = new TextField();
        newTrayCaseNum.setPromptText("case Num,such as 'A', 'B'...");

        TextField newTraySize = new TextField();
        newTraySize.setPromptText("case size");

        TextField newTrayInlay = new TextField();
        newTrayInlay.setPromptText("inlay");

        TextField newTrayMaterial = new TextField();
        newTrayMaterial.setPromptText("material");

        TextField newTrayColor = new TextField();
        newTrayColor.setPromptText("color");

        TextField newTrayLength = new TextField();
        newTrayLength.setPromptText("length");

        TextField newTrayWidth = new TextField();
        newTrayWidth.setPromptText("width");

        TextField newTrayType = new TextField();
        newTrayType.setPromptText("type,such as wall-mounted");

        TextField newTrayLighting = new TextField();
        newTrayLighting.setPromptText("lighting");

        Button addNewTrayClearButton1 = new Button("add one more");

        TextArea newTrayOutput1 = new TextArea();
        newTrayOutput1.setEditable(false);

        Button ADD = new Button("ADD");

        VBox addTrayRoot1 = new VBox();
        addTrayRoot1.setAlignment(Pos.CENTER); // 设置VBox中的内容居中
        addTrayRoot1.setSpacing(10); // 设置组件之间的间距
        addTrayRoot1.getChildren().addAll(newTrayLabel,newTrayCaseNum,newTraySize,newTrayInlay,newTrayMaterial,newTrayColor,newTrayLength,newTrayWidth,newTrayLighting,newTrayType,addNewTrayClearButton1,newTrayOutput1,back6);

        Scene addTrayPage1 = new Scene(addTrayRoot1,400,400);

        //------------------------------------------------
        //Add CasePage
        //------------------------------------------------
        Label newCaseLabel = new Label("Add a new case");

        TextField newCaseSize = new TextField();
        newTraySize.setPromptText("case size");

        TextField newCaseType = new TextField();
        newTrayType.setPromptText("type,such as wall-mounted");

        TextField newCaseLighting = new TextField();
        newTrayLighting.setPromptText("lighting");

        Button addNewCaseClearButton = new Button("add one more");

        TextArea newCaseOutput = new TextArea();
        newCaseOutput.setEditable(false);

        Button addCase1= new Button("ADD");

        VBox addCaseRoot = new VBox();
        addCaseRoot.setAlignment(Pos.CENTER); // 设置VBox中的内容居中
        addCaseRoot.setSpacing(10); // 设置组件之间的间距
        addCaseRoot.getChildren().addAll(newCaseLabel,newCaseSize,newCaseType,newCaseLighting,addNewCaseClearButton,addCase1,back7);

        Scene addNewCasePage = new Scene(addCaseRoot,400,400);

        //------------------------------------------------
        //Add Jewellery Page
        //------------------------------------------------
        Label newJ = new Label("Add a new Jewellery into the tray");

        TextField newCaseID = new TextField();
        newTrayCaseNum.setPromptText("case Num,such as 'A', 'B'...");

        TextField newTrayID = new TextField();
        newTraySize.setPromptText("tray ID");

        TextField newJDescription = new TextField();
        newTrayInlay.setPromptText("description");

        TextField newJType = new TextField();
        newTrayType.setPromptText("type");

        TextField newJGender = new TextField();
        newTrayLighting.setPromptText("lighting");

        TextField newJImage = new TextField();
        newTrayLighting.setPromptText("img url");

        TextField newJPrice = new TextField();
        newTrayLighting.setPromptText("price");

        Button addNewJClearButton = new Button("add one more");

        TextArea newJOutput = new TextArea();
        newTrayOutput1.setEditable(false);

        Button ADDJewellery = new Button("ADD");

        VBox addJRoot = new VBox();
        addJRoot.setAlignment(Pos.CENTER); // 设置VBox中的内容居中
        addJRoot.setSpacing(10); // 设置组件之间的间距
        addJRoot.getChildren().addAll(newJ,newCaseID,newTrayID,newJDescription,newJType,newJGender,newJImage,newJPrice,addNewJClearButton,newJOutput,ADDJewellery,back8);

        Scene addJPage = new Scene(addJRoot,400,400);

        //------------------------------------------------
        //Add ComponentPage
        //------------------------------------------------

        Label newComLabel = new Label("Add a new case");

        TextField newComId = new TextField();
        newTraySize.setPromptText("jewellery id");

        TextField newComName = new TextField();
        newTrayType.setPromptText("component name");

        TextField newComDes = new TextField();
        newTrayLighting.setPromptText("component description");

        TextField newComQuan = new TextField();
        newTrayLighting.setPromptText("component quantity");

        TextField newComQua = new TextField();
        newTrayLighting.setPromptText("component quality");

        Button addNewComClearButton = new Button("add one more");

        TextArea newComOutput = new TextArea();
        newCaseOutput.setEditable(false);

        Button addCom= new Button("ADD");

        VBox addComRoot = new VBox();
        addComRoot.setAlignment(Pos.CENTER); // 设置VBox中的内容居中
        addComRoot.setSpacing(10); // 设置组件之间的间距
        addComRoot.getChildren().addAll(newComLabel,newComId,newComName,newComDes,newComQua,newComQuan,addNewComClearButton,newComOutput,addCom,back9);

        Scene addNewComPage = new Scene(addComRoot,400,400);
        //------------------------------------------------
        //Add listeners

        //------------------------------------------------
        //home page actions
        //------------------------------------------------

        add.setOnAction(e -> {
            primaryStage.setScene(addPage);
        });
        search.setOnAction(e -> {
            primaryStage.setScene(searchPage);
        });
        delete.setOnAction(e -> {
            primaryStage.setScene(deletePage);
        });
        display.setOnAction(e -> {
            primaryStage.setScene(displayPage);
        });

        addTray.setOnAction(e -> {
            primaryStage.setScene(addTrayPage);
        });
        addTray1.setOnAction(e -> {
            primaryStage.setScene(addTrayPage1);
        });
        addNewComponent.setOnAction(e -> {
            primaryStage.setScene(addNewComPage);
        });
        addJewellery.setOnAction(e ->{
            primaryStage.setScene(addJPage);
        });
        addCase.setOnAction(e-> {
            primaryStage.setScene(addNewCasePage);
        });
        searchJewellery.setOnAction(e -> {
            primaryStage.setScene(searchFPage);
        });
        deleteJ.setOnAction(e -> {
            primaryStage.setScene(deletePage1);
        });
        //-------------------------------------------------
        //Delete Page actions
        //-------------------------------------------------
        DELETE.setOnAction(e -> {

           boolean BooleanDeleteResult =  controller.deleteJewellery(deleteID.getText());
           if (BooleanDeleteResult){
               deleteResult.appendText("delete successful");
           }
           else deleteResult.appendText("delete failed");
        });
        deleteOneMore.setOnAction(e -> {
            deleteID.clear();
            deleteResult.clear();
        });

        //-------------------------------------------------
        //Display Page actions
        //-------------------------------------------------
        display.setOnAction(e -> {
            primaryStage.setScene(displayPage1);
            displayArea.appendText(controller.displayAll());
        });



        //-------------------------------------------------
        //Search Page actions
        //-------------------------------------------------
        searchExecute.setOnAction(e -> {
            String JID = id.getText();
            jewellery = controller.jewelrySearch(JID);
            searchResult.appendText(jewellery.toString());
        });
        searchAgain.setOnAction(e ->{
            id.clear();
            searchResult.clear();
        });

        //------------------------------------------------
        //add component page actions
        //------------------------------------------------
        addCom.setOnAction(e -> {
            String comId = newComId.getText();
            String name = newComName.getText();
            String des = newComDes.getText();
            String quan = newComQuan.getText();
            String qua = newComQua.getText();
            newComOutput.appendText(controller.addComponents(comId,name,des,quan,qua));
        });
        addNewComClearButton.setOnAction(e -> {
            newComId.clear();
            newComName.clear();
            newComDes.clear();
            newComQuan.clear();
            newComQua.clear();
        }
        );


        //-------------------------------------------------
        //addCasePage actions
        //-------------------------------------------------
        addCase1.setOnAction(e -> {
            int size = Integer.valueOf(newCaseSize.getText());
            String type = newCaseType.getText();
            String lighting = newCaseLighting.getText();

            newCaseOutput.appendText(controller.addCase(size,type,lighting));

        });
        addNewCaseClearButton.setOnAction(e -> {
            newCaseSize.clear();
            newCaseType.clear();
            newCaseLighting.clear();
        });

        //-------------------------------------------------
        //addTrayPage actions
        //-------------------------------------------------
        newTrayInput.setOnAction(e -> {
            String input = newTrayInput.getText();
            int caseNum = Integer.valueOf(input);
            newTrayOutput.appendText(controller.addTray(caseNum));
        });

        //-------------------------------------------------
        //addCasePage actions
        //-------------------------------------------------
         addNewJClearButton.setOnAction(e -> {
             char caseID = newCaseID.getText().charAt(0);
             String trayID = newTrayID.getText();
             String description = newJDescription.getText();
             String type = newJType.getText();
             String gender = newJGender.getText();
             String img = newJImage.getText();
             String price = newJPrice.getText();
             newJOutput.appendText(controller.addJewellery(caseID,trayID,description,type,gender,img,price));

         });
         addNewJClearButton.setOnAction(e -> {
             newCaseID.clear();
             newTrayID.clear();
             newJDescription.clear();
             newJType.clear();
             newJGender.clear();
             newJImage.clear();
             newJPrice.clear();
         });




        //-------------------------------------------------
        //addTrayPage1  actions
        //-------------------------------------------------
        addNewTrayClearButton1.setOnAction(e ->{
            newTraySize.clear();
            newTrayCaseNum.clear();
            newTrayInlay.clear();
            newTrayMaterial.clear();
            newTrayColor.clear();
            newTrayLength.clear();
            newTrayWidth.clear();
            newTrayType.clear();
            newTrayLighting.clear();
        });
        ADD.setOnAction(e -> {
            int size = Integer.valueOf(newTraySize.getText());
            char caseNum = newTrayCaseNum.getText().charAt(0);
            String inlay = newTrayInlay.getText();
            String material = newTrayMaterial.getText();
            String color = newTrayColor.getText();
            int length =Integer.valueOf( newTrayLength.getText());
            int width =Integer.valueOf( newTrayWidth.getText());
            String type = newTrayType.getText();
            String lighting = newTrayLighting.getText();
            newTrayOutput1.appendText(controller.addTray(caseNum,size,inlay,material,color,length,width,type,lighting));
        });
        //-------------------------------------------------
        //SAVE button actions
        //-------------------------------------------------
        save.setOnAction(e -> {
            controller.save();
        });

        //-------------------------------------------------
        //LOAD button actions
        //-------------------------------------------------
        load.setOnAction(e -> {loadController();});



        //-------------------------------------------------
        //back button actions
        //-------------------------------------------------
        back1.setOnAction(e -> {
            primaryStage.setScene(homePage);
        });
        back2.setOnAction(e -> {
            primaryStage.setScene(homePage);
        });
        back3.setOnAction(e -> {
            primaryStage.setScene(homePage);
        });
        back4.setOnAction(e -> {
            primaryStage.setScene(homePage);
        });
        back5.setOnAction(e -> {
            primaryStage.setScene(addPage);
        });
        back6.setOnAction(e -> {
            primaryStage.setScene(addPage);
        });
        back7.setOnAction(e -> {
            primaryStage.setScene(addPage);
        });
        back8.setOnAction(e -> {
            primaryStage.setScene(addPage);
        });
        back9.setOnAction(e -> {
            primaryStage.setScene(addPage);
        });
        back10.setOnAction(e -> {
            primaryStage.setScene(displayPage);
        });
        back11.setOnAction(e -> {
            primaryStage.setScene(searchPage);
        });
        back12.setOnAction(e -> {
            primaryStage.setScene(deletePage);
        });
    }
    private void loadController() {
        Controller newController =(Controller)controller.load();
        this.controller = newController;
    }

}
