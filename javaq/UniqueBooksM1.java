package javaq;

import java.util.HashMap;
import java.util.TreeMap;
import java.math.*;
public class UniqueBooksM1 {
public static void main(String[] args) {
	int []array1= {-1,2,-1,2,-99};//books frequency
	TreeMap<Integer,Integer> tMap=new TreeMap<Integer,Integer>();
	tMap.put(-99, 1);
	tMap.put(2,2);
	tMap.put(-1,2);
	//print size of map, values, average(ceil)
	int totalBooks=tMap.size();
	System.out.println(totalBooks);
	double sum=0;
	for(int i: tMap.values()) {
	System.out.println(i);
	sum=sum+i;
	}
	double average=Math.ceil(sum/totalBooks);
	System.out.println(average);
}
}
