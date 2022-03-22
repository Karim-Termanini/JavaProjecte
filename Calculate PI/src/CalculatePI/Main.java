package CalculatePI;

public class Main {
	public static void main(String[] args) {
		System.out.println("i\t\tm(i)");
		for (int i = 10; i <= 1000000; i += 10000) {
			System.out.println(i + "\t\t" + pI(i));
		}
	}

	public static double pI(int n) {
		double term;
		double pi = 0;

		for (int i = 1; i <= n; i += 2) {
			term = 4.0 * (1.0 / (2 * i - 1) - 1.0 / (2 * i + 1));
			pi += term;
		}
		return pi;
	}
}
