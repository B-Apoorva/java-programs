package javaq;
/*
Write a function that reverses the words in a given sentence without changing the order of the words.
Example:
Input: "I love programming"
Output: "programming love I"
 */

import java.util.Scanner;
public class WorkingWithFunctions {

public static void reverse(String sentence) {
	sentence.trim();
	String [] splitWords =sentence.split("\\s+"); // .split() returns a String array

	//print the words in reverse order
	for(int i=splitWords.length-1;i>=0;i--) {
		System.out.print(splitWords[i]+ " ");
	}

		
}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a word for reversal : ");
	String sentence = sc.nextLine();
	WorkingWithFunctions.reverse(sentence);
	
}
}
