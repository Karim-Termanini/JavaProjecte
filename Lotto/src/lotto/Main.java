package lotto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		List<Integer> winningNumbers = new ArrayList<>();
		

		Random random = new Random();

		for (int i = 0; i < 6; i++) {
			while (true) {
				int winningNumber = random.nextInt(49) + 1;
				if (!winningNumbers.contains(winningNumber)) {
					winningNumbers.add(winningNumber);
					break;
				}
			}
		}
		System.out.println(winningNumbers);

		System.out.println("Enter your Numbers ( 1 <-> 49 )");
		System.out.println("-----------------------");

		Scanner in = new Scanner(System.in);

		List<Integer> guessedNumbers = new ArrayList<>();

		for (int i = 0; i < 6; i++) {
			System.out.println("Your current numbers are: " + guessedNumbers);
			System.out.println("-----------------------");
			System.out.println("Please enter a Number: ");
			while (true) {
				try {
					String numberString = in.nextLine();
					int number = Integer.parseInt(numberString);
					if (number >= 1 && number <= 49) {
						guessedNumbers.add(number);
						break;
					} else {
						System.out.println(number + " is not between 1 and 49!. Please try again.");

					}
				} catch (NumberFormatException nfe) {
					System.out.println("that's not even a number, Please try again.");
				}
			}
		}

		System.out.println("The Winning Numbers were: " + winningNumbers);
		System.out.println("-----------------------");
		System.out.println("Your Numbers are: " + guessedNumbers);
		System.out.println("-----------------------");
		guessedNumbers.retainAll(winningNumbers);

		System.out.println("Your matched Numbers are: " + guessedNumbers);

		if (guessedNumbers.containsAll(winningNumbers)) {
			System.out.println("You actully won. How did you that?!");
		} else {
			System.out.println("Sorry, you lost. Not surprising.");
		}
	}

}
