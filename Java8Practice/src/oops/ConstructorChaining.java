package oops;

public class ConstructorChaining extends Parent {

	public ConstructorChaining() {
		System.out.println("child class constructor");
	}

	public ConstructorChaining(String a) {
		super("Super");
		System.out.println("2nd constructor");
	}

	public String test() {
		return "Hello constructor chaining";
	}

	public static void main(String[] args) {
		Parent p = new Parent();
		System.out.println("method calling :: " + p.test());
		System.out.println("------------------------------");
		ConstructorChaining c = new ConstructorChaining("Hello");
		System.out.println("method calling :: " + c.test());

		System.out.println("------------------------------");

		Parent pc = new ConstructorChaining();
		System.out.println("method calling :: " + pc.test());
	}
}
