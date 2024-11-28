package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class idkiftheycare {
	public static void main(String[] args) {
		String AgeString = JOptionPane.showInputDialog("Whats your age?????");
		int AgeInt = Integer.parseInt(AgeString);
		if(AgeInt >= 18){
			JOptionPane.showInputDialog("Wow you're "+AgeInt+ " ,who will you vote for president?");
			
		}
		else if(AgeInt <= 17){
			JOptionPane.showMessageDialog(null, "Oh... you're " +AgeInt+ ". Also, nobody cares about your opinion, so get out of here >:(.");
		}
	}
}
