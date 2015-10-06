package javaForLoop_Pyramid2;

/*
 * Java Pyramid 2 Example
 * This program shows how to generate a pyramid or triangle like the shown using a for loop
 * 
 * *****
 * ****
 * ***
 * **
 * *
 * 
 */

public class JavaPyramid2 {
	
	public static void main(String[] args){
		
		for(int i = 5; i > 0; i--){
			
			for(int j = 0; j < i; j++){
				System.out.print("*");
			}
			
			// generate a new line
			System.out.println("");
		}
	}
}

/* Output:
 * *****
 * ****
 * ***
 * **
 * *
 *
 */

