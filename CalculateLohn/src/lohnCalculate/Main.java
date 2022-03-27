package lohnCalculate;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter annual interest rate, eg, 7.25: ");
		double annualInterestRate = input.nextDouble();

		double monthlyInterestRate = annualInterestRate / 1200;

		System.out.print("Enter number of years as an Integer, eg, 5: ");
		int numberOfYears = input.nextInt();

		System.out.print("Enter loan amount, eg, 120000: ");
		double loanAmount = input.nextDouble();

		double monthlyPayment = loanAmount * monthlyInterestRate
				/ (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));

		double totalPayment = monthlyPayment * numberOfYears * 12;

		System.out.print("The Monthly Paymnet is: " + (int) (monthlyPayment * 100) / 100.0);

		System.out.print("The Toatl Payment is: " + (int) (totalPayment * 100) / 100.0);
	}

}