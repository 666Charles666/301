import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFX_GUI extends Application{
    public static void main(String[] args) {
        Application.launch(args);
    }
//    AnchorPane
    @Override
    public void start(Stage primaryStage) throws Exception {
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
        //------------------------------------------------
        //Home Page
        //------------------------------------------------
        Label title = new Label("Welcome to our jewellery shop !");
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

        //create a new component manager
        VBox mainRoot = new VBox();
        //add the components to the manager
        mainRoot.getChildren().addAll(title,add,search,delete,display);

        //create a new scene,which is the home page of the window
        Scene homePage = new Scene(mainRoot,400,600);

        primaryStage.setScene(homePage);
        primaryStage.show();

        //------------------------------------------------
        //Add Function Page
        //------------------------------------------------


        Label addTitle  = new Label("ADD");
        title.setLayoutX(200);
        title.setLayoutY(100);

        Button add1 = new Button("Add XXX");
        add.setLayoutX(200);
        add.setLayoutY(250);

        Button add2 = new Button("Add XXX");
        add.setLayoutX(200);
        add.setLayoutY(250);

        Button add3 = new Button("Add XX");
        add.setLayoutX(200);
        add.setLayoutY(250);

        Button add4 = new Button("Add XXX");
        add.setLayoutX(200);
        add.setLayoutY(250);

        //create a new component manager
        VBox addRoot = new VBox();
        //add the components to the manager
        addRoot.getChildren().addAll(addTitle,add1,add2,add3,add4,back1);

        //create a new scene,which is the home page of the window
        Scene addPage = new Scene(addRoot,400,600);

        //------------------------------------------------
        //Search Function Page
        //------------------------------------------------


        Label searchTitle  = new Label("SEARCH");
        title.setLayoutX(200);
        title.setLayoutY(100);

        Button search1 = new Button("SEARCH  XXX");
        add.setLayoutX(200);
        add.setLayoutY(250);

        Button search2 = new Button("SEARCH  XXX");
        add.setLayoutX(200);
        add.setLayoutY(250);


        //create a new component manager
        VBox searchRoot = new VBox();
        //add the components to the manager
        searchRoot.getChildren().addAll(searchTitle,search1,search2,back2);

        //create a new scene,which is the home page of the window
        Scene searchPage = new Scene(searchRoot,400,600);

        //------------------------------------------------
        //Delete Function Page
        //------------------------------------------------


        Label deleteTitle  = new Label("DELETE");
        title.setLayoutX(200);
        title.setLayoutY(100);

        Button delete1 = new Button("DELETE XXX");
        add.setLayoutX(200);
        add.setLayoutY(250);

        Button delete2 = new Button("DELETE XXX");
        add.setLayoutX(200);
        add.setLayoutY(250);


        //create a new component manager
        VBox deleteRoot = new VBox();
        //add the components to the manager
        deleteRoot.getChildren().addAll(deleteTitle,delete1,delete2,back3);

        //create a new scene,which is the home page of the window
        Scene deletePage = new Scene(deleteRoot,400,600);

        //------------------------------------------------
        //Display Page
        //------------------------------------------------
        Label displayTitle  = new Label("DELETE");
        title.setLayoutX(200);
        title.setLayoutY(100);

        Button display1 = new Button("DISPLAY XXX");
        add.setLayoutX(200);
        add.setLayoutY(250);

        Button display2 = new Button("VALUE XXX");
        add.setLayoutX(200);
        add.setLayoutY(250);

        //create a new component manager
        VBox displayRoot = new VBox();
        //add the components to the manager
        displayRoot.getChildren().addAll(displayTitle,display1,display2,back4);

        //create a new scene,which is the home page of the window
        Scene displayPage = new Scene(displayRoot,400,600);

        //------------------------------------------------
        //Add listeners
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

    }
}

