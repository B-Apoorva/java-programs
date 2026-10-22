package Day6;

public class WorkingWithManagerClass {
public static void main(String[] args) {
	String arr[]= {"Manoj","Anita","Sushmita","Rakesh","Ashish"};
	
	Manager m1= new Manager(arr,1,"Ashish",'M',5.5f,true);
	// Manager class has how many attributes?
	// Attributes of Employee class + Attributes of Manager class
	System.out.println(m1);
	// Above line calls the toString()
	// toString() is not present in the Manager class
	// the toString () present in the Parent class Employee was called.
	//If toString() is present in the child class, then child class method gets called and
	//not the parent class method
	//When a child object gets created , the parent class constructor gets called first.
	//then the child class constructor gets called.
	
}
}