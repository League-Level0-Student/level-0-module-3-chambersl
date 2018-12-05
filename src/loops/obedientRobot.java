package loops;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class obedientRobot {

	static Robot rob = new Robot();

	// my main method
	public static void main(String[] args) {
		rob.setSpeed(200);
		String shape = JOptionPane.showInputDialog("What shape do you want?");
		if (shape.equalsIgnoreCase("square")) {
			drawSquare(50, 90);
		} else if (shape.equalsIgnoreCase("triangle")) {
			drawTriangle(60, 120);
		} else if (shape.equalsIgnoreCase("circle")) {
			drawCircle(10, 10);
		}

	}

	// draw square
	static void drawSquare(int length, int turn) {
		rob.penDown();
		for (int i = 0; i < 4; i++) {
			rob.move(length);
			rob.turn(turn);
		}
		rob.hide();
	}

	// draw square
	static void drawTriangle(int length, int turn) {
		rob.penDown();
		for (int i = 0; i < 3; i++) {
			rob.move(length);
			rob.turn(turn);
		}
		rob.hide();
	}

	static void drawCircle(int length, int turn) {
		rob.penDown();
		for (int i = 0; i < 36; i++) {
			rob.move(length);
			rob.turn(turn);
		}
		rob.hide();
	}
}
