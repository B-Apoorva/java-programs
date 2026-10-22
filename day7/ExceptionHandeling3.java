/*Question 11: Samuel is given a String which contains some numbers and alphabets.
He must implement a method numberSegregator(String s) to remove the numbers
from the string and store in a List.
It the String doesn't have any number then, the method should throw an
"Invalid Input" exception.
 
 
Sample Input 1:
dgarg534htyty6758gh56
 
Sample Output 1:
[534, 6758, 56]
 
Sample Input 2:
dgarghtytygh
 
Sample Output 1:
Invalid Input*/


package day7;

import java.util.ArrayList;

public class ExceptionHandeling3 {
	public static ArrayList numberSegregator(String s) throws Exception
	{
		boolean isLetter=false;
		int n = s.length();
		ArrayList <Integer>a=new ArrayList<Integer>();
		for(int i=0 ; i<n;i++)
			
		{
			char ch=s.charAt(i);
			//boolean b=Character.isDigit(ch);
			boolean b=(""+ch).matches("[0-9]");
			if(b==true)
			{
				a.add(Integer.parseInt(""+ch));
			
			}
			else
			{
				isLetter=true;
				char c=' ';
				a.add(Integer.parseInt(""+c));
			}
		}
		if(isLetter==true && a.size()==0)
		{
			throw new Exception("invalid input");
			
		}
		else
		{
		return a;
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s1="dgarg534htyty6758gh56";
      // String s1= "adbskjalfjlef";
 
       try{
    	   ArrayList a1=numberSegregator(s1);
           System.out.println(a1);
       }
       catch (Exception e)
       {
    	   System.out.println("Invalid ");
       }
       
	}
 
}


