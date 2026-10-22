/*Input: s = "Hello World"
Output: 5

Explanation: The last word is "World" with length 5.
*/


import java.util.Scanner;
public class LastWordLength {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a sentence: ");
	String s1= sc.nextLine();
	s1 = s1.trim();
	int count =0;
	for(int i=s1.length()-1;i>=0;i--) {
		if(s1.charAt(i)==' ') {
			break;
		}
		else {
			count++;
		}
	}
	System.out.println(count);
	
}
}
