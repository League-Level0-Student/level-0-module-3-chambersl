
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {

		// 1. correct the birthdays for your family below
		String momsBirthday = "April 28th";
		String dadsBirthday = "October 20th";
		String myBirthday = "April 25th";

		// 2. Find out which birthday the user wants and and store their response in a
		// variable
		String birthday = JOptionPane.showInputDialog("Which birthday do you want to know?");
		// 3. Print out what the user typed
		System.out.println(birthday);
		// 4. if user asked for "mom"
		// print mom's birthday

		if (birthday.equals("moms")) {
			System.out.println(momsBirthday);
		}
		// 5. if user asked for "dad"
		// print dad's birthday
		else if (birthday.equals("dads")) {
			System.out.println(dadsBirthday);
		}
		// 6. if user asked for your name
		// print myBirthday
		else if (birthday.equals("yours")) {
			System.out.println(myBirthday);
		}
		// 7. otherwise print "Sorry, i don't remember that person's birthday!"
		else {
			System.out.println("I dont know their birthday....");
		}
	}
}
