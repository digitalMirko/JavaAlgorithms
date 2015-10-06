package javaForLoop_Pyramid5;

/*
 * Java Pyramid 5 Example
 * This program shows how to generate a pyramid or triangle as shown below using for loop
 * 
 * 12345
 * 1234
 * 123
 * 12
 * 1
 * 
 */

public class JavaPyramid5 {
	
	public static void main(String[] args){
		
		for(int i = 5; i > 0; i--){
			for(int j = 0; j < i; j++){
				System.out.print(j+1);
			}
			System.out.println("");
		}
	}
}

/*
 * Output
 * 12345
 * 1234
 * 123
 * 12
 * 1
 *
 */