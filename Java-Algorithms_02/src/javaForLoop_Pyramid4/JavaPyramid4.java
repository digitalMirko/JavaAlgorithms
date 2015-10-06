package javaForLoop_Pyramid4;

/* Java Pyramid 4 example
 * This program shows how to generate the following pyramid using for loops
 * 
 * 1
 * 12
 * 123
 * 1234
 * 12345
 *
 */
public class JavaPyramid4 {
	
	public static void main(String[] args) {
		
		for(int i = 1; i < 5; i++){
			for(int j = 0; j < i; j++){
				System.out.print(j + 1);
			}
			System.out.println("");
		}
	}
}


/*
 * Output
 * 1
 * 12
 * 123
 * 1234
 * 12345 
 *
 */