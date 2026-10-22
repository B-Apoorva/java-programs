package javaq;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/*
 Write a function that counts the frequency of each element in an array.
Example:
Input: [2, 3, 2, 1, 4, 2]
Output: {2: 3, 3: 1, 1: 1, 4: 1}
Hint: Use a HashMap to store each element and its frequency.

 */

public class WorkingWithMaps {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	HashMap<Integer,Integer> hMap= new HashMap<Integer,Integer>();
	hMap.put(2, 3);
	hMap.put(3,1);
	hMap.put(1,1);
	hMap.put(4,1);
	System.out.println(hMap);
	
/*
  to return the length of the words stored inside in a List as Maps.
 
Sample Input:
3
apple
banana
cherry
 
Sample Output:
{"apple":5, "banana":6, "cherry":6}

 */
	HashMap<List<String>,List<Integer>> hMap1= new HashMap<List<String>,List<Integer>>();
	System.out.println("Enter the number entries: ");
	int n=sc.nextInt();
	ArrayList <String> fruits = new ArrayList<String>();
	ArrayList <Integer>length = new ArrayList<Integer>();
	for(int i=0;i<n;i++) {
		fruits.add(sc.next());
	}
	
	for(String i : fruits) {
		length.add(i.length());
	}
	System.out.println(fruits);
	System.out.println(length);
	
	for(int i=0;i<n;i++) {
		hMap1.put(fruits, length);
	}
	System.out.println(hMap1);
    
	HashMap<String,Integer>hMap2= new HashMap<String,Integer>();
	for(int i=0;i<n;i++) {
	String name=sc.next();
	int nameLength =name.length();
	hMap2.put(name,nameLength);
	}
	System.out.println(hMap2);
	Map<String,Integer>sortedMap = new TreeMap<String,Integer>(hMap2);//Use TreeMap for sorting the elements of the map
	System.out.println(sortedMap);
}
}
