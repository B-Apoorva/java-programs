/*
* make a separate exception class
*  * instead of using throw new Exception ("reason for error")
*
* exception class should be a child of either
* RuntimeException ( to make it unchecked exception )
* Exception ( to make it checked exception )
*
* class MyException extends RuntimeException{
*
*
* }
*/
package day8;
public class UserDefinedException extends RuntimeException {

}
public class WorkingWithUserDefinedException{
	public static void main(String[] args) {
		int age=18;
	}
}
