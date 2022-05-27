package multiplication_table;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		for (int i = 0; i <= 10; i++) {
			System.out.println(i + " * " + n + " = " + (i * n));
		}
	}

}
