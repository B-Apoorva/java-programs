package Day4;

import java.util.HashSet;

public class CommonElementsUsingHashSet {
/*
 Write a function to find the common elements between two arrays.
Example:
array 1 Input: [1, 2, 3, 4] and array 2 [3, 4, 5, 6]
Output: [3, 4]
Hint: Use a HashSet to store elements from one array and check against the other array.
 */
public static void main(String[] args) {
	HashSet <Integer> hs= new HashSet();
	hs.add(1);
	hs.add(2);
	hs.add(3);
	hs.add(4);
	/*int a[]= {3,4,5,6};
	for(Integer o:hs) {
		if(o==a[o]) {
			System.out.println(o);
		}*/
	}
}
