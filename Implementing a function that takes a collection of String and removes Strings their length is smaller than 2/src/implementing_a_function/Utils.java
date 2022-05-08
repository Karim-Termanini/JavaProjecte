package implementing_a_function;

import java.util.Collection;

public class Utils {
	public static void clean(final Collection<String> collection) {
//		lambda expression
		collection.removeIf(t -> t.length() <= 1);
//	----or anonymous class ----
//		collection.removeIf(new Predicate<String>() {
//
//			@Override
//			public boolean test(String t) {
//				return t.length() <= 1;
//			}
//		});
//	or	collection.removeIf(new ourPredicate());
	}
}

// ---- or ----
//class ourPredicate implements Predicate<String> {
//
//	@Override
//	public boolean test(String t) {
//		return t.length() <= 1;
//	}
//
//}
