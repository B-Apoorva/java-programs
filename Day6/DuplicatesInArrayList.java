package Day6;

import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Collections;
import java.util.Scanner;

public class DuplicatesInArrayList {
public static void main(String[] args) {
	ArrayList <Integer> arrlst=new ArrayList <Integer>();
	ArrayList <Integer> arrlst1=new ArrayList <Integer>();
	Scanner sc = new Scanner(System.in);
	/*arr.add(1);
	arr.add(2);*/
	System.out.println("Enter the size of the ArrayList : ");
	int n = sc.nextInt();
	System.out.println("Enter the values into the list: ");
	for(int i = 0;i<n;i++) {
		int value = sc.nextInt();
		arrlst.add(value);
	}
	System.out.println("Your list is given below: " + arrlst);
    Collections.sort(arrlst);
    TreeSet<Integer> ts =new TreeSet <Integer>();
    ts.add(arrlst);
	for(int i=1;i<=n;i++) 
	{   
		 int val1=arrlst.get(i);
		 int val2=arrlst.get(i+1);
		 int val3=arrlst.get(i-1);
		  {
			arrlst1.add(val1);
		  }	
	}
	System.out.println("The duplicate values in your list is given below: " + arrlst1);
	}
}

