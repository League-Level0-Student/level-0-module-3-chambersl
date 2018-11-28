package loops;

import org.jointheleague.graphical.robot.Robot;

public class obedientRobot {

	static Robot rob = new Robot();

	// my main method
	public static void main(String[] args) {
		drawSquare(50, 90);
		drawTriangle(70, 120);
	}

	// draw square
	static void drawSquare(int length, int turn) {
		rob.penDown();
		for (int i = 0; i < 4; i++) {
			rob.move(length);
			rob.turn(turn);
		}
	}

	// draw square
	static void drawTriangle(int length, int turn) {
		rob.penDown();
		for (int i = 0; i < 3; i++) {
			rob.move(length);
			rob.turn(turn);
		}
	}

}
