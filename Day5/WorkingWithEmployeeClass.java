package Day5;

public class WorkingWithEmployeeClass {
	public static void main(String[] args) {
		//Employee is a data type (of String type)
		//Create object of class Employee
		Employee emp1 =new Employee();
		//System.out.println(emp1);// Prints the memory address of the object (like in an array case).
		/*System.out.println(emp1.employeeId);
		System.out.println(emp1.name);
		System.out.println(emp1.gender);
		System.out.println(emp1.height);
		System.out.println(emp1.isExperienced); // because we did not provide a value to the variables,
		// so, they contain the default values
	    */
		emp1.setEmployeeId(20002);
		emp1.setName("Dinesh");
		emp1.setGender('M');
		emp1.setExperienced(false);
		emp1.setHeight(5.8f);
		//System.out.println(emp1);
		int empId = emp1.getEmployeeId();
		String name = emp1.getName();
		char g = emp1.getGender();
		float h = emp1.getHeight();
		boolean exp = emp1.isExperienced();
		System.out.println(empId);
		System.out.println(name);
		System.out.println(g);
		System.out.println(h);
		System.out.println(exp);
		
		
	}
}
