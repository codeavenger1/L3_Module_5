package algorithms;
public class FibonacciSequence {
	public static void main(String[] args) {
		fib(0, 1);
	}
	static int fib(int a, int b) {
		for (int i = 1; i < 30; i++) {
			int c;
			int t;
			c=a+b;
			t=b;
			b=c;
			
			a=t;
			System.out.println(c);
			
			
		}
		return a;
	}
}