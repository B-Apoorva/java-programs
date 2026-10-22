package Day6;

import java.util.Arrays;

public class ArrayElements {
	public static void main(String[] args) {
		int array1[] = new int[3];
		array1[0]=1;
		array1[1]=2;
		array1[2]=3;
		
		String array2[]= {"Apoorva" , "Neha", "Pallabi"};
		//ArrayElements ae= new ArrayElements(); -- for non static method
		ArrayElements.displayValues(array1, array2);
	}
	static void displayValues(int [] array3, String []array4) { //this is a static method
		//System.out.println(array3);// prints address of the array
		
		for(int i =0;i<array3.length;i++) {
			System.out.println(array3[i]);
		}
		//System.out.println(array4);// prints address of the array
		
		// now to print the int array in a String format without using forloop:
		 System.out.println(Arrays.toString(array3));
		
		for(int i =0;i<array4.length;i++) {
			System.out.println(array4[i]);
		}
		
		 System.out.println(Arrays.toString(array4));
		
		
		
	}

}
