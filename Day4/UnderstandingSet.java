package Day4;

import java.util.HashSet;
import java.util.Iterator;

public class UnderstandingSet {
public static void main(String[] args) {
	// create an object of a hash set
	HashSet h=new HashSet();// Because we have no specified, the HashSet will contain which type of values
	//any value can be stored in the HashSet
	h.add(10);
	h.add(30);
	h.add(20);
	h.add(40);
	h.add(50);
	System.out.println(h);
	//The set prints the elements in random order.
	h.add(50);
	System.out.println(h); //The duplicates are ignored
	System.out.println("The size of the set is: " + h.size());
	h.add(60);
	System.out.println("The size of the set is: " + h.size());
	h.remove(30);
	System.out.println("The size of the set is: " + h.size());
	//The size of the set can increase and decrease
	//set cannot be updated (no set, no update method found)
	//set is not indexed based, so we cannot print a value at a particular index.
	h.add("Apoorva"); //String class is a child of java.lang.Object
	//a set can store different data types with unique values
	h.add(3.5);//3.5 is of data type double, this value is converted in java.lang.Double, which is a child of java.lang
	//So, storing primitive value into an object is called boxing.
	h.add(true); //String class is a child of java.lang.object
	// we cannot insert elements in between
	System.out.println(h.contains(20));
    for(Object o:h) { //Object is the top most class in java, since we don't know the data type we use Object class
    	// for printing values of a set one at a time :
    	System.out.println(o);
    }	
    
    HashSet <String> str=new HashSet(); //storing only String type of values.
    str.add("Apoorva");
   // str.add(2);
    str.add("Swarupa"); //while creating the HashSet we specified that only String values are allowed.
    //this concept is called Generic-while creating we specify which datatype is allowed.
   str.add("2");
   for(String s:str) {
	   System.out.println(s);
   }
   Iterator i =h.iterator();
   while(i.hasNext()) {
	   Object obj=i.next();
	   System.out.println(obj);
   }
    
}
}
