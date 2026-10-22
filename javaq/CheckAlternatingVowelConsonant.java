/*
Question 3: WAP in Java to check if the given strings have alternating vowels and consonants.

The first character should be a vowel.
The second character should be a consonant.
The pattern continues alternately for the length of the string.
Return the list of strings that match this pattern.

Sample Input: 6
apple
orange
amiable
oxford
unicorn
empathy

Sample Output:
oxford
unicorn
empathy

*/

package javaq;
import java.util.ArrayList;
import java.util.Scanner;

public class CheckAlternatingVowelConsonant {
	public static void main(String[] args) {
		
		ArrayList<String> arlst =new ArrayList<String>();
		System.out.println("Enter the length of the array : ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//sc.nextLine();
		System.out.println("Enter you words: ");
		for(int i=0;i<n;i++) {
			arlst.add(sc.next());
		}
		
		boolean b=true;
		for(String o:arlst)
		{  
			o=o.toLowerCase();
			String str=o.trim();
			for(int i =0;i<str.length();i++) 
			{
				if(i%2 ==0) 
				{
				   char letter1 = str.charAt(i);
				   if(!(letter1=='a'||letter1=='e'||letter1=='i'||letter1=='o'||letter1=='u') )
				   {
					   b=false;
				   }
				 
			    }
				else if(i%2!=0) {
					char letter1 = str.charAt(i);
				  if(letter1=='a'||letter1=='e'||letter1=='i'||letter1=='o'||letter1=='u'){
					  b=false;
				  }
				}
			}
			if(b==true) {
				System.out.println(str);
			}
		}
		
		//System.out.println(s);
			/*if((firstLetter=='A'||firstLetter=='E'||firstLetter=='I'||firstLetter=='O'||firstLetter=='U') {
				String string1=firstLetter+"";
			}
			
			*/	
		
			/*char ch =str.charAt(i);
			String str1=ch+"";
			boolean b=str1.matches("[a,e,i,o,u]");
			*/
			

	}		
	

}
