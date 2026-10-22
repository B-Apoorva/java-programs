package javaq;
import java.util.Arrays;
public class WorkingWithArraysClass {
public static void main(String[] args) {
	
	//create an integer array
	// Call the static method of binary search of array class
	//But note: binarySearch only work in sorted array
	
	int [] array1= {20,10,30,50,40};
	// for sorting we can call the sort() present in Arrays class
	//import the Arrays class first
	Arrays.sort(array1); // now the array will be sorted in ascending order.
	
	for(int i=0;i<array1.length;i++) {
		System.out.println("The elements in the array are: " + array1[i]);
	}
	
	int index = Arrays.binarySearch(array1, 40); // syntax: binarySearch(int arrayName, value to be searched) -- returns index
	System.out.println("The value is found at index : " + index);
	
	//learn other Array methods such as : toString, equals, mismatch etc
	
	//task: Declare an array of strings
	
	String [] array2 = {"ball", "Apple","cat","elephant","Dog"};
	Arrays.sort(array2);
	
	for(int i=0;i<array2.length;i++)
	{
	  System.out.println(array2[i]);
	}
	
/* output : Apple
	        Dog
	        ball
	        cat
	        elephant */
	
	// task: convert the array as list
	
//	List myList = Arrays.asList(array2);
}
}
