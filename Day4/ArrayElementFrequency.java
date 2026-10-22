package Day4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class ArrayElementFrequency {
/*Write a function that counts the frequency of each element in an array.
Example:
Input: [2, 3, 2, 1, 4, 2]
Output: {2: 3, 3: 1, 1: 1, 4: 1}
Hint: Use a HashMap to store each element and its frequency.*/
public static void main(String[] args) {
	HashMap hm =new HashMap();
	hm.put(2, 3);
	hm.put(3, 1);
	hm.put(1, 1);
	hm.put(4, 1);
	
    Set s=hm.keySet();
   // System.out.println(hm.get(2));
    for(Object o: s) {
    	System.out.println(o + " : " + hm.get(o));

    }
	
	}
  
}
	

