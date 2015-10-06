package javaFizzBuzz;

/*
 * FizzBuzz Java Example
 * This program plays the game "FizzBuzz". It counts to 100, replacing each
 * multiple of 5 with the word "fizz", each multiple of 7 with the word "buzz",
 * and each multiple of both with the word "fizzbuzz". It uses the modulo
 * operator (%) to determine if a number is divisible by another.
 */

// Everything in Java is a class
public class FizzBuzz {
	
	// Every program must have a main method
	public static void main(String[] args){
		
		//count to 1 to 100
		for(int i = 1; i <= 100; i++) {
			// A multiple of both
			if(((i % 5) == 0) && ((i % 7) == 0))
				System.out.println("fizzbuzz");
			// else a multiple of 5
			else if((i % 5) == 0) System.out.println("fizz");
			// else a multiple of 7
			else if((i % 7) == 0) System.out.println("buzz");
			// else just print it
			else System.out.println(i);
			System.out.print(" ") ; 
		}
		System.out.println();  
	}

}
