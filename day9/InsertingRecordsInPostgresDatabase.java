package day9;
import java.sql.Connection;
import java.sql.Date;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertingRecordsInPostgresDatabase {
	public static void main(String[] args) {
		try {
			String url = "jdbc:postgresql://localhost:5432/postgres";
			String username = "postgres";
			String password = "root";
			//Driver d is an interface of java
			Driver d=new org.postgresql.Driver();//Polymorphism =  plug and play architecture, helps reducing the lines of code
            //postgresql.Driver() is a child class, written by database developers
			Connection conn = DriverManager.getConnection(url, username, password);
			//Connection is an interface
			System.out.println("Connection Established");
			//String sql = "insert into Employee_Details values(20001,'Apoorva','Banka','F','IT',false, 25000,'2025-12-24')";
			//String sql = "insert into Employee_Details values(id + "," +firstName + ","+ lastName + ","+..............)";
			String sql = "insert into Employee_Details values(?,?,?,?,?,?,?,?)";
			//Method is getting called on interface reference
			//the return type of the method is interface
			PreparedStatement pstmt = conn.prepareStatement(sql);
			//Here PreparedStatement is an Interface of java
			//conn.prepareStatement() is a child class of that interface
			/*pstmt.setInt(1, 4);
			pstmt.setString(2, "AAA");
			pstmt.setDouble(3, 25000);
			pstmt.setBoolean(4, false);
			pstmt.setString(5,"m");
			pstmt.setString(6, "2025-12-25");
		 */

			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the ID : ");
			int id = sc.nextInt();
			pstmt.setInt(1, id);
			
			System.out.println("Enter the First Name : ");
			String firstName =sc.next();
			pstmt.setString(2, firstName);
			
			System.out.println("Enter the Last Name : ");
			String lastName = sc.next();
			pstmt.setString(3, lastName);
			
			System.out.println("Enter the Gender : ");
			String gender = sc.next();
			pstmt.setString(4, gender);
			
			System.out.println("Enter the Department Name : ");
			String department = sc.next();
			pstmt.setString(5, department);
			
			System.out.println("Is Experienced ?");
			Boolean experience = sc.nextBoolean();
			pstmt.setBoolean(6,experience);
			
			System.out.println("Enter the Salary : ");
			Double salary = sc.nextDouble();
			pstmt.setDouble(7, salary);
			
			System.out.println("Enter the Date of Joining (yyyy-MM-DD) : ");
			String date = sc.next();
			Date hireDate = java.sql.Date.valueOf(date);
			pstmt.setDate(8, hireDate);

			int i = pstmt.executeUpdate(); //this line is same as selecting statement in database
			//and executing
			System.out.println(i+" row inserted");
					}
					catch(SQLException e) {
					System.out.println(e.getMessage());
					}
	}
}
