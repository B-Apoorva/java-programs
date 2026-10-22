package day8;
import java.util.Scanner;
public class ExceptionHandling5 {
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Give a number: ");
	String input = sc.next();
	try {
	int output1 = parseAndMultiply(input);
	System.out.println(output1);
	}
	catch(Exception e) {
		System.out.println("Error: Invalid input");
	}
}
public static int parseAndMultiply(String input1) {
	Integer convert = Integer.parseInt(input1);
	int constant =10;
	int output=convert * constant;
	return output;
}
}
