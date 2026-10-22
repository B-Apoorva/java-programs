package javaq;
import java.util.Scanner;
public class PrintCharacterByCountM1 {
public static void main(String[] args) {
	//input: a4b2c1d0
	//output: aaaabbc
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a String with it's count:");
	String myString=sc.next();
	String newString="";
	int val=0; char ch1=' '; char ch=' ';
	for(int i=0;i<myString.length();i++) {
		 ch=myString.charAt(i);
		 if(Character.isAlphabetic(ch)) {
			 ch1=ch;
		 }
//		if(i%2!=0) {
//			val=Character.getNumericValue(ch);			
//		}
		else {
			// ch1=ch;
			val=Character.getNumericValue(ch);
			for(int j=0;j<val;j++) {
				System.out.print(ch1);
				
				newString=newString+ch1;
			}
		}
		
	}
	System.out.println("\n"+newString);
	

}
}
