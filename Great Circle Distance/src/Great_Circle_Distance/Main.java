package Great_Circle_Distance;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter point 1 (lat and long) in degrees: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();

		System.out.println("Enter point 2 (lat and long) in degrees: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();

		double Earth = 6371.01;

		double d = Earth * Math.acos(Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2))
				+ Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) * Math.cos(Math.toRadians(y1 - y2)));

		System.out.println("the Distance between the Tow points is " + d + "km");
	}

}
