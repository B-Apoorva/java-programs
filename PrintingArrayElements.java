
//store 5 numbers in an array and print out the total of all elements
import java.util.Scanner;

public class PrintingArrayElements {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int []a=new int[5];
	for(int i=0;i<a.length;i++) {
		System.out.println("enter a number: ");
		a[i]=sc.nextInt();
	}
	int sum =0;
	for(int j=0;j<a.length;j++) {
		sum=sum+a[j];
	}
	System.out.println("The sum is: "+sum);
	
//	store 5 numbers in an array and print out the sum of odd elements and sum of even elements of the array
	int oddSum=0 , evenSum=0;
	for (int i =0; i<a.length;i++) {
		if(a[i]%2 !=0) {
			oddSum=oddSum+a[i];
		}
		
	else{
			evenSum=evenSum+a[i];
		}
		
	}
	System.out.println("The sum of odd numbers is: "+ oddSum);
	System.out.println("The sum of odd numbers is: "+ evenSum);
	
//store 5 numbers in an array and print out all the even numbers from this array 
	for(int i=0;i<a.length;i++) {
		if(a[i]%2 ==0) {
			System.out.println("The even numbers are : " + a[i]);
		}
		
	}
	
//store 5 numbers in an array and print  out all the numbers divisible by 5
	for(int i=0;i<a.length;i++) {
		if(a[i]%5 ==0) {
			System.out.println("The numbers divisible by 5 are : " + a[i]);
		}
		
	}
	System.out.println("Enter another array of 5 inegers : ");
	int []b=new int[5];
	for(int i=0;i<b.length;i++) {
		b[i]=sc.nextInt();
	}
	int j=0;
	int k=0;
	int []c = new int[10];
	for(int i=0;i<c.length;i++) {
		if(i%2==0) {
			c[i]=a[j];
			j++;
		}
		else {
			c[i]=b[k];
			k++;
		}
	}
	for(int i=0;i<c.length;i++) {
		System.out.print(c[i]);
	}
	
}
}
