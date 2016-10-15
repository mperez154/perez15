package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Assignment_15_9 extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create object from Marco_ball_pane class
		MyLinePane linePane = new MyLinePane();

		// Create Scene and place it on the stage
		Scene scene = new Scene(linePane, 600, 400); // Set Scene size
		primaryStage.setTitle("Marco's Moving Line Assignment"); // Title
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {

		launch(args);
	}

}
