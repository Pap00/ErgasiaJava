package lab.unipi.gui.JavaFXLab;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;



public class App extends Application {

	Stage primaryStage;
	Scene mainScene, playerScene;
	FlowPane rootFlowPane;
	Button plrbtn,subbtn,resbtn;
	public void start(Stage primaryStage) {
		this.primaryStage=primaryStage;
		rootFlowPane=new FlowPane();
		plrbtn = new Button("Διαχειρηση Αθλητων");
		subbtn = new Button("Διαχειρηση Συνδρομων");
		resbtn = new Button("Διαχειρηση Κρατησεων");
		
		rootFlowPane.setHgap(10);
		rootFlowPane.setAlignment(Pos.CENTER);
		
		rootFlowPane.getChildren().add(plrbtn);
		rootFlowPane.getChildren().add(subbtn);
		rootFlowPane.getChildren().add(resbtn);
		
		mainScene = new Scene(rootFlowPane, 650, 300);
		
		primaryStage.setScene(mainScene);
		primaryStage.setTitle("Διαχείρηση Αθλητικών Ακαδημίων");
		primaryStage.show();
		}
	
    public static void main(String[] args) {
        launch();
    }

}
