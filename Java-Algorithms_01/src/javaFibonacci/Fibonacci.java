package javaFibonacci;

/*
 * Fibonacci Java example
 * This program prints out the first 20 numbers in the Fibonacci sequence.
 * Each number is formated aby adding together the previous two numbers in the
 * sequence, starting with the numbers 0 and 1.
 */

public class Fibonacci {
	
	public static void main(String[] args){
		// initialize some variables
		int current, prev = 1, prevprev = 0;
		
		// Loops exactly 20 times
		for(int i = 0; i < 20; i++){
			//Next number is sum of previous two
			current = prev + prevprev;
			// Print it out
			System.out.println(current + " ");
			// First previous becomes 2nd previous
			prevprev = prev;
			// And current number becomes previous
			prev = current;
		}
		// Terminate the line, and flush output
		System.out.println();
	}
}

/*
Output
1 
2 
3 
5 
8 
13 
21 
34 
55 
89 
144 
233 
377 
610 
987 
1597 
2584 
4181 
6765 
10946 
 */
