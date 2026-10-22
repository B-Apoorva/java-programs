package Day5;
import java.util.*;
import java.util.ArrayList;

import Day6.PassingArrayList;

public class PassingValues2 {
	public static void main(String[] args) {
		
		/*ArrayList <Integer >arrlst1 =new ArrayList<Integer>();
		arrlst1.add(0);
		arrlst1.add(1);
		
		ArrayList <Float >arrlst2 =new ArrayList<Float>();
		arrlst2.add(0.1f);
		arrlst2.add(1.4f);
		
		ArrayList <String> arrlst3 = new ArrayList<String>();
		arrlst3.add("Apoorva");
		arrlst3.add("Capgemini");
		*/
		
		ArrayList <Number>arrlst1 =new ArrayList<Number>();
		arrlst1.add(0);
		arrlst1.add(1);
		
		ArrayList <Number >arrlst2 =new ArrayList<Number>();
		arrlst2.add(0.1f);
		arrlst2.add(1.4f);
		
		ArrayList <String> arrlst3 = new ArrayList<String>();
		arrlst3.add("Apoorva");
		arrlst3.add("Capgemini");
		
		
		PassingValues2.displayList(arrlst1);
		PassingValues2.displayList(arrlst2);
		PassingValues2.displayList(arrlst3);
	}
	static void displayList(ArrayList<? super Intger>o) { //When you are not sure about the Generic, then put a "?", To avoid warnings. .
	//We need use Generics to avoid warnings.	
	// collection  	
	// List 
   // ArrayList
 // Vector
		System.out.println(o);	
	}
}
