package application;

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

public class MyLinePane extends Pane {
	//Declare Variables
	int centerX = 100;
	int centerY = 100;
	private Button btRight = new Button("Right");
	
	public MyLinePane ()
	{
		
		//Create a pane and set it's properties
		getChildren().add(btRight);
		
		btRight.setPrefSize(50, 30);
		btRight.setLayoutX(335);
		btRight.setLayoutY(20);
		
		btRight.setOnAction(e -> moveRight());
		
	}
	
	protected void moveRight()
	{
		
		Line line2 = new Line(10, 10, 10, 10);
		line2.startXProperty().bind(widthProperty().subtract(10));
		line2.endYProperty().bind(heightProperty().subtract(10));
		line2.setStrokeWidth(5);
		line2.setStroke(Color.GREEN);
		getChildren().add(line2);
		
		
		
	}

}
