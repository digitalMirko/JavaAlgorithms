package javaForLoop_Pyramid6;

/*
 * Java Pyramid 6 Example
 * This program shows how to generate the pyramid show below using for loops
 * 
 *  *****
 *  ****
 *  ***
 *  **
 *  *
 *  *
 *  **
 *  ***
 *  ****
 *  *****
 * 
 */

public class JavaPyramid6 {
	
	public static void main(String[] args){
		
		// generate upper half of the pyramid
		for(int i = 5; i > 0; i--){
			for(int j = 0; j < i; j++){
				System.out.print("*");
			}
			// creates a new line
			System.out.println("");
		}
		
		// generate bottom half of the pyramid
		for(int i = 1; i<=5; i++){
			for(int j = 0; j < i; j++){
				System.out.print("*");
			}
			// creates a new line
			System.out.println("");
		}
	}
}

/*
 * Outputs:
 * 
 * *****
 * ****
 * ***
 * **
 * *
 * *
 * **
 * ***
 * ****
 * *****
 * 
 */
