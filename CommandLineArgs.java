public class CommandLineArgs {
	
	//java CommandLine Arguments
	//Passing values to the main method at the time of program execution is a concept called command line argument.
	//The command line argument stored in args variable.
	//
public static void main(String[] args) {
	System.out.println(args[0]);
	System.out.println(args[1]);
	System.out.println(args[0]+args[1]);
	//This is not addition it is only concatenation.
	//To perform addition we have to convert args[0] and args[1] into integers.
	//Integer class has a static method to convert "57" into number 57.	
	int x=Integer.parseInt(args[0]);
	//The value passed must be an integer. For non integer value parseInt can't do the conversion.
	int y=Integer.parseInt(args[1]);
	int z=x+y;
	System.out.println(z);
	
	float a=Float.parseFloat(args[0]);
	float b=Float.parseFloat(args[1]);//Decimal can accommodate integer but not vice versa.
	float c=a+b;
	System.out.println(c);
}
}