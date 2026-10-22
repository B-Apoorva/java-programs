package javaq;
import java.util.Scanner;
public class ReverseStringWithDuplicates {
public static void main(String[] args) {
	//input: aabbca
	//output: acbbaa3a (reverse of String + maximum frequency of a letter and letter
	Scanner sc=new Scanner(System.in);
	String S1=sc.next();
	S1.trim();
	S1=S1.toLowerCase();
	StringBuffer sb= new StringBuffer(S1);
	sb=sb.reverse();
	int maxCount=0;
	char maxChar=' ';
	for(int i=0;i<S1.length();i++) {
		int count=0;
		char ch=S1.charAt(i);
		count=1;
		for(int j=i+1;j<S1.length();j++) {
		   char ch1=S1.charAt(j);
		   if(ch==ch1) {
			   count++;
		   }
		}
		if(count>maxCount){
			maxCount=count;
			maxChar=ch;
		}
			
	}
	String count1=String.valueOf(maxCount);
	String maxChar1=String.valueOf(maxChar);
	System.out.println(sb+count1+maxChar1);
}
}
