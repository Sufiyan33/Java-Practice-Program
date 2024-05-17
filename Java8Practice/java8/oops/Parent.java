package oops;

public class Parent {

	int i = 10;
	private int x = 20;

	public Parent() {
		System.out.println("Super class constructor");
	}

	public Parent(String s) {
		System.out.println("Super class constructor with parameter");
		System.out.println("parameter value is :: " + s);
	}

	public String test() {
		System.err.println("value of x is :: " + x);
		return " Hello super class";
	}
}
