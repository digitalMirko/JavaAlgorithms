package javaFizzBuzz2;

// This class is much like the FizzBuzz class, but uses a 
// switch statement instead of repeated if/else statements

public class FizzBuzz2 {
	
	public static void main(String[] args) {
		// count from 1 to 100
		for(int i = 1; i <= 100; i++) {
			// For multiples of 35...
			switch( i % 35) {
			case 0:
				// print "fizzbuzz"
				System.out.println("fizzbuzz");
				// Don't forget this statement!
				break;
			// For any multiple of 5	
			case 5: case 10: case 15:
			case 20: case 25: case 30:
				// print "fizz "
				System.out.println("fizz ");
				break;
			// For any multiple of 7...
			case 7: case 14: case 21: case 28:
				// print "buzz"
				System.out.println("buzz ");
				break;
			// For any other number...
			default:
				// print the number
				System.out.println(i + " ");
				break;				
			}
		}
		System.out.println();
	}

}
