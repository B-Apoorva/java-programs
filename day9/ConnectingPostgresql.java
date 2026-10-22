package day9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//import java.sql.Statement;

import org.postgresql.Driver;

public class ConnectingPostgresql {
	public static void main(String[] args) {
		//Local Host is our own system
		//5432 is port number of MySql server
		//MyDatabase is the  name of the database within the MySql server
		try {
		String url = "jdbc:postgresql://localhost:5432/";//search of Postgresql java database conncetion URl on internet
				//"jdbc:mysql://localhost:3306/Employee"; 
		String username = "postgres";
		String password = "root";
		//JDBC connectivity
		//Search for database Driver MySqL Class name on internet
    	Driver d =new org.postgresql.Driver();
		//For every database there is a separate Database driver class
		//Database driver is outside of java class
		//Who creates Database driver?  ans: The database developers create it.
		//download from internet: MySql database Driver JDBC
		
		//JAR file = Java Archive, it contains many .class files
			Connection conn =DriverManager.getConnection(url,username,password);
			System.out.println("Connection Established");
			//String postgresql = "INSERT INTO Employee_Details VALUES(2,\"Apoorva\",\"Banka\",'F',\"IT\",false,25000,\"2025-12-24\")";
			//Method is getting called on interface reference
			//the return type of the method is interface
			//Statement stmt = conn.createStatement();
			//int i = stmt.executeUpdate(postgresql); //This line is same as selecting statement in database and executing.
			//System.out.println(i+" row inserted");
		}
		 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Error while connecting to database");
		}
	}
}
