package Day5;

import java.util.ArrayList;

public class StoringEmployeeInArrayList {
public static void main(String[] args) {
	ArrayList <Employee> emp = new ArrayList <Employee>();// What can you store in this emp List 
//: Using Generics of Employee
	//now we can store only Employee objects
	int a = emp.size();
	System.out.println(a); // the default size of the array is 0.
	Employee obj1= new Employee(1,"Charan",'M',6.0f,false);
	Employee obj2= new Employee(2,"Apoorva",'F',5.5f,false);
	Employee obj3= new Employee(3,"Jyoshita",'F',5.3f,false);
	emp.add(obj1);
	emp.add(obj2);
	emp.add(obj3);
	System.out.println(emp);
	//if the value inside the object needs to be printed when Syso emp is used,
	//then we have to override a special method called toString (in the main Employee class)
	
}
}
