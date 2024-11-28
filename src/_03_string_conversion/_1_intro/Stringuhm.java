package _03_string_conversion._1_intro;

import javax.swing.JOptionPane;

public class Stringuhm {
	public static void main(String[] args) {
		String quantity = JOptionPane.showInputDialog("Enter a number :D                      Why are you still reading just follow instructions >:(");
		int num = Integer.parseInt(quantity);
		JOptionPane.showMessageDialog(null, "I HATE THE NUMBER "+num+ "! WHY DID YOU CHOOSE THAT NUMBER???!!");
	}
}
