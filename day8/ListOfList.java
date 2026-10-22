//List of List of String
//Input combination of UpperCase, LowerCase and Numbers.
//Pick up all the UpperCase letters and store in one list.
//all the LowerCase letters in other list and all the numbers in the third list.
package day8;
import java.util.ArrayList;
import java.util.Scanner;
public class ListOfList {
public static void main(String[] args) {
ArrayList <ArrayList<String>>arlst1 =new ArrayList <ArrayList<String>>();
ArrayList <String> arlst2 =new ArrayList<String>();
ArrayList <String> arlst3 =new ArrayList<String>();
ArrayList <String> arlst4 =new ArrayList<String>();
Scanner sc =new Scanner(System.in);
	String str =sc.nextLine();
	for(int i=0;i<str.length();i++) {
		char ch = str.charAt(i);
		String s1= ""+ch;
		if (s1.matches("[A-Z]")) {
			arlst2.add(s1);
		}
		if (s1.matches("[a-z]")) {
			arlst3.add(s1);
		}
		if (s1.matches("[0-9]")) {
			arlst4.add(s1);
		}	
	}
	System.out.println(arlst2);
	System.out.println(arlst3);
	System.out.println(arlst4);
	
	arlst1.add(arlst2);
	arlst1.add(arlst3);
	arlst1.add(arlst4);
	System.out.println(arlst1);
	sc.close();

}
}