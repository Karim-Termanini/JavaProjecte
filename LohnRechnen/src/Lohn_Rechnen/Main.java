package Lohn_Rechnen;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter yearly interest rate, for example [8.25]: ");
		double InterestRate = input.nextDouble();

		double monthlyInterestRate = InterestRate / 1200;

		System.out.print("Enter number of years as an Integer,for example [5]: ");
		int numberOfYears = input.nextInt();

		System.out.print("Enter loan amount, for example [120000.95]: ");
		double loanAmount = input.nextDouble();

		double monthlyPayment = loanAmount * monthlyInterestRate
				/ (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
		double totalPayment = monthlyPayment * numberOfYears * 12;

		System.out.print("The Monthly payment is:   " + (int) (monthlyPayment * 100) / 100.0);

		System.out.print("The Total payment is:   " + (int) (totalPayment * 100) / 100.0);
	}

}
