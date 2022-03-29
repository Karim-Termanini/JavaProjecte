package Modularize_Code;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first Integer: ");
		int n1 = input.nextInt();

		System.out.print("Enter secound Intger: ");
		int n2 = input.nextInt();

		System.out.println("The Greatest common diviser for " + n1 + " and " + n2 + " is " + qcd(n1, n2));
	}

	public static int qcd(int n1, int n2) {
		int qcd = 1;
		int k = 1;
		while (k <= n1 && k <= n2) {
			if (n1 % k == 0 && n2 % k == 0) {
				qcd = k;
			}
			k++;
		}
		return qcd;
	}

}
