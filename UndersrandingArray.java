/*
advantage of array
1. it is used to store multiple values
2.All values are of the same datatype
3. I do not provide value array contains default values
disadvantage of array
1.Array size must be given
2.Size of the array cannot be increased / Decreased
3.Not possible to insert values between the array
4.Not possible to delete the values
*/
public class UndersrandingArray {
	public static void main(String[] args) {
		int []a=new int[5]; //this array can store only integer.
	   System.out.println(a[0]); // default value for string is 0.
	   String [] b= new String[4]; // Array of Strings
	   System.out.println(b[0]); // default value for string is null.
	   boolean []c=new boolean [4];
	   System.out.println(c); // prints some address
	   System.out.println(c[0]); // default value of boolean is false
	   Boolean []d= new Boolean[5];
	   System.out.println(d[0]);// default value of Boolean is null, here Boolean is a class.
	 //boolean is a primitive data type
	 //class is also a data type
	 //default value of object of any class is null
	   b[1]="Apoorva";
	   b[2]="GVPCE";
	   for(int i=0;i<b.length;i++) {
		   System.out.println(b[i]);
	   }
	   b[2]="Capgemini";
	   System.out.println(b[2]);
	   
	   for(int i=0;i<b.length;i++) {
		   System.out.println(b[i]);
	   }
	}
   
}
