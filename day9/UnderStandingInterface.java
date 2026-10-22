package day9;

public class UnderStandingInterface {
public static void main(String[] args) {
	//Class1 obj1 =new Class1(); 
	//we cannot create object of an interface
	//To work with the interface we need to create child class.(Just like how we worked with interface list)
	//By using a predefined child class(ArrayList) of interface list
	Child1 obj1 = new Child1();
	System.out.println(Child1.a);
	//Child1.a=5;    // The values of the final variables can't be changed
	obj1.method1();
}
}
interface Class1{
	int a=5; // "Interface variables are by default public, static and final"
	//Final variables must be given initial value
	/*Class1(){
		
	}*/ //Interface cannot have constructor
	void method1();
		//Interface methods are by default abstract
		//abstract methods cannot have method body. like void method1(){}
	// Why did we not create child class of List(which is an interface)?
	//ans: Because it has many predefined methods, for which we need to write logic and we don't want to write for those many.
	//similarly for Set, Map

}
class Child1 implements Class1{
	//Interface methods must be overridden by the child class.
	@Override
	public void method1() { //add public, interface methods are by default abstract and public
		// When parent is a class, Overriding is optional. Example: toString();
		//When the parent is an interface, Overriding is compulsory
		//You cannot change the return type of the overridden method, it should be as it is.
		System.out.println("Hello World");
	}
}
