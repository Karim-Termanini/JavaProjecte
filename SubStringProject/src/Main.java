/*
 * 
 */
import java.util.Scanner;

/**
 * The Class Main.
 */
public class Main {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(final String[] args) {

		try (Scanner in = new Scanner(System.in)) {
			final String s1 = in.next();
			int n1 = 0;
			final CharSequence plus = "+";
			final CharSequence minus = "-";
			final CharSequence mal = "*";
			final CharSequence auf = "/";
			if (s1.contains(plus)) {
				n1 = s1.indexOf((String) plus);
			} else if (s1.contains(minus)) {
				n1 = s1.indexOf((String) minus);
			} else if (s1.contains(mal)) {
				n1 = s1.indexOf((String) mal);
			} else {
				n1 = s1.indexOf((String) auf);
			}

			final char[] s2 = s1.substring(n1, n1 + 1).toCharArray();
			final char ch = s2[0];

			final double number1 = Double.parseDouble(s1.substring(0, n1));
			final double number2 = Double.parseDouble(s1.substring(n1 + 1, s1.length()));

			switch (ch) {
			case '+': {
				System.out.println(number1 + number2);
				break;
			}
			case '-': {
				System.out.println(number1 - number2);
				break;
			}
			case '*': {
				System.out.println(number1 * number2);
				break;
			}
			case '/': {
				if (number2 == 0) {
					System.out.println("Durch 0 kann man nicht teilen");
				} else {
					System.out.println(number1 / number2);
				}
				break;
			}
			}
		} catch (final NumberFormatException e) {
			e.printStackTrace();
		}

	}
}
