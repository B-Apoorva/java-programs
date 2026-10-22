package Day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WorkingWithArrayClass {
public static void main(String[] args) {
	//call the static method of binary search of arrays class
	int a[]= {10,20,30,40,50};
	int b = Arrays.binarySearch(a, 50);
	System.out.println("The index where 10 is found is : "+ b);
	int c[]= {50,20,30,40,10};
	int d = Arrays.binarySearch(c, 20);
	System.out.println("The index where 10 is found is : "+ d);
	//binary search will only work when the array is sorted
	Arrays.sort(c);
	for(int i=0;i<c.length;i++) {
		System.out.print(c[i] + " ");
	}
	System.out.println();
	int e = Arrays.binarySearch(c, 20);
	System.out.println("The index where 10 is found is : "+ e);
	
	String []arr= {"Ramya", "Apoorva","Swarupa"};
	Arrays.sort(arr);
	for(int i=0;i<arr.length;i++) {
	System.out.println(arr[i]);
	}
	
	List l = Arrays.asList(arr); // array is converted into list
	System.out.println("The list is : "+l);
	
	ArrayList al = new ArrayList();//insert parameter
	
}
}
