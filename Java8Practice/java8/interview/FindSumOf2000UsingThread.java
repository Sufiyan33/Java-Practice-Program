package interview;

public class FindSumOf2000UsingThread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// find sum of number 1 to 2000 for this using two thread;
		// thread1 1 to 1000
		// thread 1001 to 2000

		long[] res = new long[2];
		Thread thread1 = new Thread(() -> {
			long sum1 = 0;
			for (int i = 1; i <= 1000; i++) {
				sum1 += i;
			}
			res[0] = sum1;

		});

		Thread thread2 = new Thread(() -> {
			long sum2 = 0;
			for (int i = 1001; i <= 2000; i++) {
				sum2 += i;
			}
			res[1] = sum2;
		});
		thread1.start();
		thread2.start();

		thread1.join();
		thread2.join();
		long totalSum = res[0] + res[1];
		System.out.println("Sum: " + totalSum);
	}
}
