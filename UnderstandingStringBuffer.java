
public class UnderstandingStringBuffer {
	public static void main(String[] args) {
		//call the non static reverse method of string buffer class
		//object.method name
		//StringBuffer name="hi";//to create an object of a class , there is specific syntax.
		//class name object name= new class name()
		StringBuffer name= new StringBuffer("Apoorva");
		// String is the only class, which need not follow the above syntax.
		//String s ="Capgemini";
		
				 name.reverse();// i did not store the return value from this method in a different variable.
				 // still when i print the StringBuffer object, i get the expected output.
				 System.out.println(name);
		
	}
}
