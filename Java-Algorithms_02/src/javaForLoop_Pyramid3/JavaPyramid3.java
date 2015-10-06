package javaForLoop_Pyramid3;

/*
 * Java Pyramid Example 3
 * This program shows how to generate the following pyramid using for loop
 * 
 * *
 * **
 * ***
 * ****
 * *****
 * ****
 * ***
 * **
 * *
 * 
 */

public class JavaPyramid3 {
	
	public static void main(String[] args){
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 0; j < i; j++){
				System.out.print("*");
			}
			//generate a new line
			System.out.println("");
		}
		
		// creates the second half of the pyramid
		for(int i = 5; i>0; i--){
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			// generate a new line
			System.out.println("");			
		}
	}
}

/* Output
 * 
 * *
 * ** 
 * ***
 * ****
 * *****
 * *****
 * ****
 * ***
 * **
 * *
 * 
 */
