package javaEchoReverse;

// This program echos the command-line arguments backwards

public class Reverse {
	
	public static void main(String[] args) {
		
		// Loop backwards through then array of arguments
		for(int i = args.length-1; i >=0; i--) {
			//Loop backwards through the characters in each argument
			for(int j = args[i].length()-1; j >= 0; j--){
				//Print out character j of argument i
				System.out.println(args[i].charAt(j));
			}
			//add a space at the end of each argument
			System.out.print(" ");
		}
		// and terminate the line when we're done
		System.out.println();
	}

}
