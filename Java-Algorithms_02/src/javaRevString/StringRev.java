package javaRevString;

// Write a function to reverse a String

public class StringRev {
	
	public static String reverse(String s ) {
		int length = s.length(), last = length - 1;
		char[] chars = s.toCharArray();
		for(int i = 0; i < length/2; i++) {
			char c = chars[i];
			chars[i] = chars[last - i];
			chars[last - i] = c;
		}
		
		return new String(chars);
	}
	
	public static void main(String[] args) {
		
		String s = "Madam, I'm Adam";
		System.out.println(reverse(s));
	}

}
