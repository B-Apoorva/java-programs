package Day5;
//If we have 5 variables in a user defined data type, we have to call 5 different Setter methods to assign values
public class WorkingWithConstructors {
public static void main(String[] args) {
	Employee emp =new Employee(20002,"Dinesh",'M',5.5f,false);
	//The job of a parameterized constructor is to store the passed values class level variables
	int id = emp.getEmployeeId();	
	System.out.println("The Employee ID is: " + id);
	String name = emp.getName();
	System.out.println("The Employee Name is: " + name);
	char g = emp.getGender();
	System.out.println("The Employee Gender is: " + g);
	boolean e= emp.isExperienced();
	System.out.println("Is the Employee experienced ? " + e);
	float h = emp.getHeight();
	System.out.println("The Employee height is: " + h);
}
}
