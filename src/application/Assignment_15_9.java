package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Assignment_15_9 extends Application {
	@Override	//Override the start method in the Application class
	public void start(Stage primaryStage)
	{
		//Create object from Marco_ball_pane class		
		MyLinePane linePane = new MyLinePane();
			
		//Create Scene and place it on the stage
		Scene scene = new Scene(linePane, 600, 400);
		primaryStage.setTitle("Marco's Bouncing Ball Assignment");	//Refer to Chapter 15, page 613
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	public static void main(String[] args) {

		launch(args);
	}

}
