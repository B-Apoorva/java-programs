package javaq;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
class  Reverse{
	public static void main(String[] args) {
		
/*
 Given a string that contains letters, numbers, and special characters,
  the task is to remove everything except letters (A–Z, a–z) and numbers (0–9). For example:

Input: "Geeks@no.1"
Output: "Geeksno1"


Enter a string: Ap@2u
up@2A

*/
Scanner sc= new Scanner(System.in);

// Removal of specials characters and retaining alphabets and numbers in a string
System.out.println("Enter a string to remove  special characters: ");
String s=sc.next();		
String s1="";
	char []charr=s.toCharArray();
	for(int i=0;i<charr.length;i++) {
	//	if(Character.isLetter(charr[i])|| Character.isDigit(charr[i])) {
		if(Character.isLetter(charr[i])){
			s1=s1+charr[i];
		}
	}
	System.out.println(s1);
	
	System.out.println("Removal of duplicates of the given strings: ");
	LinkedHashSet<Character> lHSet=new LinkedHashSet<Character>();
	for(int i=0;i<s1.length();i++) {
		char ch=s1.charAt(i);
		lHSet.add(ch);
		lHSet.toString();
	}
	
	System.out.println(lHSet);
	
// reversal of a string retaining the special characters in their postions	
	System.out.println("Given a string for it's reversal retaining the special characters in their postions	: ");
	String s2= sc.next();
	char []charr2=s2.toCharArray();
	
//	for(int i=0;i<charr2.length;i++) {
//		for(int j=charr2.length-1;j>=0;j--) {
	int i=0;
	int j=charr2.length-1;
	while(i<j) {
		
			if(!Character.isLetter(charr2[i])) {
				i++;
				continue;
			}
			if(!Character.isLetter(charr2[j])) {
				j--;
				continue;
			}
			char temp=charr2[i];
			charr2[i]=charr2[j];
			charr2[j]=temp;
			i++;
			j--;
	}
//		}
//	}
	for(int num=0;num<charr2.length;num++) {
		System.out.print(charr2[num]);
	}
	
	
	}
}