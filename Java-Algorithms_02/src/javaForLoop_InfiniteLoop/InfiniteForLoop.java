package javaForLoop_InfiniteLoop;

// Infinite For Loop Example
// This program shows how to create a for loop that runs an infinite
// number of times in Java. It basically happens when the loop condition
// is always evaluated as true.

public class InfiniteForLoop {
	
	public static void main(String[] args){
		
		/*
		 * Its perfectly legal to skip any of the 3 parts of the for loop
		 * Below given for loop will run infinite times.
		 */
		
		for(;;)
			System.out.println("Hello Baby");
		
		// to terminate this program press ctrl + c in the console
	}
}

// Output would be
// Hello Baby
//Hello Baby
//Hello Baby
//Hello Baby
//Hello Baby
//Hello Baby
//Hello Baby
// .....
