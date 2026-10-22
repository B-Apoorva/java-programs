package javaq;
//declare a string variable store the word capgemini
//print out whether the each letter is vowel or consonant
import java.util.Scanner;
public class PrintVowelOrConsonant {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	String name= sc.nextLine();
	for(int i=0;i<name.length();i++) {
		char ch = name.charAt(i);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			System.out.println(ch + " is a vowel");
		}
		else {
			System.out.println(ch + " is a consonant");
		}
	}
}
}
