package oops;

class Child extends Parent {

	int b = 15;
	int i = 16;
	public Child() {
		System.out.println("Child class constructor");
	}

	public String test() {
		return " Hello Inheritence";
	}

	public String printString() {
		return "print string in above method";
	}

	public static void main(String[] args) {
		// Child c = new Child();
		// Parent c = new Parent();
		// System.out.println("method return is ::" + c.test());
		// System.out.println("method return is ::" + ci.test());

		Parent c = new Child();
		System.out.println("method return is :: " + c.test());
		System.out.println("value of vaiable is :: " + c.i);

		// Example of up casting.
		/*
		 * if you are creating Parent object with reference in child then you will be
		 * able to access only parent class member.
		 */
		Parent p = new Child();
		System.err.println("Example of upp casting :: " + p.test());

		// Example of down casting.

		// Child child = new Parent(); directly not possible.

		/*
		 * Directly conversion are not possible. First create parent instance then child
		 * instance and post that do explicit type casting.
		 */

		Parent parent = new Parent();
		Child child = new Child();
		parent = child;
		child = (Child) parent;

		System.err.println("Example of down casting :: " + child.printString());
		
		System.out.println("-----------------------------");
		Child child1 = new Child();
		child1.b = 20;
		child1.i = 20;
		System.out.println(child1.b + " " + child1.i);
		
		
	}
}
