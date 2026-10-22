package javaq;

import java.util.ArrayList;
import java.util.Scanner;
import java.math.*;
public class EvenPerfectSquareNumbers {
public static void main(String[] args) {
	ArrayList<Integer> arlst=new ArrayList<Integer>(); //Arrays.asList{89,67,100,25,16};
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of elements: ");
	int n=sc.nextInt();
	for(int i=0;i<n;i++) {		
		arlst.add(sc.nextInt());
	}
	int a[]= {};
	int j=0;
//89,67,100,25,16
	for(int i:arlst) {
		if(i>0 && i%2==0) {
			double sqrt=Math.sqrt(i);
			a[j]=i;
			j++;
		}
		else {
			System.out.println("invalidListException");
		}
	}
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i] +",");
	}
}
}
