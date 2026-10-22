package javaq;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NavigableSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class UnderstandingTreeSet {
public static void main(String[] args) {
	//TreeSet must contain values of only one datatype and they must be comparable, unique
	Scanner sc=new Scanner(System.in);
	Set<Integer>myTreeSet= new TreeSet<Integer>();
	myTreeSet.add(30);
	myTreeSet.add(10);
	myTreeSet.add(20);
	myTreeSet.add(20);
	myTreeSet.add(40);
	
	//myTreeSet.add(Arrays.asList(30,10,20,20,40));
	/*System.out.println("Enter the size of the tree set: ");
	int n=sc.nextInt();
	for(int i=0;i<n;i++) {
		myTreeSet.add(sc.nextInt());
	}*/
	System.out.println("The TreeSet is as follows: " +myTreeSet);
	//input: 10, 20,20,30,40 and input2: 30,10,20,20,40
	//output: 10,20,30,40
	
    myTreeSet.remove(40);
    System.out.println(myTreeSet);
    
    //Create 2 lists
    
    List<String> Fruits = new ArrayList<String>();
    Fruits.add("Apple");
    Fruits.add("Guava");
    Fruits.add("Banana");
    Fruits.add("Mango");
    Fruits.add("Cherry");
    
    List<String> Fruits2 = new ArrayList<String>();
    Fruits2.add("Strawberry");
    Fruits2.add("Lichi");
    Fruits2.add("Mulberry");
    Fruits2.add("Star fruit");
    Fruits2.add("Blackberry");
    
    Fruits.addAll(Fruits2); //adds all the fruits of List 2 into List 1
    System.out.println(Fruits);//output: [Apple, Guava, Banana, Mango, Cherry, Strawberry, Lichi, Mulberry, Star fruit, Blackberry]
    
    for(String o:Fruits) {
    	System.out.print(o+" "); //prints all the fruits without braces and with spaces in one line
    }
    
    //passing a list into the TreeSet using constructor
    //create another TreeSet
    System.out.println();
    Set<String>myTreeSet2=new TreeSet<String>(Fruits); 
    System.out.println(myTreeSet2);
   // NavigableSet<String> descendingset = myTreeSet2.descendingSet();
    NavigableSet<String> descendingSet = ((TreeSet<String>) myTreeSet2).descendingSet();
    System.out.println(descendingSet);
}
}
