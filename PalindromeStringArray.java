import java.util.Scanner;

public class PalindromeStringArray {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a sentence: ");
	String s1= sc.nextLine();
	s1= s1.trim();
	String []s2 = s1.split("\\s+");
	for(int i=s2.length-1; i>=0;i--) {
		System.out.print(s2[i]);
		if(i!=0) {
		System.out.print(" ");
		}
	}
	
}
}
