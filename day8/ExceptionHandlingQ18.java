/*
Question 18: Custom Exception for Age Validation 
//Write a method checkAge that takes an integer representing a person's age 
//and throws a custom InvalidAgeException if the age is less than 18. 
//Otherwise, it returns a message saying the person is eligible.
 
Sample Input 1 (Valid):
 
checkAge(20)
Output: "Eligible"
 
Sample Input 2 (Invalid - age too low):
 
checkAge(15)
Output: "InvalidAgeException: Age must be 18 or above"
*/
package day8;
import java.util.Scanner;
public class ExceptionHandlingQ18 {
public static String checkAge(int age1) throws Exception {
	if(age1<18) {
		throw new Exception();
	}
	return "Eligible";
}


public static void main(String[] args)throws Exception {
	Scanner sc = new Scanner(System.in);
	int age=sc.nextInt();
	try {
	String eligibility = checkAge(age);
	System.out.println(eligibility);
	}
	catch(Exception e) {
		System.out.println("InvalidAgeException: Age must be 18 or above");
	}
}
}
