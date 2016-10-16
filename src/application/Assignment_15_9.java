package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Assignment_15_9 extends Application {
	private int currentX = 300;
	private int currentY = 200;
	private int lineDrawLength = 60;
	
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		Pane pane = new Pane();
		
		// Create Scene and place it on the stage
		Scene scene = new Scene(pane, 600, 400); // Set Scene size
		primaryStage.setTitle("Marco's Moving Line Assignment"); // Title
		primaryStage.setScene(scene);
		primaryStage.show();
		
		scene.setOnKeyPressed(e -> {
		    if (e.getCode() == KeyCode.UP) {
		    	if (currentY > 80) {
		    		Line line2 = new Line(currentX, currentY, currentX, currentY - lineDrawLength);
					line2.setStrokeWidth(5);
					line2.setStroke(Color.BLUE);
					pane.getChildren().add(line2);
					currentY = currentY - lineDrawLength;
		    	}
		        
		    }
		    else if(e.getCode() == KeyCode.DOWN)
		    {
		    	if (currentY < 360) {
			    	Line line3 = new Line(currentX, currentY, currentX, currentY + lineDrawLength);
					line3.setStrokeWidth(5);
					line3.setStroke(Color.RED);
					pane.getChildren().add(line3);
					currentY = currentY + lineDrawLength;		    		
		    	}

		    }
		    else if(e.getCode() == KeyCode.LEFT)
		    {
		    	if (currentX > 60) {
					Line line2 = new Line(currentX, currentY, currentX - lineDrawLength, currentY);
					line2.setStrokeWidth(5);
					line2.setStroke(Color.ORANGE);
					pane.getChildren().add(line2);
					currentX = currentX - lineDrawLength;
				}
		    	
		    }
		    else if(e.getCode() == KeyCode.RIGHT)
		    {
		    	if (currentX < 540) {
					Line line2 = new Line(currentX, currentY, currentX + lineDrawLength, currentY);
					line2.setStrokeWidth(5);
					line2.setStroke(Color.GREEN);
					pane.getChildren().add(line2);
					currentX = currentX + lineDrawLength;
				}
		    }
		});
		
	}
	
	public static void main(String[] args) {

		launch(args);
	}

}