package Day6;
import Day5.Employee;
//the objects are also passed by address
public class PassingObjectToAMethod {
 public static void main(String[] args) {
	System.out.println("The values in an object before calling the method :");
	Employee emp = new Employee(1,"Appu",'F',5.5f,false);
	System.out.println(emp);
	int id = emp.getEmployeeId();
	System.out.println(id);
	displayEmployee(emp);
	System.out.println("The values in an object after calling the method :");
	System.out.println(emp);
}
 
 static void displayEmployee(Employee emp1) {
	 emp1.setEmployeeId(2);
	 System.out.println("The values in an object when the id is changed in the method :");
	 System.out.println(emp1);
	 
 }
}
