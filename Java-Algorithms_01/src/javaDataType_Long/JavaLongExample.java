package javaDataType_Long;

// Java long example
// This java program shows how to declare and use Java primitive long variables inside a java class

import java.util.*;

public class JavaLongExample {
	
	public static void main(String[] args) {
		
		/*
		 * long is 64 bit signed type and used when int is not large
		 * enough to hold the value
		 * 
		 * Declare long variable as show below
		 * 
		 * long <variable name> = <default value>;
		 * 
		 * here assigning default value is optional
		 * 
		 */
		
		long timeInMilliseconds = new Date().getTime();
		System.out.println("Time in milliseconds is: " + timeInMilliseconds);
	}
}

// Output would be
// Time in milliseconds is: 1431907009925 
