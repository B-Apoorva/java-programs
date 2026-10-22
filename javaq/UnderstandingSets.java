package javaq;

import java.util.ArrayList;
import java.util.HashSet;

/*
 2. Find Duplicates in an ArrayList
 
Given an ArrayList of integers, find and print the duplicates.
 
Input:
 
· A list of integers.
 
Output:
 
· The duplicate elements from the list.

 */
public class UnderstandingSets {
public static void main(String[] args) {
	ArrayList <Integer> list1= new ArrayList<Integer>();
	list1.add(1);
	list1.add(2);
	list1.add(2);
	list1.add(1);
	list1.add(3);
	HashSet<Integer> hasSeenSet=new HashSet<Integer>();
	HashSet<Integer> duplicateSet=new HashSet<Integer>();
	System.out.println(list1);
	for(Integer i: list1) {
		if(!hasSeenSet.add(i))
		{
			duplicateSet.add(i);
		}
	}
	System.out.println(duplicateSet);
}
}
