import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(final String[] args) throws IOException {
		InputStreamReader inputSR = null;
		try (Scanner in = new Scanner(System.in)) {
			char y = 'y';
			int a;
			do {
				inputSR = new InputStreamReader(System.in);
				System.out.println("Bitte das Charachter eingeben");
				a = inputSR.read();
				System.out.println(a);
				// ---------------------
				System.out.println();
				System.out.println("----------------");
				System.out.println("Willst du das Program beenden?(y\\n)");
				y = in.next().charAt(0);
			} while (y == 'n');
		}
		inputSR.close();
	}
}
