package insideCircle;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter a Point with tow coordinates: ");
		double x = in.nextDouble();
		double y = in.nextDouble();
		double distance = Math.pow(x * x + y * y, 0.5);

		if (distance <= 10) {
			System.out.println("Point is inside the Circle");

		} else {
			System.out.println("Point is outside the Circle");
		}

	}

}
