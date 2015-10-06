package javaSwapTwoNumWOtempVar;

// How to swap two numbers without using temporary variable?

// Write a program to swap or exchange two numbers.
// You should not use any temporary or third variable to swap

public class MySwappingTwoNumbers {
	
	public static void main(String a[]){
		int x = 10;
		int y = 20;
		System.out.println("Before swap:");
		System.out.println("x value: " + x);
		System.out.println("y value: " + y);
		x = x+y;
		y = x-y;
		x = x-y;
		System.out.println("After swap:");
		System.out.println("x value: " + x);
		System.out.println("y value: " + y);
	}
}

/* Output:
Before swap:
x value: 10
y value: 20
After swap:
x value: 20
y value: 10

*/


