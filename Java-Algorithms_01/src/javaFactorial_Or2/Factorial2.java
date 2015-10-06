package javaFactorial_Or2;

// This class shows a recursive method to computer factorials.
// This method calls itself repeatedly based on the formula: n! = n * (n-1)!

public class Factorial2 {
	
	public static long factorial(long x) {
		if(x == 1) return 1;
		else return x * factorial(x-1);
	}

}
