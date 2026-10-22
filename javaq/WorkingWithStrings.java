package javaq;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Scanner;
public class WorkingWithStrings {
public static void main(String[] args) {
	
	/* Task 1 : write a java program to Check if a String is Palindrome
	Determine if a given string is a palindrome (a word, phrase, or sequence that reads the same backward as forward).
    */
	
	Scanner sc =new Scanner(System.in);
/*	
	System.out.println("Enter a String to check if it is a palindrome or not: ");
    String myString = sc.next();
    myString= myString.toLowerCase();
    String str="";
    for(int i=myString.length()-1;i>=0;i--) {
    	char ch =myString.charAt(i);
       str= str+ch;
    }
    if(myString.equals(str)) {
    	System.out.println("The given string is a Palidrome");
    }
    else {
    	System.out.println("The given string is not a Palidrome");
    }
    */
//---------------------------------------------------------------------------------------------------------------------------------------------
	
    /*
     * Task 2: 
      Input: s = "the sky is blue"
      Output: "blue is sky the"

    Example 2:
    Input: s = "  hello world  "
    Output: "world hello"
    Explanation: Your reversed string should not contain leading or trailing spaces.

    Example 3:
    Input: s = "a good   example"
    Output: "example good a"
    Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
   */
/*    
   System.out.println("Give a sentence to print in reverse order");
    String mySentence=sc.nextLine();
    
    mySentence.trim();
   String [] stringArray = mySentence.split("\\s+");
    //now print in reverse order
    for(int i=stringArray.length-1;i>=0;i--) {
   
    	System.out.print(stringArray[i]+" ");
    }
    
    */
    
    //output: the sky is blue
   // blue is sky the 
 
  //----------------------------------------------------------------------------------------------------------------------------------------- 
  /*
   Task 3:
   * problem statement 4 : 
 
	Example 1:
	Input: s = "Hello World"
	Output: 5
	Explanation: The last word is "World" with length 5.
	Example 2:
	Input: s = "   fly me   to   the moon  "
	Output: 4
	Explanation: The last word is "moon" with length 4.
 
	Example 3:
	Input: s = "luffy is still joyboy"
	Output: 6
	Explanation: The last word is "joyboy" with length 6.

   */
  /*  
    System.out.println("Give a sentence to count the length of the last word");
    String sentence1= sc.nextLine();
    sentence1.trim();
    String [] myString1 = sentence1.split("\\s+");
    int li= myString1.length-1; //storing the last index in a variable
    String lastWord =myString1[li];// storing the last word in a variable using the index
    System.out.println(lastWord.length()); // printing the length of that string
    */
	
//----------------------------------------------------------------------------------------------------------------------------------------	
    /*
     use below 2 methods to print vowel and consonant
       "aeiou".indexOf  and Character.isLetter
     */
    System.out.println("Enter a string to print vowels and consonants in it : ");
    String inputString=sc.next();
    inputString=inputString.toLowerCase();
    inputString.trim();
    for(int i=0;i<inputString.length();i++) 
    {  
       char ch =inputString.charAt(i);
      if(Character.isLetter(ch)) //Here Character.isLetter(charName) return boolean
      {
         if( "aeiou".indexOf(ch) != -1) //"aeiou".indexOf(charName) return -1 if the character does not contain that characters
         { //here !-1 means it contains those characters
      //learn regEx = "aeiou";
        	  System.out.println(ch + " is a vowel");
         }
         else {
    	        System.out.println(ch + " is a consonant");
              }
       }
    }
    
 //------------------------------------------------------------------------------------------------------------------------------------   
    
    /*
     Find the first and last occurrence of a particular character in a string 
    */
    
   // String input1= sc.next();
    
    ArrayList<String> input = new ArrayList<String>();
    input.
    
  }

}

