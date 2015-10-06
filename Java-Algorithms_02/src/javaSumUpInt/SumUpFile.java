package javaSumUpInt;

import java.io.BufferedReader;
import java.io.FileReader;

// Write a function that sums up integers from a text file, one int per line

public class SumUpFile {
	
	public static void sumFile(String name) {
		try {
			int total = 0;
			BufferedReader in = new BufferedReader (new FileReader (name));
			for( String s = in.readLine(); s !=null; s = in.readLine()) {
				total += Integer.parseInt(s);
			}
			
			System.out.println(total);
			in.close();
		}
		catch (Exception xc) {
			xc.printStackTrace();
		}
	}
	
	public static void main(String[] args){
		
		String qr = "cityTemps.txt";
		sumFile(qr);
	}

}
