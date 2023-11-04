package oops;

public class B extends A {

	public void display() {
		System.out.println("Shuold dispplay method of class B");
		super.display();
	}

	public static void main(String[] args) {
		A a = new B();
		a.display();
	}
}
