package javaForLoop_PrimeNumbers;

// Prime Numbers Java Example
// This program shows how to generate prime numbers 
// between 1 and given number using for loop

// A Prime number can be divided evenly only by 1 or itself.
// And it must be a whole number greater than 1.
// The only even prime number is 2. All other even numbers can be divided by 2.
// If the sum of a number's digit is a multiple of 3, that number can be divided by 3

public class GeneratePrimeNumbersExample {
	
	public static void main(String[] args){
		
		// define limit
		int limit = 100;
		
		System.out.println("Prime numbers between 1 and " + limit);
		
		// loop through the numbers one by one
		for(int i = 1; i < 100; i++) {
			
			boolean isPrime = true;
			
			// check to see if the number is prime
			for(int j = 2; j < i; j++){
				
				if(i % j == 0) {
					isPrime = false;
					break;
				}
			}
			
			// print the number
			if(isPrime)
				System.out.print(i + " ");
		}
	}
}

/* Output:
 * Prime numbers between 1 and 100
 * 1 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 
 * 
 */
