/*show a menu to the user : 1. add ; 2. subtract ; 3. multiply 
 * 4. divide 5. remainder ask the user to enter choice ;
 *  if choice is between 1 to 5 ask user to enter 2 numbers ; 
 *  if choice is other than 1 to 5 ask the user to re enter choice 
 
 */
import java.util.Scanner;
public class UserMenu {
public static void main(String[] args) {
	// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println(" Perform the following operations: ");
System.out.println(" 1. add ; 2. subtract ; 3. multiply \r\n"
		+ " * 4. divide 5. remainder ");
 int add = sc.nextInt();
 if(add ==1) {
	 System.out.println("Enter two numbers to perform addition: ");
	 int a = sc.nextInt();
	 int b = sc. nextInt();
	 int sum = a+b;
	 System.out.println("your sum is: " + sum);	 
 }
 else {
	 System.out.println(" 1. add ; 2. substract ; 3. multiply \r\n"
				+ " * 4. divide 5. remainder ");
 }
 int subtract = sc.nextInt();
 if(subtract ==1) {
	 System.out.println("Enter two numbers to perform substract: ");
	 int a = sc.nextInt();
	 int b = sc. nextInt();
	 int substract = a-b;
	 System.out.println("your subtract is: " + substract);	 
 }
 else {
	 System.out.println(" 1. add ; 2. substract ; 3. multiply \r\n"
				+ " * 4. divide 5. remainder ");
 }
 int multiply = sc.nextInt();
 if( multiply ==1) {
	 System.out.println("Enter two numbers to perform substract: ");
	 int a = sc.nextInt();
	 int b = sc. nextInt();
	 int substract = a-b;
	 System.out.println("your subtract is: " + substract);	 
 }
}
}
