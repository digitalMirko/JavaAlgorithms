package javaForLoop_DeclareMultipleVariables;

// Declare multiple variables in for loop Example
// This program shows how to declare multiple variables in Java
// For loop using declaration block

public class DeclaringMultipleVariablesInForLoopExample {

	public static void main(String[] args) {
		
		// Multiple variables can be declared in declaration block of for loop
		
		for(int i = 0, j = 1, k = 2; i < 5; i++)
			System.out.println("I: " + i + ", j: " + j + ", k: " + k);
		
		// Note: that the variables which are declared, 
		// should all be of the same type as in this example int
		
		// This will not compile
		// for(int i = 0, float j; i < 5; i++)
	}
}

/* Output:
 * I: 0, j: 1, k: 2
 * I: 1, j: 1, k: 2
 * I: 2, j: 1, k: 2
 * I: 3, j: 1, k: 2
 * I: 4, j: 1, k: 2
 * 
 */
