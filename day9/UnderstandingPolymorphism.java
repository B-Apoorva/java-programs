package day9;
//Polymorphism is a concept of Object Oriented Programming
//It exists only when there is overriding
class Animal{
	void sound() {
		System.out.println("Animals make sound");
		//Inside Parent class
	}
	static void move() {
		System.out.println("Animals can move");
	}
}
 class Dog extends Animal{
	 @Override
	 void sound() {
		 System.out.println("Dogs make sound");
		 //Inside child class
	 }
	/*void move() {
		System.out.println("Dogs can move");
	}*/  
	 //The child class(Dog) cannot override the static method of the Parent class(Animal)
	 //So since static methods are not overridden, so polymorphism does not work with static methods
 }


public class UnderstandingPolymorphism {
public static void main(String[] args) {
	//How to call method of Parent class ?
	//How to call method of Child class ?
	Animal obj1 = new Animal(); // object creation of Parent class
	Dog obj2 =new Dog();// object creation of Child class
	obj1.sound();
	obj2.sound();
	Animal obj3 =new Dog();//A method gets called of the child class
	//Object created is of class Dog(child) , but we are storing the reference in the Parent object obj3
	obj3.sound();//Which class method gets called? Animal or Dog??
	//Ans: Dog (Child class)
	obj1.move();
}
}
