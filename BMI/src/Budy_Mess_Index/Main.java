package Budy_Mess_Index;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter weight in pounds: ");
		double weihgt = in.nextDouble();
		System.out.println("Enter height in inches: ");
		double height = in.nextDouble();
		double bmi = weihgt * 0.4535 / (height * 0.0254 * height * 0.0254);

		System.out.println("BMI is: " + bmi);

	}

}
