package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class DaLottery {

	public static void main(String[] args) {
		Random meow = new Random();
		int randomNumber6 = meow.nextInt(100);
		int randomNumber4 = meow.nextInt(100);
		int randomNumber3 = meow.nextInt(100);
		int randomNumber2 = meow.nextInt(100);
		int randomNumber1 = meow.nextInt(100);
		int randomNumber5 = meow.nextInt(100);
		JOptionPane.showMessageDialog(null, randomNumber1 + " " + randomNumber2 + " " + randomNumber3 + " " + randomNumber4 + " " + randomNumber5 + " " + randomNumber6, "LOTTERY TICKET", JOptionPane.PLAIN_MESSAGE);
	}

}
