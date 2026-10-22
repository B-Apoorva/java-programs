package Day4;

import java.util.ArrayList;
//problem with an array is: it is of fixed size, insertion and deletion
//ArrayList is an improvement on array
//ArrayList can store duplicate values
//ArrayList gives random access
public class UnderstandingList {
 public static void main(String[] args) {
	//create an object of the class ArrayList
	 ArrayList al= new ArrayList();
	 al.add(10); //to add the elements to the given list at a given index
	 al.add(20);
	 al.add(30);
	 al.add(40);
	 al.add(50);
	 System.out.println(al);
	 System.out.println("The size of the array is : " + al.size());  //set, remove,clear, contains,get, getFirst, getLast
	 al.add(0, 10);
	 al.add(1,15);
	 System.out.println(al);
	 al.add(2,20);
	 al.add(3,25);
	 System.out.println(al);
	 al.set(0, 11); // To set an element 
	 System.out.println(al);
	 al.remove(2); // To remove an element from the ArrayList
	 System.out.println(al);
	 System.out.println("Does the list contain the value : 10 ? " + al.contains(10));
	 System.out.println("The value present in index 2 is : " + al.get(2));
	 System.out.println("The index of value 25 : " + al.indexOf(25));
	 System.out.println("The first value of the arrayList is : " + al.getFirst());
	 System.out.println("The last value of the arrayList is : " + al.getLast());
	 System.out.println("The last value of the arrayList is : " + al.getLast());
	 // remove an element and see the size
	 ArrayList <Float> al1= new ArrayList();// ArrayList , Set, Map work with classes and not with primitive data types.
	 //al1.add(2.0); Decimal value in java is by default double
	 al1.add(2.0f); //by adding f we convert the double value into float.
	 System.out.println(al1);
	 
	 
	 
}
}
