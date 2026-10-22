package Day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListOfNumbers {
public static void main(String[] args) {
	ArrayList <Integer> al=new ArrayList();
	al.add(10);
	al.add(30);
	al.add(20);
	al.add(50);
	al.add(40);	
	System.out.println(al);
	Collections.sort(al);
	System.out.println(al);
	Collections.reverse(al); //ArrayList in Descending order
	System.out.println(al);
	
}
}

