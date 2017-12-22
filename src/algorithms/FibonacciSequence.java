package algorithms;
public class FibonacciSequence {
	public static void main(String[] args) {
		fib( 0, 1, 1,0);
	}
	static int fib(int a, int b, int c, int t) {
		for (int i = 1; i < 30; i++) {
			c=a+b;
			b=c;
			t=b;
			a=t;
			System.out.println(c);
			
			
		}
		return a;
	}
}
