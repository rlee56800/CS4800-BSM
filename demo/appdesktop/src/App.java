
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.text.Text;
import javafx.scene.text.Font; 
import javafx.scene.text.FontPosture; 
import javafx.scene.text.FontWeight; 
import javafx.stage.Stage;

public class App extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane root = new BorderPane();

        //title
        Text title = new Text();
        title.setText("Bronco Store Management System");
        title.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));

        //button bar + buttons
        Button toCustomer = new Button();
        toCustomer.setText("Customer Registration");
        Button toProduct = new Button();
        toProduct.setText("Product Registration");
        Button toOrder = new Button();
        toOrder.setText("Order Registration");
        Button toReport = new Button();
        toReport.setText("Intelligent Revenue Report");
        ButtonBar btnbar = new ButtonBar();
        btnbar.getButtons().addAll(toCustomer, toProduct, toOrder, toReport);

        //adding objects to the container
        root.setTop(title);
        root.setAlignment(title, Pos.TOP_CENTER);
        root.setCenter(btnbar);
        root.setAlignment(btnbar, Pos.CENTER);

        Scene scene0 = new Scene(root);

        //button functions
        toCustomer.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                customerReg(primaryStage, scene0);
            }
        });
        toProduct.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                productReg(primaryStage, scene0);
            }
        });
        toOrder.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                orderReg(primaryStage, scene0);
            }
        });

        primaryStage.setTitle("Customer Registration");
        primaryStage.setScene(scene0);
        primaryStage.show();
    }

    public static void main(String[] args) throws Exception {
        launch(args);
    }

    //method for switching to customer registration
    public void customerReg(Stage primaryStage, Scene scene0) {
        BorderPane root = new BorderPane();

        //container
        StackPane stackPane = new StackPane();
        //return to home page
        Button backbtn = new Button();
        backbtn.setText("Back");
        backbtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                primaryStage.setScene(scene0);
            }
        });

        //title
        Text title = new Text();
        title.setText("Customer Registration");
        title.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));

        stackPane.getChildren().addAll(backbtn, title);
        stackPane.setAlignment(backbtn, Pos.CENTER_LEFT);

        //container
        GridPane gridPane1 = new GridPane();

        //Left side data entries: user ID, name, email, type
        Text label1 = new Text();
        label1.setText("User ID:");
        GridPane.setConstraints(label1, 0, 0);
        TextField userID = new TextField();
        GridPane.setConstraints(userID, 1, 0);
        Text label2 = new Text();
        label2.setText("Name:");
        GridPane.setConstraints(label2, 0, 1);
        TextField name = new TextField();
        GridPane.setConstraints(name, 1, 1);
        Text label3 = new Text();
        label3.setText("Email:");
        GridPane.setConstraints(label3, 0, 2);  
        TextField email = new TextField();
        GridPane.setConstraints(email, 1, 2);
        Text label4 = new Text();
        label4.setText("Type:");
        GridPane.setConstraints(label4, 0, 3);
        ComboBox type = new ComboBox<Text>();
        GridPane.setConstraints(type, 1, 3);
        type.getItems().add("Professor");
        type.getItems().add("Student");
        type.getItems().add("Both");
        //add to gridPane (mandatory)
        gridPane1.getChildren().addAll(label1, userID, label2, name, label3, email, label4, type);

        //container
        GridPane gridPane2 = new GridPane();

        //Right side
        Text label5 = new Text();
        label5.setText("Notes:");
        GridPane.setConstraints(label5, 0, 0);
        TextField notes = new TextField();
        notes.setPrefSize(150, 150);
        GridPane.setConstraints(notes, 0, 1);
        //add to gridPane (mandatory)
        gridPane2.getChildren().addAll(label5, notes);

        //button bar + buttons
        Button searchbtn = new Button();
        searchbtn.setText("Search");
        Button addbtn = new Button();
        addbtn.setText("Add");
        Button updatebtn = new Button();
        updatebtn.setText("Update");
        Button delbutton = new Button();
        delbutton.setText("Delete");
        ButtonBar btnbar = new ButtonBar();
        btnbar.getButtons().addAll(searchbtn, addbtn, updatebtn, delbutton);
        //button functions
        addbtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                System.out.println("Add");
            }
        });
        updatebtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                System.out.println("Update");
            }
        });

        //adding objects to the container
        root.setTop(stackPane);
        root.setAlignment(stackPane, Pos.TOP_CENTER);
        root.setBottom(btnbar);
        root.setLeft(gridPane1);
        root.setRight(gridPane2);
        root.setMinHeight(300);
        root.setMargin(root, new Insets(10,10,10,10));

        Scene scene1 = new Scene(root);
        primaryStage.setScene(scene1);
    }

    //method for switching to product registration
    public void productReg(Stage primaryStage, Scene scene0) {
        BorderPane root = new BorderPane();

        //container
        StackPane stackPane = new StackPane();
        //return to home page
        Button backbtn = new Button();
        backbtn.setText("Back");
        backbtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                primaryStage.setScene(scene0);
            }
        });
        //title
        Text title = new Text();
        title.setText("Product Registration");
        title.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));

        stackPane.getChildren().addAll(backbtn, title);
        stackPane.setAlignment(backbtn, Pos.CENTER_LEFT);

        //container
        GridPane gridPane1 = new GridPane();

        //Left side data entries: user ID, name, email, type
        Text label1 = new Text();
        label1.setText("Product ID:");
        GridPane.setConstraints(label1, 0, 0);
        TextField productID = new TextField();
        GridPane.setConstraints(productID, 1, 0);
        Text label2 = new Text();
        label2.setText("Name:");
        GridPane.setConstraints(label2, 0, 1);
        TextField name = new TextField();
        GridPane.setConstraints(name, 1, 1);
        Text label3 = new Text();
        label3.setText("Price per Unit:");
        GridPane.setConstraints(label3, 0, 2);  
        TextField price = new TextField();
        GridPane.setConstraints(price, 1, 2);
        Text label4 = new Text();
        label4.setText("Stock:");
        GridPane.setConstraints(label4, 0, 3);
        ComboBox stock = new ComboBox<Text>();
        GridPane.setConstraints(stock, 1, 3);
        stock.getItems().add("50");
        stock.getItems().add("100");
        stock.getItems().add("150");
        //add to gridPane (mandatory)
        gridPane1.getChildren().addAll(label1, productID, label2, name, label3, price, label4, stock);

        //container
        GridPane gridPane2 = new GridPane();

        //Right side
        Text label5 = new Text();
        label5.setText("Notes:");
        GridPane.setConstraints(label5, 0, 0);
        TextField notes = new TextField();
        notes.setPrefSize(150, 150);
        GridPane.setConstraints(notes, 0, 1);
        //add to gridPane (mandatory)
        gridPane2.getChildren().addAll(label5, notes);

        //button bar + buttons
        Button searchbtn = new Button();
        searchbtn.setText("Search");
        Button addbtn = new Button();
        addbtn.setText("Add");
        Button updatebtn = new Button();
        updatebtn.setText("Update");
        Button delbutton = new Button();
        delbutton.setText("Delete");
        ButtonBar btnbar = new ButtonBar();
        btnbar.getButtons().addAll(searchbtn, addbtn, updatebtn, delbutton);
        //button functions
        addbtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                System.out.println("Add");
            }
        });
        updatebtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                System.out.println("Update");
            }
        });

        //adding objects to the container
        root.setTop(stackPane);
        root.setAlignment(stackPane, Pos.TOP_CENTER);
        root.setBottom(btnbar);
        root.setLeft(gridPane1);
        root.setRight(gridPane2);
        root.setMinHeight(300);
        root.setMargin(root, new Insets(10,10,10,10));

        Scene scene2 = new Scene(root);
        primaryStage.setScene(scene2);
    }

    //method for switching to order registration
    public void orderReg(Stage primaryStage, Scene scene0) {
        BorderPane root = new BorderPane();

        //container
        TilePane tilePane = new TilePane();
        //return to home page
        Button backbtn = new Button();
        backbtn.setText("Back");
        backbtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                primaryStage.setScene(scene0);
            }
        });

        //title1
        Text title1 = new Text();
        title1.setText("Order Registration");
        title1.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
        
        //title2
        Text title2 = new Text();
        title2.setText("Product Info");
        title2.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));

        tilePane.getChildren().addAll(backbtn, title1, title2);

        //button bar + buttons for order registration
        Button searchbtn = new Button();
        searchbtn.setText("Search");
        Button addbtn = new Button();
        addbtn.setText("Add");
        Button updatebtn = new Button();
        updatebtn.setText("Update");
        Button delbutton = new Button();
        delbutton.setText("Delete");
        ButtonBar btnbar = new ButtonBar();
        btnbar.getButtons().addAll(searchbtn, addbtn, updatebtn, delbutton);
        //button functions
        addbtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                System.out.println("Add");
            }
        });
        updatebtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                System.out.println("Update");
            }
        });

        //container for button bars
        TilePane stackPane = new TilePane();

        //button bar + buttons for product info
        Button searchbtn1 = new Button();
        searchbtn1.setText("Search");
        Button addbtn1 = new Button();
        addbtn1.setText("Add");
        Button updatebtn1 = new Button();
        updatebtn1.setText("Update");
        Button delbutton1 = new Button();
        delbutton1.setText("Delete");
        ButtonBar btnbar1 = new ButtonBar();
        btnbar1.getButtons().addAll(searchbtn1, addbtn1, updatebtn1, delbutton1);
        //button functions
        addbtn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                System.out.println("Add");
            }
        });
        updatebtn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                System.out.println("Update");
            }
        });

        stackPane.getChildren().addAll(btnbar, btnbar1);

        //adding objects to the container
        root.setTop(tilePane);
        root.setAlignment(tilePane, Pos.TOP_CENTER);
        root.setBottom(stackPane);
        root.setMinHeight(300);

        Scene scene2 = new Scene(root);
        primaryStage.setScene(scene2);
    }
}
