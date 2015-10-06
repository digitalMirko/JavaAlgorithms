package javaPrintOddNum;

// Write function to print the odd numbers from 1 to 99

public class PrintOddNums {

	public static void printOdds() {
		for (int i = 1; i < 100; i +=2) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		
		printOdds();
	}
}
