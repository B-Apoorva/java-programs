package Day5;
//Call by value
public class Modularity {
public static void main(String[] args) {
	int Integer1=0;
	int Integer2=1;
	//Add numbers and pass integer 1, integer2
	//calling a method addNumbers() and passing 2 values to it.
	System.out.println("Before calling method , the values of Integer 1 and Integer 2  are : " + Integer1+ " and " + Integer2);
	int result = addNumbers(Integer1,Integer2);
	System.out.println("After calling method , the values of Integer 1 and Integer 2  are : " + Integer1+ " and " + Integer2);
	System.out.println("The sum of the two numbers after calling the method is : " +result);
	
}
	static int addNumbers(int num1, int num2) {
		 num1 = 4;
		 System.out.println("The value assigned to number 1 in the method is: "+num1);
		 num2 =6;
		 System.out.println("The value assigned to number 2 in the method is: "+num2);
		 return num1+num2;
	 }
	
	//method declaration
			//call by value
			//if premitive values are passed to a method
			//and values change
			//do the original values change?
			//answer is no
	

  
}
