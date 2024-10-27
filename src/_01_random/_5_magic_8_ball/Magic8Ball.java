//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _01_random._5_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below
	public static void main(String[] args) {

		while(true) {
			// 2. Get the user to enter a question for the 8 ball to answer
			JOptionPane.showInputDialog("You have found this wise 8 ball, ask it a question!");

			// 3. Make a variable and initialize it to a random number.
			//     ** You will need to make a random object!
			//     Limit the random numbers to be between 0 and 3
			Random wiseBall = new Random();
			int randomNumber = wiseBall.nextInt(4);

			System.out.println(randomNumber);

			// 4. If the random number is 0
			if(randomNumber==(0)){
				JOptionPane.showMessageDialog(null, "Yes absolutely!");
			}
			// -- tell the user "Yes"

			// 5. If the random number is 1
			if(randomNumber==(1)){
				JOptionPane.showMessageDialog(null, "Nope just no.");
			}
			// -- tell the user "No"

			// 6. If the random number is 2
			if(randomNumber==(2)){
				JOptionPane.showMessageDialog(null, "Maybe you should ask Google?");
			}
			// -- tell the user "Maybe you should ask Google?"

			// 7. If the random number is 3
			if(randomNumber==(3)){
				JOptionPane.showMessageDialog(null, "I don't care :D");
			}
			// -- tell the user "I don't care :D"

		}

	}
}
