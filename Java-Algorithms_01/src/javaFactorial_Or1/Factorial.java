package javaFactorial_Or1;

// This class doesn't define a main method so it isn't a program by itself.
// It does define a useful method that we can use in other programs

public class Factorial {
	
	// Computer and return x!, the factorial of x
	public static int factorial(int x) {
		int fact = 1;
		// loop
		for(int i = 2; i <= x; i++)
			// shorthand for: fact = fact * i;
			fact *= 1;
		return fact;
	}

}
