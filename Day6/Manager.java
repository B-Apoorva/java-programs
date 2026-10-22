package Day6;
import java.util.Arrays;

import Day5.Employee;
public class Manager extends Employee{
//Parent class will have attributes which are common to every employee.
	//The child class will have extra attributes 
	String [] peopleReporting;
    Manager(String arr[],int id, String name,char gen,float height,boolean exp){
    	super(id,name,gen,height,exp);//this super() calls the parameterised constructor of the parent class.
    	// These variables are declared in the parent class.
    	//It is the job of parent class constructor to assign them.
    	
    	peopleReporting=arr;
    	
    }
	@Override
	public String toString() {
		String str=super.toString();
		//calling parent class toString();
		return str+"Manager [peopleReporting=" + Arrays.toString(peopleReporting) + "]";
		
	}
}
