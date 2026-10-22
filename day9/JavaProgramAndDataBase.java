package day9;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//Call the static method getConnection for 	DriverManager class
public class JavaProgramAndDataBase {
public static void main(String[] args) {
	//Local Host is our own system
	//3306 is port number of MySql server
	//MyDatabase is the  name of the database within the MySql server
	try {
	String url = "jdbc:mysql://localhost:3306/Employee"; //search of MySql java database conncetion URl on internet
	String username = "root";
	String password = "root";
	//JDBC connectivity
	//Search for database Driver MySqL Class name on internet
//	Driver d =new com.mysql.cj.jdbc.Driver();
	//For every database there is a separate Database driver class
	//Database driver is outside of java class
	//Who creates Database driver?  ans: The database developers create it.
	//download from internet: MySql database Driver JDBC
	
	//JAR file = Java Archive, it contains many .class files
		Connection conn =DriverManager.getConnection(url,username,password);
		System.out.println("Connection Established");
		String sql = "INSERT INTO Employee_Details VALUES(2,\"Apoorva\",\"Banka\",'F',\"IT\",false,25000,\"2025-12-24\")";
		//Method is getting called on interface reference
		//the return type of the method is interface
		Statement stmt = conn.createStatement();
		int i = stmt.executeUpdate(sql); //This line is same as selecting statement in database and executing.
		System.out.println(i+" row inserted");
	}
	 
	catch (SQLException e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
		System.out.println("Error while connecting to database");
	}
}
}
