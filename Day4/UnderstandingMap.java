package Day4;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class UnderstandingMap {
public static void main(String[] args) {
	HashMap hm =new HashMap();// When you want to store data in key - value pair, 
	//It is not index based
	hm.put("India","New Delhi");
	hm.put("Russia","Mascow");
	hm.put("China","Beijing");
	System.out.println(hm);
	hm.put(1, "One");
	hm.put(1, 1);// when the key is same , then the values get over written
	System.out.println(hm); //The output is not in the same order in which  the values were entered.
	Set s = hm.keySet();
	System.out.println("The Set of keys are: "+ s);
	for(Object o:s) {
		System.out.println(o);
	}
	Collection c = hm.values();
	System.out.println(c);
	for(Object o :c) {
		System.out.println(o);
	}
	Object o1 = hm.get("India");
	System.out.println("The value of the key - India is : " + o1);
	Object o2 = hm.get("Pakisthan");
	System.out.println("The value of the key - Pakisthan is : " + o2);// When a key - not present is given, the output is null
	System.out.println(hm.containsKey("India"));  //getOrDefault, replace, remove
	
	
}
}
