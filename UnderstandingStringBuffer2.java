
public class UnderstandingStringBuffer2 {
public static void main(String[] args) {
	StringBuffer obj1= new StringBuffer("Apoorva");
	obj1.append('a');
	System.out.println(obj1);//when an object call a method and if the method changes the object 
	//then the object displays the changed value when printed.
	String obj2="hai";
	obj2.concat("hello");//method called on string object does not change on the object
	// instead method returns a new string object
	//to see the change done by the method we have to store the return value and print it
	//string objects are immutable it means string object do not change
	String a=obj2.concat("hello");
	
	System.out.println(a);
	obj1.deleteCharAt(2);
	System.out.println(obj1);
	obj1.delete(1, 3);
	System.out.println(obj1);
	obj1.insert(2, "capgemini");
	System.out.println(obj1);
	obj1.setCharAt(2, 'C');
	System.out.println(obj1);
	StringBuffer obj3=new StringBuffer("Apoorva");
	boolean c=obj1.equals(obj3);
	System.out.println(c);
	
	/*  StringBuffer sb1 = new StringBuffer("hi");
		StringBuffer sb2 = new StringBuffer("hi");
		
		String s1= sb1.toString();
		String s2= sb2.toString();
		
		boolean b1 = s1.equals(s2);
		System.out.println(b1);
		
		boolean b2 = sb1.equals(sb2);
		System.out.println(b2);*/
}
}
