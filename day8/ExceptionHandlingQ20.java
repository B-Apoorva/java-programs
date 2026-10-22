/*
 Nested Try-Catch Blocks
 // Write a method nestedExceptionHandling that contains 
 //nested try-catch blocks to handle multiple exceptions in a single operation: 
 //dividing two numbers and accessing an array element at a specific index.
 // Handle exceptions for division by zero, array index out of bounds, 
 //and invalid input format.
 
Sample Input 1 (Valid):
 
nestedExceptionHandling("20", "5", arr, 1) // arr[] = {1,2,3,4}
Output: 4 and element: 2
 
Sample Input 2 (Invalid - division by zero and index out of bounds):
 
nestedExceptionHandling("10", "0", arr, 5) // arr[] = {1, 2, 3}
Output: "Error: Division by zero and index out of bounds;" 
 
 */

package day8;
import java.util.Scanner;

public class ExceptionHandlingQ20 {
public static void nestedExceptionHandling(int num3, int num4, int []arr1, int indexValue) {
	int quotient = num3/num4;
	int value = arr1[indexValue];
	System.out.println(quotient+ " and " + value);
	
}
public static void main(String []args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter values: ");
int num1= sc.nextInt();
int num2=sc.nextInt();
int index= sc.nextInt();
try {
    int []arr= {1,2,3,4};
try {
	nestedExceptionHandling(num1,num2,arr,index);
} 
catch(ArithmeticException a) {
	System.out.println("Error: Division by zero");
	
}
}
finally{
	catch (ArrayIndexOutOfBoundsException e) {
	System.out.println("index out of bounds");
}

}
}
}
