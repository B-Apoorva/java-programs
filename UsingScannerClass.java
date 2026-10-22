import java.util.Scanner;

public class UsingScannerClass {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter your name: ");
	String name = sc.nextLine();
	System.out.println("Hello "+name);
	System.out.println("Enter your age: ");
	int age= sc.nextInt();
	if(age>18) {
	System.out.println("You are an adult");
	}
	else {
		System.out.println("You are a minor");
	}
	System.out.println("Enter you weight: ");
	float weight = sc.nextFloat();
	System.out.println("your body weight is: "+weight);
}
}
