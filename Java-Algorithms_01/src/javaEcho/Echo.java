package javaEcho;

// This program prints out all its command-line arguments

public class Echo {
	
	public static void main(String[] args) {
		
		// Initialize the loop variable
		int i = 0;
		
		// Loop until we reach end of array
		while(i < args.length) {
			
			// Print each argument out
			System.out.println(args[i] + " ");
			// Increment the loop variable
			i++;
		}
		
		// Terminate the line
		System.out.println();
	}

}
