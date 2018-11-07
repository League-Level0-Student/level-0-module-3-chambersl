//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class RobotColorChooser {
	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot rob = new Robot();
		// 3. Ask the user what color they would like the robot to draw
		String color = JOptionPane.showInputDialog("What color do you want?");
		// 5. Use an if/else statement to set the pen color that the user requested\
		for (int i = 0; i < 10; i++) {
			if (color.equals("blue")) {
				rob.setPenColor(Color.blue);
			}
			// 6. If the user doesn’t enter anything, choose a random color
			else {
				rob.setRandomPenColor();
			}
			// 7. Put a loop around your code so that you keep asking the user for more
			// colors & drawing them

			// 4. Set the pen width to 10
			rob.setPenWidth(10);
			// 2. Make the robot draw a shape (this will take more than one line of code)
			rob.setSpeed(200);
			rob.penDown();
			rob.move(100);
			rob.turn(90);
			rob.move(100);
			rob.turn(90);
			rob.move(100);
			rob.turn(90);
			rob.move(100);
			rob.move(300);
		}
	}
}
