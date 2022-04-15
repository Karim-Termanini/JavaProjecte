package addionQuiz;

import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			final int number1 = (int) (System.currentTimeMillis() % 10);
			final int number2 = (int) (System.currentTimeMillis() * 7 % 10);

			System.out.println("What is " + number1 + " + " + number2 + " ?");
			final int answer = in.nextInt();

			System.out.println(number1 + " + " + number2 + " = " + answer + " is " + (number1 + number2 == answer));
		}
			
	}

}
