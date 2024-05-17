package oops;

public class StaticBlock extends Parent {

	{
		System.out.println("static block");
	}

	public static void main(String[] args) {
		Parent p = new StaticBlock();
		System.out.println("method return is :: " + p.test());
	}
}
