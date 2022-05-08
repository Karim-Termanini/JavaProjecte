package implementing_a_function;

import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(final String[] args) {
		final List<String> names = new LinkedList<>();
		names.add("");
		names.add("karim");
		names.add("b");
		names.add("hanin");
		names.add("rola");
		names.add("al");
		names.add("g");
		names.add("orenda");
		names.add("n");
		Utils.clean(names);
		for (final String s : names) {
			System.out.println(s);
		}
	}

}
