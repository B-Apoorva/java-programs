package javaq;

import java.util.Scanner;

public class WorkingWithArrays {
public static void main(String[] args) {
	
/*Search for a specific number in an array and print its index.

Write a program to reverse the elements of an array.

store 5 numbers in an array and print out the total of all elements
 
store 5 numbers in an array and print out the sum of odd elements and sum of even elements of the array 
 
store 5 numbers in an array and print out all the even numbers from this array 
 
store 5 numbers in an array and print  out all the numbers divisible by 5 
 
create 2 arrays of 5 elements each ; create a 3rd array of 10 elements. elements of the 2 arrays must be at alternate position in this 3rd array 
*/
	Scanner sc = new Scanner(System.in);
	int array1[]= new int[5];
/*
	for(int i=0;i<array1.length;i++) 
	{
		System.out.println("Enter a value into the array : ");
		array1[i]=sc.nextInt();
	}
	
	// searching for a specific element (array traversal)
	System.out.println("Enter an element to search : ");
	int element = sc.nextInt();
	
	/*
	  for(int i:array1) {
	 
		if(i==element) {
			System.out.println("The element is found at index : " + array1[i]);
		}
	}
	*/
/*	
	for(int i=0;i<array1.length;i++) {
		if(array1[i]==element) {
			System.out.println("The element is found at index : " + i);
		}
	}
	
	//program to reverse the elements of the array
	System.out.println("The reverse of the array is : ");
	for(int i=array1.length-1;i>=0;i--) 
	{
		System.out.println(array1[i]);
	}
*/
	

	//create 2 arrays of 5 elements each ; 
	//create a 3rd array of 10 elements. elements of the 2 arrays must be at alternate position in this 3rd array 
	
	int array2[]= {1,2,3,4,5};
	int array3[]= {6,7,8,9,10};
	int array4[]=new int[10];
	int next=0;
    int nextInd=0;
	for(int i=0;i<array4.length;i++) {
		if(i%2 ==0) {
			array4[i]=array2[next];
			next++;
		}
		else {
			array4[i]=array3[nextInd];
			nextInd++;
		}
	}
	
	System.out.println("The new array is : ");
	for(int i=0;i<array4.length;i++) {
		System.out.print(array4[i]);
	}
	}
}
