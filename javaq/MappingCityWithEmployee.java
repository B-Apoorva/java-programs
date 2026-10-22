package javaq;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class EmployeeDetails{
	String name;
	int id;
	String city;
	
	public EmployeeDetails(String city,String name, int id){
		this.city=city;
		this.name=name;
		this.id=id;
			
	}
		
}

public class MappingCityWithEmployee {
public static void main(String[] args) {
	EmployeeDetails emp1=new EmployeeDetails("Bangalore","Apoorva",2);
	EmployeeDetails emp2=new EmployeeDetails("Bangalore","Vyshnavi",3);
	EmployeeDetails emp3=new EmployeeDetails("Bangalore","Meghana",4);
	EmployeeDetails emp4=new EmployeeDetails("Chennai","Saranya",5);
	
	List<EmployeeDetails> list1=new ArrayList<EmployeeDetails>();
	list1.add(emp1);
	list1.add(emp2);
	list1.add(emp3);
	List<EmployeeDetails> list2=new ArrayList<EmployeeDetails>();
	list2.add(emp4);
	
	HashMap<String,List> hMap=new HashMap<String,List>();
	hMap.put("Bangalore", list1);
	hMap.put("Chennai", list2);
	
	String []command =null;
	System.out.println("Enter total operations");
	
	//int n=sc.nextInt();
}
}
