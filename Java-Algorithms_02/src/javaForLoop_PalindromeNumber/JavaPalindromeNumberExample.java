package javaForLoop_PalindromeNumber;

// Java Palindrome Number Example
// This program shows how to find if the given number
// is a palindrome number or not

public class JavaPalindromeNumberExample {
	
	public static void main(String[] args){
		
		// array of numbers to be checked
		int numbers[] = new int[]{121,13,34,11,22,54};
		
		// iterate through the numbers
		for(int i = 0; i < numbers.length; i++){
			
			int number = numbers[i];
			int reversedNumber = 0;
			int temp = 0;
			
			/*
			 * If the number is equal to its reversed number,
			 * then the given number is a palindrome number
			 * 
			 * For example, 121 is a palindrome while 12 is not
			 * 
			 */
			
			// reverse the number
			while(number > 0) {
				temp = number % 10;
				number = number / 10;
				reversedNumber = reversedNumber * 10 + temp;
			}
			
			if(numbers[i] == reversedNumber)
				System.out.println(numbers[i] + " is a palindrome number");
			else 
				System.out.println(numbers[i] + " is not a palindrome number");
		}		
	}
}

/*
 * Output:
 * 
 * 121 is a palindrome number
 * 13 is not a palindrome number
 * 34 is not a palindrome number
 * 11 is a palindrome number
 * 22 is a palindrome number
 * 54 is not a palindrome number
 * 
 */
