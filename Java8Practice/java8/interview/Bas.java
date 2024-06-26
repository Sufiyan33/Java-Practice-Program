package interview;

public class Bas extends Sup {

	public Bas(String text) {
		// Here you need to call super class constructor. otherwise it will give
		// compilation issue.

		// super(text);
		// i = 2;
	}

	public static void main(String[] args) {
		Bas b = new Bas("Hello");
		System.out.println(b.i);
	}
}
