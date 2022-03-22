package ReversAnInteger;

public class Main {

	public static void main(String[] args) {
		System.out.println("Enter an Integer: ");
		java.util.Scanner in = new java.util.Scanner(System.in);
		int n = in.nextInt();
		reverseInt(n);
	}

	public static void reverseInt(int number) {
		while (number != 0) {
			int reversing = number % 10;
			System.out.print(reversing);
			number = number / 10;
		}
	}

}
