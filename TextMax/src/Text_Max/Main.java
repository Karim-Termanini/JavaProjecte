package Text_Max;

import java.util.Scanner;

public class Main {

	public static int max(int n1, int n2) {
		int result;
		if (n1 > n2) {
			result = n1;
		} else {
			result = n2;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1 = input.nextInt();
		int n2 = input.nextInt();

		int result = max(n1, n2);
		System.out.println("The Max Number of '" + n1 + "' and '" + n2 + "' is: [" + result + "]");
	}

}
