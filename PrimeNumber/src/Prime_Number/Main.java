package Prime_Number;

public class Main {

	public static void main(String[] args) {
		System.out.println("The First 50 prime numbers are \n");
		printPrimeNumber(50);
	}

	public static void printPrimeNumber(int numberOfPrime) {
		final int NUMBER_OF_PRIME_PER_LINE = 10;
		int count = 0;
		int number = 2;

		while (count < numberOfPrime) {
			if (isprime(number)) {
				count++;
				if (count % NUMBER_OF_PRIME_PER_LINE == 0) {
					System.out.printf("%-5s\n", number);
				} else {
					System.out.printf("%5s ", number);
				}
			}
			number++;
		}
	}

	public static boolean isprime(int number) {
		for (int divisor = 2; divisor <= number / 2; divisor++) {
			if (number % divisor == 0) {
				return false;
			}
		}
		return true;
	}

}
