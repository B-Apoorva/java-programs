package Day5;

import java.util.TreeSet;

//import java.util.ArrayList;
//import java.util.Collections;

public class SortingEmployeeObjects {
public static void main(String[] args) {
	//ArrayList <Employee> emp = new ArrayList();
	Employee emp1= new Employee(2,"Sai Charan",'M',6.0f,false);
	TreeSet <Employee> ts = new TreeSet <Employee>(emp1);
	//TreeSet <Integer> ts = new TreeSet <Integer>();
	
	Employee emp2= new Employee(1,"Apoorva",'F',5.5f,false);
	Employee emp3= new Employee(3,"Jyoshita",'F',5.3f,false);
	ts.add(emp1);
	ts.add(emp2);
	ts.add(emp3);
	
	//Collections.sort(ts);
	//emp.sort(null);
	//System.out.println(ts);
	/*TreeSet<String> ts = new TreeSet<String>();
	ts.add("Aweza");
	ts.add("Lareb");
	ts.add("Garima");
	System.out.println(ts);*/
	//ts.add(1);
	System.out.println(ts);
	
}
}
