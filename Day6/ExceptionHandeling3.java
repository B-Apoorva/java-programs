/*
	Question 12: Jyoti is given an Integer array of N size.
	She needs to calculate the sum of the reciprocal of square of the numbers in the Array.
	If there is any Exception then it should throw "Invalid Try".
	 
	Sample Input 1
	5
	2 4 0 3 2
	 
	Sample Output 1
	0.6736
	 
	Explanation:
	 
	Sum = 1/(2*2) + 1/(4*4) + 1/(3*3) + 1/(2*2)  // ignore zero as 1/0 is not possible
	    = 1/4 + 1/16 + 1/9 + 1/4 = 0.67361111
	 
	Sample Input 2
	5
	2 4 a
	 
	Sample Output 1
	Invalid Try
	*/

	package Day6;
	import java.util.Scanner;
	public class ExceptionHandeling3  {
	public static void main(String[] args)throws Exception {
	 Scanner sc = new Scanner(System.in);
	 int n=sc.nextInt();
	 int a[] = new int[n];
	
	 for(int i=0;i<n;i++) {
		 a[i]=sc.nextInt();
	 }
	 sc.close();
	 double sum=0;
	 try {
	 for(int j=0;j<n;j++) 
	 { 
		int square = a[j]*a[j];
	    double receprocal = 1/square;
	    sum = sum+receprocal;
	 }
	 System.out.println(sum);
	 }
	 catch(Exception e) {
		 System.out.println("Invalid Try");
	 }
	
	}
}
