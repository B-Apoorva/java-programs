package javaq;
import java.util.Arrays;
import java.util.Scanner;
public class SortingStrings {
//Sort a string alphabetically -

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string :");
		String myString = sc.next();
		myString.trim();
		myString=myString.toLowerCase();
		
		/*
		char[]charArray = new char[20];
	    for(int i=0;i<myString.length();i++) {
	    	char ch =myString.charAt(i);
	    	for(int j=0;j<charArray.length;j++) {
	    		charArray[j]= ch;	
	    	}
	    }
	    */
		char[]charArray = myString.toCharArray();
	    Arrays.sort(charArray);
	    System.out.println("Printing the string in ascending order alphabetically : ");
	    for(int i=0;i<charArray.length;i++) {
	    	System.out.print(charArray[i]);
	    	
	    }
	}

}
