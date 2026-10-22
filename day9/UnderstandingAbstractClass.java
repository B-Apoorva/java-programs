package day9;

abstract class AbstractClass{ //To create an abstract method, the class must be abstract
	//But if a method is final, The class need not be Final.
	void display() {
		System.out.println("Welcome to Capgemini");
	}
    abstract void test();//If we want to keep the method in the class , But we don't want to give method body
//Then declare the method as abstract	
}

//How to work with abstract class?
//We have to create the child class of the abstract class and given the method body of the abstract methods in the child class
class Child extends AbstractClass{
//It must override the unimplemented methods of the parent class
	@Override
	void test() {
		// TODO Auto-generated method stub
		System.out.println("It's working");
	}
	
}
public class UnderstandingAbstractClass {
public static void main(String[] args) {
	Child obj1 = new Child();
	obj1.display();
	obj1.test();
	
			
}
}
