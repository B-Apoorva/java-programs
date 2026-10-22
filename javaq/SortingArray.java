package javaq;
import java.util.Arrays;
public class SortingArray {
public static void main(String[] args) {
	//Sort an array in ascending and descending order -
    //Use Arrays.sort() for ascending.
	//For descending, use Arrays.sort(arr, Collections.reverseOrder()) for objects or custom comparator.
	
	int []array1= {1,5,4,3,2,1}; //includes duplicates
	System.out.println("The given array is : ");
	for(int i=0;i<array1.length;i++) {
		System.out.print(array1[i]+ " ");
	}
	Arrays.sort(array1); //sorts in ascending order
	System.out.println("Sorting Numbers");
	for(int i=0;i<array1.length;i++) {
		System.out.print(array1[i]+ " ");
	}
	// for sorting in descending order :
	System.out.println("\n Sorting Numbers in Descending Orders");
	for(int i=array1.length-1;i>=0;i--) {
		System.out.print(array1[i]+ " ");
	}
	
	
}
}
