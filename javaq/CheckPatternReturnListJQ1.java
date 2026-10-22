/*Question 1: WAP in java to check for a pattern in a given list of patterns and once verified return the list of patterns.

The pattern contains:
- The first character should be a lowercase alphabet
- The second character should be a number
- The third character should be a uppercase alphabet
- The fourth character should be a number
- The fifth character should be a lowercase alphabet


Sample Input:
6
a1B2c
d11D3
b2R4f
1D2g2
g2T6h
h7J5i

Sample Output:
a1B2c
b2R4f
g2T6h
h7J5i
*/

package javaq;

import java.util.ArrayList;
import java.util.Scanner;
public class CheckPatternReturnListJQ1 {
public static void main(String[]args) {

ArrayList<String>arlst=new ArrayList<String>();
ArrayList<String>newArlst=new ArrayList<String>();
Scanner sc =new Scanner(System.in);
System.out.println("Give the size of the list: ");
int n=sc.nextInt();
for(int i=0;i<n;i++) {
	String value=sc.next();
	arlst.add(value);
}
System.out.println("Your list is: "+arlst);
for(String o:arlst) {
	/*for(int i=0;i<o.length();i++) {
		char ch =o.charAt(i);
		String str=ch+"";*/
		boolean b=o.matches("([a-z][0-9][A-Z][0-9][a-z])");
		if(b==true) {
		    newArlst.add(o);
		}
//}
	/*
		if(i==1) {
			String str=ch+"";
			boolean b=str.matches("[0-9]");
			if(b==true) {
				System.out.print(str);
			}
		}
		if(i==2) {
			String str=ch+"";
			boolean b=str.matches("[A-Z]");
			if(b==true) {
				System.out.print(str);
			}
		}
		if(i==3) {
			String str=ch+"";
			boolean b=str.matches("[0-9]");
			if(b==true) {
				System.out.print(str);
			}
		}
		if(i==4) {
			String str=ch+"";
			boolean b=str.matches("[a-z]");
			if(b==true) {
				System.out.print(str);
			}
		}
		*/
	}
	System.out.println(newArlst);
}
}

