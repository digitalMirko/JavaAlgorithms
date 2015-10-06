package javaLineMaxWordCount;

/* Write a program to get a line with max word count from the given file
 * 
 * Below's example shows how to find out the line with maximum number of word count 
 * in the given file. In case if it has multiple lines with max number of words, 
 * then it has to list all those lines. 
 */

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MaxWordCountInLine {
	
	private int currentMaxCount = 0;
	private List<String> lines = new ArrayList<String>();
	
	public void readMaxLineCount(String fileName){
		
		FileInputStream fis = null;
		DataInputStream dis = null;
		BufferedReader br = null;
		
		try {
			fis = new FileInputStream(fileName);
			dis = new DataInputStream(fis);
			br = new BufferedReader(new InputStreamReader(dis));
			String line = null;
			while((line = br.readLine()) != null){
				
				int count = (line.split("\\s+")).length;
				if(count > currentMaxCount){
					lines.clear();
					lines.add(line);
					currentMaxCount = count;
				} else if(count == currentMaxCount){
					lines.add(line);
				}
			}
		} catch (FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e){
			e.printStackTrace();
		} finally {
			try {
				if(br != null) br.close();
			} catch(Exception ex) {}
		}
	}

	public int getCurrentMaxCount() {
		return currentMaxCount;
	}
	
	public void setCurrentMaxCount(int currentMaxCount){
		this.currentMaxCount = currentMaxCount;
	}
	
	public List<String> getLines() {
		return lines;
	}
	
	public void setLines(List<String> lines){
		this.lines = lines;
	}
	
	public static void main(String a[]){
		
		MaxWordCountInLine mdc = new MaxWordCountInLine();
		mdc.readMaxLineCount("c:/MyTestFile2.txt");
		System.out.println("Max number of words in a line is: "+mdc.getCurrentMaxCount());
		System.out.println("Line with max word count: ");
		List<String> lines = mdc.getLines();
		for(String l:lines){
			System.out.println(l);
		}
	}
}


/* Output:
Max number of words in a line is: 13
Line with max word count: 
true, false, and null might seem like keywords, but they are actually literals.
*/
