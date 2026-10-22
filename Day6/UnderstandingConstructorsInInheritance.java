package Day6;
class A{
	int i=10;//Giving value at the time of declaration is not correct,
	//because all objects will have same value.
	//If you want each object to different values for i, then
	// Parameterised constructor must be used.
	A(int i1){
		i=i1;
		System.out.println("Parent class parameterised constructor called");
	}
	A(){
		System.out.println("Parent class constructor called");
	}
	
}
class B extends A{
	B(){
		System.out.println("Child class constructor called");
	}
}
public class UnderstandingConstructorsInInheritance {
public static void main(String[] args) {

	A obj1 =new A(1);
	System.out.println(obj1.i);
	System.out.println("==========================");
	B obj2=new B();
	A obj3=new A();
}
}
