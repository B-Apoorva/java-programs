//write a java program to Check if a String is Palindrome
//Determine if a given string is a palindrome 
//(a word, phrase, or sequence that reads the same backward as forward).
// ex: Madam, Civic, Dad, Level, Bob, noon, mom, eve

import java.util.Scanner;

public class PalindromeString {
public static void main(String[] args) {
	char c=0, ch=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a String to check if it is Palindrome or not : ");
	String word= sc.nextLine();
	word= word.toLowerCase();
	System.out.println("Your given String is : ");
	for(int i=0; i<word.length();i++) {
		 c = word.charAt(i);
		System.out.print(c);
	}
	System.out.println();
	System.out.println("The reverse of your given String is : ");
	for(int j=word.length()-1;j >=0;j--) {
		 ch = word.charAt(j);
		System.out.print(ch);
	}
	System.out.println();
	if (c == ch) {
		System.out.println("So,The given String is a Plaindrome");
	}
	else {
		System.out.println("So,The given String is not a Plaindrome");
	}
	
/*	System.out.println("Give another String: ");
	StringBuffer sb1 = new StringBuffer("hi");
		StringBuffer sb2 = new StringBuffer("hi");
		
		String s1= sb1.toString();
		String s2= sb2.toString();
		
		boolean b1 = s1.equals(s2);
		System.out.println(b1);
		
		boolean b2 = sb1.equals(sb2);
		System.out.println(b2);
	*/
}
}
