import java.util.ArrayList;
import java.util.Arrays;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

public class NewWindow
{
	public Scene BroncoID(Stage primaryStage, Cart cart)
	{
        primaryStage.setTitle("LOG IN TO CPP");
        
		
	
		GridPane grid = new GridPane();
		grid.getColumnConstraints().add(new ColumnConstraints(150));
		grid.setPadding(new Insets(20,20,20,20));
		grid.setVgap(8);
		grid.setHgap(10);
		grid.setAlignment(Pos.CENTER);
		
		
		Label username = new Label("BroncoID (Enter anything): ");
		username.setTextFill(Color.WHITE);
		username.setFont(new Font("Times New Roman",15));
		grid.add(username, 0, 0, 1, 1);
		TextField id = new TextField();
		id.setPromptText("BrocoID");
		id.setStyle("-fx-border-color: GREEN; -fx-border-width: 2px;");
		grid.add(id, 0, 1, 1, 1);
		
		
		Label password = new Label("Password (Enter anything): ");
		password.setTextFill(Color.WHITE);
		password.setFont(new Font("Times New Roman",15));
		grid.add(password, 0, 2,1,1);
		PasswordField pw = new PasswordField();
		pw.setPromptText("Password");
		pw.setStyle("-fx-border-color: GREEN; -fx-border-width: 2px;");
		grid.add(pw, 0, 3,1,1);
		
		
		Button button = new Button("Next");
		grid.add(button, 0, 5,1,1);
		GridPane.setHalignment(button, HPos.CENTER);
		button.setMinSize(70,20);
		button.setStyle("-fx-border-color: WHITE; -fx-text-fill: BLACK;");
		button.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle (ActionEvent event)
			{
				try {
				//	cart.getCustomer().setBroncoID(Integer.parseInt(id.getText()));
				//	cart.getCustomer().getInfoFromDBC();
					//the point of these would-be connections would be to pull a boolean from the database which would decide if a user was a teacher or student.
					primaryStage.setScene(ordersList(primaryStage, cart));   
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println("IN BRONCOID");//check if fail
					e.printStackTrace();
				}
				
			}
		});
		
		
		Scene scene = new Scene(grid, 400, 300);
		
		
		BackgroundFill bf = new BackgroundFill(Color.ROYALBLUE, CornerRadii.EMPTY, Insets.EMPTY);
		Background bg = new Background(bf);
		grid.setBackground(bg);
		
	
		primaryStage.setScene(scene);
		primaryStage.show();
		
		return scene;
	}

    @SuppressWarnings("static-access")
	public Scene selectItems(Stage primaryStage, Cart cart) throws Exception
	{
		
		
		primaryStage.setTitle("Item shop");
		
		
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(20,20,20,20));
		grid.setVgap(8);
		grid.setHgap(10);
		grid.setAlignment(Pos.CENTER);
		
		grid.setGridLinesVisible(false);
		
		
		Text text = new Text("Select your items:");
		text.setFont(Font.font("Times New Roman",25));
		text.setFill(Color.WHITE);
		grid.add(text, 0, 0, 4, 1);
		
		Text select = new Text("Select: ");
		select.setFont(Font.font("Times New Roman",15));
		select.setFill(Color.WHITE);
		grid.add(select, 0, 1, 1, 1);
			
		Text fee = new Text("Name: ");
		fee.setFont(Font.font("Times New Roman",15));
		fee.setFill(Color.WHITE);
		grid.add(fee, 1, 1, 1, 1);
			
		Text description = new Text("Price: ");
		description.setFont(Font.font("Times New Roman",15));
		description.setFill(Color.WHITE);
		grid.add(description, 2, 1, 1, 1);
			
		Text valid = new Text("Item ID: ");
		valid.setFont(Font.font("Times New Roman",15));
		valid.setFill(Color.WHITE);
		grid.add(valid, 3, 1, 1, 1);


        Button next = new Button("Next");
        grid.add(next, 3, 6, 1, 1);
        next.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle (ActionEvent event) { 
                try {
                        primaryStage.setScene(reviewPurchase(primaryStage, cart));
                    } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
		
      

        //These hard coded items would be replaced by database pulls for certain items if given more time.
        Item item1 = new Item();
        Item item2 = new Item();
        Item item3 = new Item();
        item1.setItemID("1");
        item1.setPrice(40);
        item1.setName("Hoodie");
        item2.setItemID("2");
        item2.setPrice(7);
        item2.setName("Charging Cable");
        item3.setItemID("3");
        item3.setPrice(2);
        item3.setName("Bottled Water");

        System.out.println(item1.getItemID() + " " + item1.getPrice() + " " + item1.getName());

        Text item1Name = new Text (item1.getName());
        item1Name.setFont(Font.font("Times New Roman",15));
		item1Name.setFill(Color.WHITE);
		grid.add(item1Name, 1, 2, 1, 1);//set on grid

       
        Text item1Price = new Text (String.valueOf(item1.getPrice()));
        item1Price.setFont(Font.font("Times New Roman",15));
		item1Price.setFill(Color.WHITE);
		grid.add(item1Price, 2, 2, 1, 1);

        Text item1ID = new Text (item1.getItemID());
        item1ID.setFont(Font.font("Times New Roman", 15));
        item1ID.setFill(Color.WHITE);
        grid.add(item1ID, 3, 2, 1, 1);

        Text item2Name = new Text (item2.getName());
        item2Name.setFont(Font.font("Times New Roman",15));
		item2Name.setFill(Color.WHITE);
		grid.add(item2Name, 1, 3, 1, 1);

        Text item2Price = new Text (String.valueOf(item2.getPrice()));
        item2Price.setFont(Font.font("Times New Roman",15));
		item2Price.setFill(Color.WHITE);
		grid.add(item2Price, 2, 3, 1, 1);

        Text item2ID = new Text (item2.getItemID());
        item2ID.setFont(Font.font("Times New Roman", 15));
        item2ID.setFill(Color.WHITE);
        grid.add(item2ID, 3, 3, 1, 1);

        Text item3Name = new Text (item3.getName());
        item3Name.setFont(Font.font("Times New Roman",15));
		item3Name.setFill(Color.WHITE);
		grid.add(item3Name, 1, 4, 1, 1);

        Text item3Price = new Text (String.valueOf(item3.getPrice()));
        item3Price.setFont(Font.font("Times New Roman",15));
		item3Price.setFill(Color.WHITE);
		grid.add(item3Price, 2, 4, 1, 1);

        Text item3ID = new Text (item3.getItemID());
        item3ID.setFont(Font.font("Times New Roman", 15));
        item3ID.setFill(Color.WHITE);
        grid.add(item3ID, 3, 4, 1, 1);


        final ToggleGroup options = new ToggleGroup();
			
			RadioButton item1button = new RadioButton("1");
			RadioButton item2button = new RadioButton("2");
			RadioButton item3button = new RadioButton("3");
			item1button.setToggleGroup(options);
			item2button.setToggleGroup(options);
			item3button.setToggleGroup(options);
			item1button.setSelected(true);
			grid.add(item1button, 0, 2, 1, 1);
			grid.add(item2button, 0, 3, 1, 1);
			grid.add(item3button, 0, 4, 1, 1);
			
           
            Button button = new Button("Add to cart");
           
           

            String Value1ID = item1.getItemID();
            int Value1P = item1.getPrice();
            String Value1N = item1.getName();
            String Value2ID = item2.getItemID();
            int Value2P = item2.getPrice();
            String Value2N = item2.getName();
            String Value3ID = item3.getItemID();
            int Value3P = item3.getPrice();
            String Value3N = item3.getName();
            System.out.println(cart.getOrder().order.size());

            int entry1 = 0;
            int entry2 = 1;
            int entry3 = 2;
            int entry4 = 3;
            int entry5 = 4;


            if (cart.getOrder().order.size() == 1){
                Item item = cart.getOrder().order.get(entry1);
                Text item1show = new Text ("Item 1: " + item.getName());
                item1show.setFont(Font.font("Times New Roman",15));
                item1show.setFill(Color.WHITE);
                grid.add(item1show, 0, 7, 1, 1);
            }
            else if (cart.getOrder().order.size() == 2){
                Item product = cart.getOrder().order.get(entry1);
                Text item1show = new Text ("Item 1: " + product.getName());
                item1show.setFont(Font.font("Times New Roman",15));
                item1show.setFill(Color.WHITE);
                grid.add(item1show, 0, 7, 1, 1);

                Item product2 = cart.getOrder().order.get(entry2);
                Text item2show = new Text ("Item 2: " + product2.getName());
                item2show.setFont(Font.font("Times New Roman",15));
                item2show.setFill(Color.WHITE);
                grid.add(item2show, 0, 8, 1, 1);
            }
           
            else if (cart.getOrder().order.size() == 3){
                Item product = cart.getOrder().order.get(entry1);
                Text item1show = new Text ("Item 1: " + product.getName());
                item1show.setFont(Font.font("Times New Roman",15));
                item1show.setFill(Color.WHITE);
                grid.add(item1show, 0, 7, 1, 1);

                Item product2 = cart.getOrder().order.get(entry2);
                Text item2show = new Text ("Item 2: " + product2.getName());
                item2show.setFont(Font.font("Times New Roman",15));
                item2show.setFill(Color.WHITE);
                grid.add(item2show, 0, 8, 1, 1);

                Item product3 = cart.getOrder().order.get(entry3);
                Text item3show = new Text ("Item 3: " + product3.getName());
                item3show.setFont(Font.font("Times New Roman",15));
                item3show.setFill(Color.WHITE);
                grid.add(item3show, 0, 9, 1, 1);
            }

            else if (cart.getOrder().order.size() == 4){
                Item product = cart.getOrder().order.get(entry1);
                Text item1show = new Text ("Item 1: " + product.getName());
                item1show.setFont(Font.font("Times New Roman",15));
                item1show.setFill(Color.WHITE);
                grid.add(item1show, 0, 7, 1, 1);

                Item product2 = cart.getOrder().order.get(entry2);
                Text item2show = new Text ("Item 2: " + product2.getName());
                item2show.setFont(Font.font("Times New Roman",15));
                item2show.setFill(Color.WHITE);
                grid.add(item2show, 0, 8, 1, 1);

                Item product3 = cart.getOrder().order.get(entry3);
                Text item3show = new Text ("Item 3: " + product3.getName());
                item3show.setFont(Font.font("Times New Roman",15));
                item3show.setFill(Color.WHITE);
                grid.add(item3show, 0, 9, 1, 1);

                Item product4 = cart.getOrder().order.get(entry4);
                Text item4show = new Text ("Item 4: " + product4.getName());
                item4show.setFont(Font.font("Times New Roman",15));
                item4show.setFill(Color.WHITE);
                grid.add(item4show, 0, 10, 1, 1);

            }

            else if (cart.getOrder().order.size() == 5){
                Item product = cart.getOrder().order.get(entry1);
                Text item1show = new Text ("Item 1: " + product.getName());
                item1show.setFont(Font.font("Times New Roman",15));
                item1show.setFill(Color.WHITE);
                grid.add(item1show, 0, 7, 1, 1);

                Item product2 = cart.getOrder().order.get(entry2);
                Text item2show = new Text ("Item 2: " + product2.getName());
                item2show.setFont(Font.font("Times New Roman",15));
                item2show.setFill(Color.WHITE);
                grid.add(item2show, 0, 8, 1, 1);

                Item product3 = cart.getOrder().order.get(entry3);
                Text item3show = new Text ("Item 3: " + product3.getName());
                item3show.setFont(Font.font("Times New Roman",15));
                item3show.setFill(Color.WHITE);
                grid.add(item3show, 0, 9, 1, 1);

                Item product4 = cart.getOrder().order.get(entry4);
                Text item4show = new Text ("Item 4: " + product4.getName());
                item4show.setFont(Font.font("Times New Roman",15));
                item4show.setFill(Color.WHITE);
                grid.add(item4show, 0, 10, 1, 1);

                Item product5 = cart.getOrder().order.get(entry5);
                Text item5show = new Text ("Item 4: " + product5.getName());
                item5show.setFont(Font.font("Times New Roman",15));
                item5show.setFill(Color.WHITE);
                grid.add(item5show, 0, 11, 1, 1);

            }



           


            if (cart.getOrder().order.size() < 6){
                grid.add(button, 0, 6, 1, 1);
                button.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle (ActionEvent event) { 
					try {
						if (item1button.isSelected()) {
                            Item i = new Item();
                            i.setItemID(Value1ID);
                            i.setPrice(Value1P);
                            i.setName(Value1N);
                            System.out.println(i.getItemID() + " " + i.getPrice() + " " + i.getName());
                            cart.getOrder().addItem(i);
                            primaryStage.setScene(selectItems(primaryStage, cart));
                        }
                        else if (item2button.isSelected()){
                            Item i = new Item();
                            i.setItemID(Value2ID);
                            i.setPrice(Value2P);
                            i.setName(Value2N);
                            System.out.println(i.getItemID() + " " + i.getPrice() + " " + i.getName());
                            cart.getOrder().addItem(i);
                            primaryStage.setScene(selectItems(primaryStage, cart));
                        }
                        else if (item3button.isSelected()){
                            Item i = new Item();
                            i.setItemID(Value3ID);
                            i.setPrice(Value3P);
                            i.setName(Value3N);
                            System.out.println(i.getItemID() + " " + i.getPrice() + " " + i.getName());
                            cart.getOrder().addItem(i);
                            primaryStage.setScene(selectItems(primaryStage, cart));
                        }
					
                    } catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
            });
            }
            else {
                Text size = new Text ("Order is too big");
                size.setFont(Font.font("Times New Roman",15));
                size.setFill(Color.WHITE);
                grid.add(button, 0, 6, 1, 1);
            }

            ChoiceBox<Integer> chooseRemove = new ChoiceBox<>();
            grid.add(chooseRemove, 1, 6, 1, 1);

            if (cart.getOrder().order.size() == 1){
                chooseRemove.getItems().addAll(1);
            }
	        else if (cart.getOrder().order.size() == 2){
                chooseRemove.getItems().addAll(1, 2);
            }
            else if (cart.getOrder().order.size() == 3){
                chooseRemove.getItems().addAll(1, 2, 3);
            }
            else if (cart.getOrder().order.size() == 4){
                chooseRemove.getItems().addAll(1, 2, 3, 4);
            }
            else if (cart.getOrder().order.size() == 5){
                chooseRemove.getItems().addAll(1, 2, 3, 4, 5);
            }
            
            Button remove = new Button("Remove from cart");
            grid.add(remove, 2, 6, 1, 1);
            remove.setOnAction(new EventHandler<ActionEvent>(){
                @Override
				public void handle (ActionEvent event) { 
					try {
                        if (chooseRemove.getValue() == 1) {
                            cart.getOrder().removeItem(0);
                            primaryStage.setScene(selectItems(primaryStage, cart));
                         } 
                         else if (chooseRemove.getValue() == 2) {
                            cart.getOrder().removeItem(1);
                            primaryStage.setScene(selectItems(primaryStage, cart));
                         } 
                         else if (chooseRemove.getValue() == 3) {
                            cart.getOrder().removeItem(2);
                            primaryStage.setScene(selectItems(primaryStage, cart));
                         } 
                         else if (chooseRemove.getValue() == 4) {
                            cart.getOrder().removeItem(3);
                            primaryStage.setScene(selectItems(primaryStage, cart));
                         } 
                         else if (chooseRemove.getValue() == 5) {
                            cart.getOrder().removeItem(4);
                            primaryStage.setScene(selectItems(primaryStage, cart));
                         } 


                    }catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				  
            }
        });
			

		Scene scene = new Scene (grid, 600, 500);
		
		BackgroundFill bf = new BackgroundFill(Color.ROYALBLUE, CornerRadii.EMPTY, Insets.EMPTY);
		Background bg = new Background(bf);
		grid.setBackground(bg);
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
		return scene;
	}
	

    public Scene reviewPurchase (Stage primaryStage, Cart cart)
	{
        primaryStage.setTitle("Review Your Purchase");
        
		
        GridPane grid = new GridPane();
		grid.setPadding(new Insets(20,20,20,20));
		grid.setVgap(8);
		grid.setHgap(10);
		grid.setAlignment(Pos.CENTER);

        ArrayList<Item> order = cart.getOrder().getArrayOfItems();

        System.out.println(order.size());

        System.out.println("Hello");

        if (order.size() == 0){
            Text nothing = new Text ("You have no items in your cart. Please return to shop.");
            nothing.setFont(Font.font("Times New Roman",20));
            nothing.setFill(Color.WHITE);
            grid.add(nothing, 0, 1, 1, 1);
        }

        else if (order.size() == 1){
            Item item = order.get(0);
            Text item1show = new Text ("Item 1: " + item.getName());
            item1show.setFont(Font.font("Times New Roman",15));
            item1show.setFill(Color.WHITE);
            grid.add(item1show, 0, 0, 1, 1);


           
            int t = order.get(0).getPrice();
            Text totalPrice = new Text ("Your Total is $: " + t);
            totalPrice.setFont(Font.font("Times New Roman",20));
            totalPrice.setFill(Color.WHITE);
            grid.add(totalPrice, 0, 1, 1, 1);
            cart.getOrder().setTotal(t);


        }
        else if (order.size() == 2){
            Item product = order.get(0);
            Text item1show = new Text ("Item 1: " + product.getName());
            item1show.setFont(Font.font("Times New Roman",15));
            item1show.setFill(Color.WHITE);
            grid.add(item1show, 0, 0, 1, 1);

            Item product2 = order.get(1);
            Text item2show = new Text ("Item 2: " + product2.getName());
            item2show.setFont(Font.font("Times New Roman",15));
            item2show.setFill(Color.WHITE);
            grid.add(item2show, 0, 1, 1, 1);

            int t = order.get(0).getPrice() + order.get(1).getPrice();
            Text totalPrice = new Text ("Your Total is $: " + t);
            totalPrice.setFont(Font.font("Times New Roman",20));
            totalPrice.setFill(Color.WHITE);
            grid.add(totalPrice, 0, 2, 1, 1);
            cart.getOrder().setTotal(t);
        }
       
        else if (order.size() == 3){
            Item product = order.get(0);
            Text item1show = new Text ("Item 1: " + product.getName());
            item1show.setFont(Font.font("Times New Roman",15));
            item1show.setFill(Color.WHITE);
            grid.add(item1show, 0, 0, 1, 1);

            Item product2 = order.get(1);
            Text item2show = new Text ("Item 2: " + product2.getName());
            item2show.setFont(Font.font("Times New Roman",15));
            item2show.setFill(Color.WHITE);
            grid.add(item2show, 0, 1, 1, 1);

            Item product3 = order.get(2);
            Text item3show = new Text ("Item 3: " + product3.getName());
            item3show.setFont(Font.font("Times New Roman",15));
            item3show.setFill(Color.WHITE);
            grid.add(item3show, 0, 2, 1, 1);

            int t = order.get(0).getPrice() + order.get(1).getPrice() + order.get(2).getPrice();
            Text totalPrice = new Text ("Your Total is $: " + t);
            totalPrice.setFont(Font.font("Times New Roman",20));
            totalPrice.setFill(Color.WHITE);
            grid.add(totalPrice, 0, 3, 1, 1);
            cart.getOrder().setTotal(t);
            
        }

        else if (order.size() == 4){
            Item product = order.get(0);
            Text item1show = new Text ("Item 1: " + product.getName());
            item1show.setFont(Font.font("Times New Roman",15));
            item1show.setFill(Color.WHITE);
            grid.add(item1show, 0, 0, 1, 1);

            Item product2 = order.get(1);
            Text item2show = new Text ("Item 2: " + product2.getName());
            item2show.setFont(Font.font("Times New Roman",15));
            item2show.setFill(Color.WHITE);
            grid.add(item2show, 0, 1, 1, 1);

            Item product3 = order.get(2);
            Text item3show = new Text ("Item 3: " + product3.getName());
            item3show.setFont(Font.font("Times New Roman",15));
            item3show.setFill(Color.WHITE);
            grid.add(item3show, 0, 2, 1, 1);

            Item product4 = order.get(3);
            Text item4show = new Text ("Item 4: " + product4.getName());
            item4show.setFont(Font.font("Times New Roman",15));
            item4show.setFill(Color.WHITE);
            grid.add(item4show, 0, 3, 1, 1);

            int t = order.get(0).getPrice() + order.get(1).getPrice() + order.get(2).getPrice() + order.get(3).getPrice();
            Text totalPrice = new Text ("Your Total is $: " + t);
            totalPrice.setFont(Font.font("Times New Roman",20));
            totalPrice.setFill(Color.WHITE);
            grid.add(totalPrice, 0, 4, 1, 1);
            cart.getOrder().setTotal(t);

        }

        else if (order.size() == 5){
            Item product = order.get(0);
            Text item1show = new Text ("Item 1: " + product.getName());
            item1show.setFont(Font.font("Times New Roman",15));
            item1show.setFill(Color.WHITE);
            grid.add(item1show, 0, 0, 1, 1);

            Item product2 = order.get(1);
            Text item2show = new Text ("Item 2: " + product2.getName());
            item2show.setFont(Font.font("Times New Roman",15));
            item2show.setFill(Color.WHITE);
            grid.add(item2show, 0, 1, 1, 1);

            Item product3 = order.get(2);
            Text item3show = new Text ("Item 3: " + product3.getName());
            item3show.setFont(Font.font("Times New Roman",15));
            item3show.setFill(Color.WHITE);
            grid.add(item3show, 0, 2, 1, 1);

            Item product4 = order.get(3);
            Text item4show = new Text ("Item 4: " + product4.getName());
            item4show.setFont(Font.font("Times New Roman",15));
            item4show.setFill(Color.WHITE);
            grid.add(item4show, 0, 3, 1, 1);

            Item product5 = order.get(4);
            Text item5show = new Text ("Item 5: " + product5.getName());
            item5show.setFont(Font.font("Times New Roman",15));
            item5show.setFill(Color.WHITE);
            grid.add(item5show, 0, 4, 1, 1);

            int t = order.get(0).getPrice() + order.get(1).getPrice() + order.get(2).getPrice() + order.get(3).getPrice() + order.get(4).getPrice();
            Text totalPrice = new Text ("Your Total is $: " + t);
            totalPrice.setFont(Font.font("Times New Roman",20));
            totalPrice.setFill(Color.WHITE);
            grid.add(totalPrice, 0, 5, 1, 1);
            cart.getOrder().setTotal(t);
        }

        Button next = new Button("Complete Purchase");
        grid.add(next, 0, 6, 1, 1);
        next.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle (ActionEvent event) { 
                 try {

                     primaryStage.setScene(purchaseConfirmed(primaryStage, cart));
                     } catch (Exception e) {
                            // TODO Auto-generated catch block
                     e.printStackTrace();
                    }
                }
            });

           

            Button back = new Button("Go back");
            grid.add(back, 1, 6, 1, 1);
            back.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle (ActionEvent event) { 
                     try {
                         primaryStage.setScene(selectItems(primaryStage, cart));
                         } catch (Exception e) {
                                // TODO Auto-generated catch block
                         e.printStackTrace();
                        }
                    }
                });
            

		
        Scene scene = new Scene (grid, 600, 350);
		
		BackgroundFill bf = new BackgroundFill(Color.ROYALBLUE, CornerRadii.EMPTY, Insets.EMPTY);
		Background bg = new Background(bf);
		grid.setBackground(bg);
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
		return scene;
	}



    public Scene purchaseConfirmed (Stage primaryStage, Cart cart) throws Exception//COMPLETE DO NOT TOUCH PLEASE
	{
        primaryStage.setTitle("Purchase Confirmed");
        
		
		GridPane grid = new GridPane();
		grid.getColumnConstraints().add(new ColumnConstraints(150));
		grid.setPadding(new Insets(20,20,20,20));
		grid.setVgap(8);
		grid.setHgap(10);
		grid.setAlignment(Pos.CENTER_LEFT);

        ArrayList<Item> order = cart.getOrder().getArrayOfItems();

        Text Done = new Text ("You have completed your purchase. It will be delivered to you shortly.");
        Done.setFont(Font.font("Times New Roman",20));
        Done.setFill(Color.WHITE);
        grid.add(Done, 0, 0, 1, 1);


        Button finish = new Button("Finish");
        grid.add(finish, 1, 1, 1, 1);
        finish.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle (ActionEvent event) { 
                 try {
                    if (order.size() == 1){
                        Order o = new Order(cart.getOrder().getTotal(), order.get(0));
                        o.setOrderNumber(cart.getOrder().getOrderNumber()+1);
                        cart.getOrder().addOrder(o);
            
                    }
            
                    else if (order.size() == 2){
                        Order o = new Order(cart.getOrder().getTotal(), order.get(0), order.get(1));
                        o.setOrderNumber(cart.getOrder().getOrderNumber()+1);
                        cart.getOrder().addOrder(o);
            
                    }
            
                    else if (order.size() == 3){
                        Order o = new Order(cart.getOrder().getTotal(), order.get(0), order.get(1), order.get(2));
                        o.setOrderNumber(cart.getOrder().getOrderNumber()+1);
                        cart.getOrder().addOrder(o);
            
                    }
            
                    else if (order.size() == 4){
                        Order o = new Order(cart.getOrder().getTotal(), order.get(0), order.get(1), order.get(2), order.get(3));
                        o.setOrderNumber(cart.getOrder().getOrderNumber()+1);
                        cart.getOrder().addOrder(o);
                    }
            
                    else if (order.size() == 5){
                        Order o = new Order(cart.getOrder().getTotal(), order.get(0), order.get(1), order.get(2), order.get(3), order.get(4));
                        o.setOrderNumber(cart.getOrder().getOrderNumber()+1);
                        cart.getOrder().addOrder(o);
                    }



                     primaryStage.setScene(ordersList(primaryStage, cart));
                     } catch (Exception e) {
                            // TODO Auto-generated catch block
                     e.printStackTrace();
                    }
                }
            });


        Scene scene = new Scene (grid, 600, 350);
		
		
		BackgroundFill bf = new BackgroundFill(Color.ROYALBLUE, CornerRadii.EMPTY, Insets.EMPTY);
		Background bg = new Background(bf);
		grid.setBackground(bg);
		

		primaryStage.setScene(scene);
		primaryStage.show();
		
		return scene;
	}



    public Scene ordersList (Stage primaryStage, Cart cart) throws Exception//COMPLETE DO NOT TOUCH PLEASE
	{
        primaryStage.setTitle("Your last three orders");
        
		
		GridPane grid = new GridPane();
		grid.getColumnConstraints().add(new ColumnConstraints(150));
		grid.setPadding(new Insets(20,20,20,20));
		grid.setVgap(8);
		grid.setHgap(10);
		grid.setAlignment(Pos.CENTER_LEFT);

        ArrayList<Order> orders = cart.getOrder().getArrayOfOrders();
        ArrayList<Item> order = cart.getOrder().getArrayOfItems();


        System.out.println(orders.size());

        if (orders.size() == 0){
            Text nothing = new Text ("You have no previous orders.");
            nothing.setFont(Font.font("Times New Roman",20));
            nothing.setFill(Color.WHITE);
            grid.add(nothing, 0, 1, 1, 1);
        }
        else if (orders.size() == 1){
          
            Text order1show = new Text ("Order: $:" + orders.get(0).getTotal());
            order1show.setFont(Font.font("Times New Roman",15));
            order1show.setFill(Color.WHITE);
            grid.add(order1show, 0, 0, 1, 1);

        }

        else if (orders.size() == 2){
          
            Text order1show = new Text ("Order: $:" + orders.get(0).getTotal());
            order1show.setFont(Font.font("Times New Roman",15));
            order1show.setFill(Color.WHITE);
            grid.add(order1show, 0, 0, 1, 1);

            Text order2show = new Text ("Order: $:" + orders.get(1).getTotal());
            order2show.setFont(Font.font("Times New Roman",15));
            order2show.setFill(Color.WHITE);
            grid.add(order2show, 0, 1, 1, 1);
        }

        else if (orders.size() >= 3){
          
            Text order1show = new Text ("Order: $:" + orders.get(0).getTotal());
            order1show.setFont(Font.font("Times New Roman",15));
            order1show.setFill(Color.WHITE);
            grid.add(order1show, 0, 0, 1, 1);

            Text order2show = new Text ("Order: $:" + orders.get(1).getTotal());
            order2show.setFont(Font.font("Times New Roman",15));
            order2show.setFill(Color.WHITE);
            grid.add(order2show, 0, 1, 1, 1);

            Text order3show = new Text ("Order: $:" + orders.get(2).getTotal());
            order3show.setFont(Font.font("Times New Roman",15));
            order3show.setFill(Color.WHITE);
            grid.add(order3show, 0, 2, 1, 1);
        }

  

        Button newOrder = new Button("New Order");
        grid.add(newOrder, 0, 3, 1, 1);
        newOrder.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle (ActionEvent event) { 
                 try {
                     order.clear();
                    primaryStage.setScene(selectItems(primaryStage, cart));
                } catch (Exception e) {
                       // TODO Auto-generated catch block
                e.printStackTrace();
               }
           }
       });

       Button logout = new Button("Sign Out");
       grid.add(logout, 1, 3, 1, 1);
       logout.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle (ActionEvent event) { 
                try {
                   primaryStage.setScene(BroncoID(primaryStage, cart));
               } catch (Exception e) {
                      // TODO Auto-generated catch block
               e.printStackTrace();
              }
          }
      });


        Scene scene = new Scene (grid, 600, 350);
		
		
		BackgroundFill bf = new BackgroundFill(Color.ROYALBLUE, CornerRadii.EMPTY, Insets.EMPTY);
		Background bg = new Background(bf);
		grid.setBackground(bg);
		

		primaryStage.setScene(scene);
		primaryStage.show();
		
		return scene;
	}






















}
