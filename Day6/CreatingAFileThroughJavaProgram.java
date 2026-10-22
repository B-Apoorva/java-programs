package Day6;

import java.io.FileWriter;
import java.io.IOException;

public class CreatingAFileThroughJavaProgram {
public static void main(String[] args) throws IOException {
	//Create an object of class file writer
	FileWriter file1=new FileWriter("Apoorva");
	//the above line created a file by name "Apoorva" in the current project
	file1.write("Hello, This is Apoorva. \n");
	file1.write("May you have a great day ahead.\n");
	file1.write(65);//A gets stored.
	file1.write("\n");
	char[] charArray = {'a','A','b','B','c','C'};
	file1.write(charArray);
    //here write() is an example of method overloading
	file1.close();

}
}
