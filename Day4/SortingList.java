package Day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingList {
public static void main(String[] args) {
	ArrayList <String> al=new ArrayList();
	al.add(0,"Maths");
	al.add(1,"Science");
	al.add(2,"English");
	System.out.println(al);
//	Comparator cm =new Comparator();
//Comparator c=new Comparator(); //Can't instantiate the type comparator
		//al.sort(c);
		//Interface can also be passed to a method
		//Comparator is an interface.Object of interface can't be created
		//How to work with an interface?
		//Create a child class of the interface
		//Pass the object of the child class instead of interface object
		Collections.sort(al);
		//System.out.println("ArrayList after sorting: "+al);
		//Why to use Comparator?
		//Ans: To sort based on our own requirements
		//Ex: Sort on the basis of String length
		Collections.reverse(al);
		//Printing the values from the ArrayList in Reverse Order
		System.out.println("ArrayList after reversing: "+al);
		String max=Collections.max(al);
		System.out.println("Max: "+max);
		
		Child cl=new Child();
		Collections.sort(al,cl);
		System.out.println("Sorting acc to the String length: "+al);
		
	}

}
//The child class of the interface must override the method present in the interface
class Child implements Comparator<String>
{
	//Override: Method is present in the parent class/interface,this method doesn't
	//have a method body
	//The child class provides the method body
	//@Override
	/*public int compare(Object o1, Object o2) {
		//The logic for how to sort the values in the arrayList is written in this method
		
		
		return 0;
	}*/

	@Override
	public int compare(String o1, String o2) {
		System.out.println("Length of String 1: "+o1.length());
		System.out.println("Length of String 2: "+o2.length());
		if(o1.length()<o2.length()) return -1; //for reverse (descending order): return 1
		else if(o1.length()>o2.length()) return 1;//for reverse (descending order): return -1
		else
		return 0;
	}
	
}
