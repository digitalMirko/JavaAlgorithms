package javaReverseNumber2;

// Write a program to reverse a number
/* Write a program to reverse a number using numeric operations
 * This example shows how to reverse a number using numeric operations * 
 */

public class NumberReverse {
	
	public int reverseNumber(int number) {
		
		int reverse = 0;
		while(number != 0){
			reverse = (reverse*10)+(number%10);
			number = number/10;
		}
		return reverse;
	}
	
	public static void main(String[] args){
		NumberReverse nr = new NumberReverse();
		System.out.println("Result: " + nr.reverseNumber(17868));
	}
}

// Output:
// Result: 86871
