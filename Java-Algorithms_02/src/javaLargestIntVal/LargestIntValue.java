package javaLargestIntVal;

// Find the largest int value in an int array

public class LargestIntValue {
	
	public static int largest (int[] input) {
		int max = Integer.MIN_VALUE;
		for( int i = 0; i < input.length; i++) {
			if(input[i] > max) max = input[i];
		}
		return max;
	}
	
	public static void main(String[] args) {
		int arraySet[] = {12,34,56,77,34,332,22};
		System.out.println(largest(arraySet));  // 332
	}

}
