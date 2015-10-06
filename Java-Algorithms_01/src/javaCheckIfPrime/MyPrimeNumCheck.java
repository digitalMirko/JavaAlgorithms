package javaCheckIfPrime;

/* Write a program to check the given number is a prime number or not?
 * 
 * A prime number (or a prime) is a natural number greater than 1 that has no positive divisor other than 1
 * and itself. A natural number greater than 1 that is not a prime number is called a composite number. For
 * example, 5 is a prime, as only 1 and 5 divide it, where as 6 is composite, since it has the divisors 2 
 * and 3 in addition to 1 and 6. The fundamental theorm of arithmetic establishes the central role of
 * primes in number theory: any integer greater than 1 can be expressed as product of primes that is unique
 * up to the ordering. This Theorm requires excluding 1 as a prime.
 */

public class MyPrimeNumCheck {
	
	public boolean isPrimeNumber(int number) {
		
		for(int i = 2; i<=number/2; i++){
			if(number % i == 0){
				return false;
			}
		}
		return true;
	}

	public static void main(String a[]){
		MyPrimeNumCheck mpc = new MyPrimeNumCheck();
		System.out.println("Is 17 prime number? " +mpc.isPrimeNumber(17));
		System.out.println("Is 19 prime number? " +mpc.isPrimeNumber(19));
		System.out.println("Is 15 prime number? " +mpc.isPrimeNumber(15));
	}
}

// Output:

// Is 17 prime number? true
// Is 19 prime number? true
// Is 15 prime number? false