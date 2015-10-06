package javaDistElemFromArrayAvoidDupEl;

/* How to get distinct elements from an array by avoiding duplicate elements
 * 
 * The example below shows how to avoid duplicate elements from an array
 * and display only distinct elements. Using only arrays to process it. 
 */

public class MyDistinctElements {
	
	public static void printDistinctElements(int[] arr){
		
		for(int i = 0; i < arr.length; i++){
			boolean isDistinct = false;
			for(int j=0; j<i; j++){
				if(arr[i] == arr[j]){
					isDistinct = true;
					break;
				}
			}
			if(!isDistinct){
				System.out.print(arr[i]+ " ");
			}
		}
	}
	public static void main(String a[]){
		int[] nums = {5, 2, 7, 2, 4, 7, 8, 2, 3};
		MyDistinctElements.printDistinctElements(nums);
	}
}


// Output:

// 5 2 7 4 8 3 