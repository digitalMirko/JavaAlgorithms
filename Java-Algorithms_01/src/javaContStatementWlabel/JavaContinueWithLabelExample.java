package javaContStatementWlabel;

// Java continue statement with label example
// This program shows how to use java continue statement to skip to next iteration
// of the labeled loop

public class JavaContinueWithLabelExample {

	public static void main(String[] args){
		
		int intArray[][] = new int[][]{{1,2},{2,3}};
		
		Outer:
			for(int i = 0; i < intArray.length; i++)
			{
				for(int j = 0; j < intArray[i].length; j++)
				{
					if(intArray[i][i] == 3)
						continue Outer;
					System.out.println("Element is: " + intArray[i][j]);
				}
			}
	}	
}

/*
 * Element is: 1
 * Element is: 2
 */