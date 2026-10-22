package Day5;

import java.util.Scanner;
public class RegularExpressionProblem {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	/*
	System.out.println("Enter you age : ");
	int age =sc.nextInt();
	System.out.println("Your age is: "+age);
	System.out.println("Now let us take a String");
	String a =new String("a");
	boolean b = a.matches("[a-z]");
	System.out.println(b);
	String a1 =new String("aaa12");
	boolean b1 = a1.matches("[a-z]");
	System.out.println(b1);
	String a2 =new String("apu");
	boolean b2 = a2.matches("[a-z]{1,4}");
	System.out.println(b2);
	String a3 =new String("Appu");
	boolean b3 = a3.matches("[A-Z][a-z]{1,4}");
	System.out.println(b3);
	*/
	
   System.out.println();
    
    while(true) {
    System.out.println("Enter your age : ");
    String age1=sc.next();
    boolean isAgeValid = age1.matches("[1-9][0-9]");
    if (isAgeValid == true)
       {
    	break;
       }
    }
    while(true) {
        System.out.println("Enter your name : ");
        String name=sc.next();
        boolean isNameValid = name.matches("[A-Z][a-z]{1,8}");
        if (isNameValid == true)
           {
        	System.out.println("Thankyou! " + name);
        	break;
           }
        
        }
    
    System.out.println("Have a great day");
	
}
}
