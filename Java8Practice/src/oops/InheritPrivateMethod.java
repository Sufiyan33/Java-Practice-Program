package oops;

public class InheritPrivateMethod extends PrivateMethodInParent {

	public void fun() {
		System.out.println("child class fun method");
	}

	public static void main(String[] args) {

		InheritPrivateMethod i = new InheritPrivateMethod();
		i.fun();

		// PrivateMethodInParent p = new InheritPrivateMethod();
		// here we can't call parent private method.

		// it will print child class method or override it succesfully because we are
		// using access modifier in increasing order.
	}
}
