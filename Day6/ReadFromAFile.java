package Day6;
//This method constructor FileReader() will try to open the specified file, 
//if the file does not exist, then this constructor will not create a file.
// The constructor will then throw an exception
//Exception in java are two types:
//1) Checked error: In this case, you will get a compilation wrror.
// the developer must handle the exception.

import java.io.FileReader;
import java.io.IOException;

public class ReadFromAFile {
public static void main(String[] args) throws IOException {
	FileReader file1= new FileReader("Apoorva");
	while(true) {
	int result = file1.read();
	if (result == -1) {
		break;
	}
	else {
		System.out.print((char)result);
	}
	}
	file1.close();
}
}
