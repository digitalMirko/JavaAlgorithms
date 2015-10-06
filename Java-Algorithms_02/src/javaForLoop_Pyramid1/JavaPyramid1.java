package javaForLoop_Pyramid1;

/*
 * Java Pyramid 1 Example
 * This program shows how to generate a pyramid or triangle like shown using a for loop
 *  *
 *  **
 *  ***
 *  ****
 *  *****
 */

public class JavaPyramid1 {
	
	public static void main(String[] args) {
		
		for(int i = 1; i <= 5; i++){
			
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			
			// generate a new line
			System.out.println("");
		}
	}
}

/* Output would be:
 * *
 * **
 * ***
 * ****
 * *****
 *
 */
