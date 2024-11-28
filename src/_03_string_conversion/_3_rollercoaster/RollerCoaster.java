package _03_string_conversion._3_rollercoaster;

import javax.swing.JOptionPane;

public class RollerCoaster {

	// 1) Make a main method that includes all the steps below….
	public static void main(String[] args) {
		// 2) Ask the user to enter their height in inches using JOptionPane and set it
		// to the variable heightToRide
		while(true) {
		
		String heightToRide = JOptionPane
				.showInputDialog("What is your height in inches(Type only the number please :D)");
		// Uncomment the line below...
		// if( heightAsInt > 42 ) { }

		// Do you see the heightToRide > 42 underlined red? That is because you are
		// comparing a STRING to an INTEGER.

		// 3) Convert heightToRide to heightAsInt using Integer.parseInt(); Hint: int
		// heightAsInt = Integer.parse...
		int heightAsInt = Integer.parseInt(heightToRide);

		// 4) If the heightAsInt is greater than or equal to 48 inches tall print:
		// "Hurray! You are tall enough to ride the coaster alone!" Hint: use
		// JoptionPane
		if (heightAsInt >= 48) {
			JOptionPane.showMessageDialog(null,
					"YAYAYAYAYYAY you can go on this ride without your guardian or parent :D but you will be bored becuase the wait line is 120 minutes-");
		}
		else if(heightAsInt == 47) {
			JOptionPane.showMessageDialog(null, "good but not good enough but thats 100% your fault and a skill issue-");
		}

		// 5) Else if the heightAsInt is greater than or equal to 42 inches tall print:
		// "You can ride the coaster with someone else!"
		else if (heightAsInt >= 42) {
			JOptionPane.showMessageDialog(null,
					"Wooow yipee you can go on this ride but go with your parent or guardian thats trying to teach you something-");
		}
		// 6) else print: "You must be at least 42 inches tall to ride the roller
		// coaster pal!"
		else {
			JOptionPane.showMessageDialog(null, "Erm, pal your a little too small and thats 100% your fault-");
		}
	}


	}
}