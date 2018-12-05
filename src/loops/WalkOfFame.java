
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package loops;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot();
		// 1. Set the X position of the robot so that it starts on the left.
		// You also need to show the robot to see the result of this line.
		rob.setX(50);
		rob.setY(50);
		rob.penDown();
		// rob.hide();
		rob.setSpeed(50);
		// 2. Make the robot draw a star shape. Hint: 144.
		for (int i = 0; i < 5; i++) {
			rob.move(50);
			rob.turn(144);
		}
		rob.penUp();
		rob.penDown();
		rob.setX(120);
		rob.setY(120);
		for (int i = 0; i < 5; i++) {
			rob.move(60);
			rob.turn(144);
		}
		rob.penUp();
		rob.penDown();
		rob.setX(200);
		rob.setY(200);
		for (int i = 0; i < 5; i++) {
			rob.move(70);
			rob.turn(144);
		}
		rob.penUp();
		rob.penDown();
		rob.setX(290);
		rob.setY(290);
		for (int i = 0; i < 5; i++) {
			rob.move(80);
			rob.turn(144);
		}
		rob.penUp();
		rob.penDown();
		rob.setX(390);
		rob.setY(390);
		for (int i = 0; i < 5; i++) {
			rob.move(100);
			rob.turn(144);
		}
		// 3. Set the size of the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this: http://bit.ly/walkOfFame
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
