package javaq;

/*
* Null Pointer Exception Handling Write a method getStringLength that takes a
* string and returns its length. Handle the NullPointerException if the input string
*  is null and return
*  an appropriate message.
 
Sample Input 1 (Valid):
 
getStringLength("Hello")
Output: 5
 
Sample Input 2 (Invalid - null string):
 
getStringLength(null)
Output: "Error: Null value passed"
*/
import java.util.Scanner;

public class UnderstandingExceptionHandling {
	
	
	static int getStringLength(String string1) throws Exception{
		int length=string1.length();
		if(string1==null) {
			throw new NullPointerException("Error: Null value passed");
		}
		return length;
	}
	
	
public static void main(String[] args) throws Exception  {
	Scanner sc =new Scanner(System.in);
	try {
	System.out.println("Enter a String: ");
	String string1=null;
	//String string1=sc.next();
	int stringLength = getStringLength(string1);
	System.out.println("The string length is: " + stringLength);
	}
	catch(NullPointerException n){
		//System.out.println(e.getMessage()); //output: Cannot invoke "String.length()" because "string1" is null
		System.out.println("Error: Null value passed");
	}
	catch(Exception e) {
		System.out.println("Invalid Input");
	}
}
}

/*
 * 
package javaq;

import java.util.Scanner;

public class UnderstandingExceptionHandling {

    // No try/catch here—only throws if null
    static int getStringLength(String string1) {
        if (string1 == null) {
            throw new NullPointerException("Error: Null value passed");
        }
        return string1.length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a String (type 'null' to simulate null): ");
            String input = sc.nextLine();

            // Treat the literal word "null" as a null reference for testing
            String string1 = (input != null && input.equalsIgnoreCase("null")) ? null : input;

            int stringLength = getStringLength(string1);
            System.out.println("Output: " + stringLength);
        } catch (NullPointerException n) {
            // Print the exact required message
            System.out.println("Output: " + n.getMessage()); // "Error: Null value passed"
        } catch (Exception e) {
            // Any other unexpected issues
            System.out.println("Output: Invalid Input");
        } finally {
            sc.close();
        }
    }
}

*/
