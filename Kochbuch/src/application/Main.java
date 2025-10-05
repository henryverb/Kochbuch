package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.*;
import javafx.scene.control.*;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
//		try {
//			BorderPane root = new BorderPane();
	    
	    
	    Button calcButton = new Button("Calculation");
	    TextField tf1 = new TextField();
	    Label lbl1 = new Label("Rechnen:");
	    HBox h1 = new HBox();
	    VBox vb1 = new VBox();
	    Label lbr = new Label("Result:");
	    h1.getChildren().addAll(lbl1, tf1, calcButton);
	    
	    vb1.getChildren().addAll(h1,lbr);
	    
        StringBuilder sb = new StringBuilder("Result:");
	    EventHandler<ActionEvent> handler = new EventHandler<ActionEvent>() {
	        @Override
	        public void handle(ActionEvent event) {
            sb.append("\n").append(tf1.getText());
	            lbr.setText(sb.toString());
	        }
	    };
	    
	    calcButton.setOnAction(handler);
	    
	    
	    
	    
			Scene scene = new Scene(vb1,400,400);
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
