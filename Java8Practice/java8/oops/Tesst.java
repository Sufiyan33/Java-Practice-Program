package oops;

public class Tesst {

		// create a private variable.

		private static Tesst TESST_SS;
		// create a private constructor.

		private Tesst() {

		}
		// the method should be public static.

		public static synchronized Tesst getInstance() {

			if (TESST_SS == null) {
				Tesst t = new Tesst();
				return t;

			}
			return TESST_SS;
		}
}
