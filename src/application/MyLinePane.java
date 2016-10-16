package application;

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

public class MyLinePane extends Pane {
	// Declare Variables
	private int currentX = 300;
	private int currentY = 200;
	private int lineDrawLength = 60;
	private Button btRight = new Button("Right");
	private Button btLeft = new Button("Left");
	private Button btUp = new Button("Up");
	private Button btDown = new Button("Down");
	Pane pane = new Pane();

	public MyLinePane() {
		// Create a pane and set it's properties
		getChildren().addAll(btRight, btLeft, btUp, btDown);

		// Button properties
		btLeft.setPrefSize(50, 30);
		btRight.setPrefSize(50, 30);
		btUp.setPrefSize(50, 30);
		btDown.setPrefSize(50, 30);

		btLeft.setLayoutX(215);
		btLeft.setLayoutY(20);
		btRight.setLayoutX(335);
		btRight.setLayoutY(20);
		btUp.setLayoutX(275);
		btDown.setLayoutX(275);
		btDown.setLayoutY(40);

		btRight.setOnAction(e -> moveRight());
		btLeft.setOnAction(e -> moveLeft());
		btUp.setOnAction(e -> moveUp());
		btDown.setOnAction(e -> moveDown());
		

	}	

	// Line move methods
	protected void moveRight() {
		if (currentX < 540) {
			Line line = new Line(currentX, currentY, currentX + lineDrawLength, currentY);
			line.setStrokeWidth(5);
			line.setStroke(Color.GREEN);
			pane.getChildren().add(line);
			currentX = currentX + lineDrawLength;
		}

	}

	protected void moveLeft() {
		if (currentX > 60) {
			Line line = new Line(currentX, currentY, currentX - lineDrawLength, currentY);
			line.setStrokeWidth(5);
			line.setStroke(Color.BLUE);
			getChildren().add(line);
			currentX = currentX - lineDrawLength;
		}

	}

	protected void moveUp() {
		if (currentY > 80) {
			Line line = new Line(currentX, currentY, currentX, currentY - lineDrawLength);
			line.setStrokeWidth(5);
			line.setStroke(Color.MAGENTA);
			getChildren().add(line);
			currentY = currentY - lineDrawLength;
		}

	}

	protected void moveDown() {
		if (currentY < 360) {
			Line line = new Line(currentX, currentY, currentX, currentY + lineDrawLength);
			line.setStrokeWidth(5);
			line.setStroke(Color.RED);
			getChildren().add(line);
			currentY = currentY + lineDrawLength;
		}

	}

}