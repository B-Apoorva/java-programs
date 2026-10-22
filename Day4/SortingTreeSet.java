package Day4;
import java.util.ArrayList;
import java.util.NavigableSet;
import java.util.TreeSet;

public class SortingTreeSet {
public static void main(String[] args) {
	TreeSet <Integer> ts= new TreeSet();
	ts.add(2);
	//ts.add("Apoorva");
	ts.add(1);
	ts.add(3);
	ts.add(5);
	ts.add(4);
	System.out.println(ts); //for sorting to work , all values must be of same data type
	//TreeSet must be used to print in sorted order
	NavigableSet <Integer >ns =ts.reversed(); // the sorted set is reversed
	System.out.println(ns);
	//so, for sorting a set in ascending or descending order: Use a TreeSet.
	NavigableSet<Integer> ns1 =ts.descendingSet();
	System.out.println(ns1);
	//Collection cl =new Collection();// this is an interface
	//Collection is an interface, the pre defined child interface of Collection is : List, Set, Map
	//The child class of Set is : HashSet
	//The child class of Map is : MapSet
	ArrayList <Integer> al = new ArrayList();
	//al.add(12);
	//al.add(6);
	
	//boolean b = ts.retainAll(al);//only common elements will be kept, remaining will be removed
	
	//System.out.println(b);// true =  means the TreeSet is changed
	//System.out.println(ts);// the TreeSet is empty, since all the elements are different and none is common, so all removed
	al.add(1);
	al.add(2);
	al.add(3);
	al.add(4);
	al.add(5);
	boolean c = ts.retainAll(al);

	System.out.println(c);// true =  means the TreeSet is changed, False = The TreeSet has not changed
	System.out.println(ts);
	
}
}
