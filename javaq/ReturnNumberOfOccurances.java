/*
 Question 2: WAP in java to count the number of occurrences in the array of strings
  and return the number of occurrences.

countOccurrence(String[] arr): returns the number of occurrences of the word 
found in the array of strings.

Sample Input:
4
The fox is going into the jungle.
The lion is the king.
Fox has jumped over the wall.
Fox has two friends Gary the fox and Matt the turtle
Enter the word to be searched: fox

Sample Output:
4

*/

package javaq;
import java.util.Scanner;

public class ReturnNumberOfOccurances {
	
public static int countOccurence(String []arr,String word) {
	
	int count=0;
	for(int i=0;i<arr.length;i++)
	{
		String s1=arr[i];
		s1.trim();
		String []arr1= s1.split("\\s+");

		for(String o:arr1) 
		{

			String lwr =o.toLowerCase();
			if(lwr.equalsIgnoreCase(word))
		   {
			   count++;
			}
		}
			
	}
		return count;
}
		
public static void main(String[]args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of the array: ");
	int n=sc.nextInt();
	String []arr = new String[n];
	System.out.println("Enter the sentences line by line: ");
	for(int i=0;i<n;i++) 
	{   
		
		arr[i]=sc.nextLine();
	}
	System.out.println();
    System.out.println("Enter the word to be searched: " );
	
	String word = sc.next();
	word=word.toLowerCase();
	sc.close();
	
	int wordCount = countOccurence(arr,word);
	System.out.println(wordCount);
}
}
