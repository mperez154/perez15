package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Assignment_15_3 extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create object from Marco_ball_pane class
		MyBallPane ballPane = new MyBallPane();

		// Create Scene and place it on the stage
		Scene scene = new Scene(ballPane, MyBallPane.sceneWidth, MyBallPane.sceneHeight); // Set scene size based on pane dimensions
		primaryStage.setTitle("Marco's Moving Ball"); // Title
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
