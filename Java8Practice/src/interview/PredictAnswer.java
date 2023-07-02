package interview;

public class PredictAnswer {
	PredictAnswer() {
	      this(20);
	      System.out.println("One");
	   }

		PredictAnswer(int i) {
	      this(null); 
	      System.out.println("Two");	 
	    }

		PredictAnswer(PredictAnswer test) {
	       System.out.println("Three");	  
	 }

	public static void main(String[] args) {
		new PredictAnswer();
	}
}
