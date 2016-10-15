package application;

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.util.Duration;

public class MyBallPane extends Pane {
	// Create Variables
	private int centerX = 300;
	private int centerY = 200;
	private int radius = 30;
	protected static int sceneWidth = 600;
	protected static int sceneHeight = 400;
	private Button btRight = new Button("Right");
	private Button btLeft = new Button("Left");
	private Button btUp = new Button("Up");
	private Button btDown = new Button("Down");
	private Circle circle = new Circle(centerX, centerY, radius);

	public MyBallPane() {
		// Set circle properties
		circle.setFill(Color.BLUE); // Set its fill color
		circle.setStroke(Color.BLACK); // Set its outline color

		// Setup pane objects
		getChildren().add(circle);
		getChildren().add(btRight);
		getChildren().add(btLeft);
		getChildren().add(btUp);
		getChildren().add(btDown);

		// Button properties below
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

		// Set Action for buttons using Lambda
		btRight.setOnAction(e -> moveRight());
		btLeft.setOnAction(e -> moveLeft());
		btUp.setOnAction(e -> moveUp());
		btDown.setOnAction(e -> moveDown());

	}

	// Move functions
	protected void moveRight() {
		// If statement to control whether line is drawn or not depending on
		// current location
		if (centerX + 75 < sceneWidth) {
			PathTransition pt = new PathTransition(Duration.millis(1000),
					new Line(centerX, centerY, centerX + 75, centerY), circle);
			pt.setCycleCount(1);
			pt.setAutoReverse(false);
			pt.play();
			pt.setDuration(Duration.millis(1000));
			pt.setPath(circle);
			pt.setNode(circle);
			pt.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
			pt.setCycleCount(Timeline.INDEFINITE);
			pt.play();
			centerX = centerX + 75;
		}

	}

	protected void moveLeft() {
		// If statement to control whether line is drawn or not depending on
		// current location
		if (centerX - 80 > 0) {
			PathTransition pt = new PathTransition(Duration.millis(1000),
					new Line(centerX, centerY, centerX - 80, centerY), circle);
			pt.setCycleCount(1);
			pt.setAutoReverse(false);
			pt.play();
			pt.setDuration(Duration.millis(1000));
			pt.setPath(circle);
			pt.setNode(circle);
			pt.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
			pt.setCycleCount(Timeline.INDEFINITE);
			pt.play();
			centerX = centerX - 80;
		}
	}

	protected void moveUp() {
		// If statement to control whether line is drawn or not depending on
		// current location
		if (centerY - 100 > 0) {
			PathTransition pt = new PathTransition(Duration.millis(1000),
					new Line(centerX, centerY, centerX, centerY - 50), circle);
			pt.setCycleCount(1);
			pt.setAutoReverse(false);
			pt.play();
			pt.setDuration(Duration.millis(1000));
			pt.setPath(circle);
			pt.setNode(circle);
			pt.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
			pt.setCycleCount(Timeline.INDEFINITE);
			pt.play();
			centerY = centerY - 50;
		}

	}

	protected void moveDown() {
		// If statement to control whether line is drawn or not depending on
		// current location
		if (centerY + 50 < 400) {
			PathTransition pt = new PathTransition(Duration.millis(1000),
					new Line(centerX, centerY, centerX, centerY + 50), circle);
			pt.setCycleCount(1);
			pt.setAutoReverse(false);
			pt.play();
			pt.setDuration(Duration.millis(1000));
			pt.setPath(circle);
			pt.setNode(circle);
			pt.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
			pt.setCycleCount(Timeline.INDEFINITE);
			pt.play();
			centerY = centerY + 50;
		}

	}

}
