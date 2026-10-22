package Day5;

import java.util.Comparator;

//Storing object of Employee class in array, ArrayList, Set, Map
//User defined data type
//Array can store many values, but of same data type
// if we want to store many values of different data types, then there is no pre-defined data type.
// we have to create our own data type(class)
// To follow the principle of abstraction and encapsulation in object oriented programming, we must use the getter methods
// to assign a value to the private variable we must use the setter method
public class Employee implements Comparator<Employee>{ // here this class is a data type (user defined) having combination various data type of variables
	private int employeeId;
	private String name;
	private char gender;
	private float height;
	private boolean isExperienced;
	//This data type is a user defined data type
	
	
	
	public Employee(){
		//default constructor
	}
	public Employee(int id, String name, char gen, float height, boolean exp) {
		// TODO Auto-generated constructor stub
		employeeId= id;
		this.name= name;
		gender=gen;
		this.height=height;
		isExperienced = exp;	
		
		
	}
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", gender=" + gender + ", height=" + height
				+ ", isExperienced=" + isExperienced + "]";
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public boolean isExperienced() {
		return isExperienced;
	}
	public void setExperienced(boolean isExperienced) {
		this.isExperienced = isExperienced;
	}
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		int i= o1.getEmployeeId();
		int j= o2.getEmployeeId();
		if(i<j) {
			return -1;
		}
		else if(i>j) {
			return 1;
		}
		else{
			return 0;
		}
	}
	
	
}
