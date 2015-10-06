package javaNthFibNumber;

// Write functions to compute Nth fibonacci number

public class NthFib {
	
	static long fib(int n) {
		return n <=1 ? n: fib(n-1) + fib(n-2);
	}
	
	public static void main (String[] args) {
		
		for (int i = 0; i < 10; i++) {
			System.out.println(fib(i) + ", ");
		}
		System.out.println( fib(10));
	}

}
