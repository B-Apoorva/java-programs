package javaq;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;

class EmployeeDetails{
	private int id;
	private String name;
	private char gender;
	private float height;
	private boolean isExperienced;
	private double salary;
	
	public EmployeeDetails(int id, String name, char gender, float height, boolean isExperienced, double salary) {
		this.id =id;
		this.name=name;
		this.gender=gender;
		this.height=height;
		this.isExperienced=isExperienced;
		this.salary=salary;
	}
	
	

	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public char getGender() {
		return gender;
	}
	public float getHeight() {
		return height;
	}
	public boolean isExperienced() {
		return isExperienced;
	}
	public double getSalary() {
		return salary;
	}
	
	
	@Override
	public String toString() {
		return "EmployeeDetails [id=" + id + ", name=" + name + ", gender=" + gender + ", height=" + height
				+ ", isExperienced=" + isExperienced + ", salary=" + salary + "]";
	}
}

class EmployeeCompare implements Comparator<EmployeeDetails>{

	//A comparison function, which imposes a total ordering onsome collection of objects.
	//Comparators can be passed to a sortmethod (such as Collections.sort or Arrays.sort) 
	//to allow precise control over the sort order.Comparators can also be used to control the order of certain datastructures 
	//(such as sorted sets or sorted maps), or to provide an ordering forcollections of objects that don't have a natural ordering.
	
	@Override
	public int compare(EmployeeDetails o1, EmployeeDetails o2) {
		// TODO Auto-generated method stub
		
		if(o1.getId()<o2.getId()) {
			return -1;
		}
		else if(o1.getId()>o2.getId()) {
			return 1;
		}
		
		else { 
			if(o1.getName().compareTo(o2.getName())<0) 
			{
			   return -1;
		    }
		    else if(o1.getName().compareTo(o2.getName())>0)
		    {
			   return 1;
		    }
		//compareTo(String to another String) Returns:the value 0 if the argument string is equal to this string;
		//a value less than 0 if this string is lexicographically less than the string argument; 
		//and a value greater than 0 if this string islexicographically greater than the string argument
		    else {
		    	if(o1.getSalary()<o2.getSalary())
		    	{
		    		return -1;
		    	}
		    	else if(o1.getSalary()>o2.getSalary()) {
		    		return 1;
		    	}
		    }
		return 0;
		}
	}
}

public class SortingEmployeeObjects {
public static void main(String[] args) {
	EmployeeDetails emp1= new EmployeeDetails(20001,"Apoorva",'f',5.5f,false,25000.09);
	EmployeeDetails emp2=new EmployeeDetails(20002,"Apoorva",'f',5.5f,false,25000.09);
	EmployeeDetails emp3=new EmployeeDetails(20002,"Vyshnavi",'f',5.5f,false,25000.05);
	EmployeeDetails emp4=new EmployeeDetails(20002,"Vyshnavi",'f',5.5f,false,25000.06);
	
	ArrayList<EmployeeDetails> empDetailsList=new ArrayList<EmployeeDetails>();
	empDetailsList.add(emp1);
	empDetailsList.add(emp2);
	empDetailsList.add(emp3);
	empDetailsList.add(emp4);
	
	EmployeeCompare empC=new EmployeeCompare();
	
	Collections.sort(empDetailsList,empC );//sort(list,comparator object)
	
	/*
	 * Sorts the specified list according to the order induced by thespecified comparator.
	 *  All elements in the list must be mutually comparable using the specified comparator
	 *   (that is, c.compare(e1, e2) must not throw a ClassCastExceptionfor any elements e1 and e2 in the list). 
	 */
	System.out.println("Employee details in ascending order : " +empDetailsList);
	
	Collections.sort(empDetailsList,Collections.reverseOrder(empC) );
	System.out.println("Employee details in descending order : " +empDetailsList);
	//Collections.reverseOrder(empDetailsList, empC);

	
	
	
}
}
