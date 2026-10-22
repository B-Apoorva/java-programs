package day9;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class InsertingRecords {
	public static void main(String[] args) {
		try {
			String url = "jdbc:mysql://localhost:3306/Employee";
			String username = "root";
			String password = "root";
			Driver d=new com.mysql.cj.jdbc.Driver();
			Connection conn = DriverManager.getConnection(url, username, password);
			System.out.println("Connection Established");
			//String sql = "insert into table1 values(3,\"Misba\",20000,false,'f',\"2025-12-24\")";
			String sql = "insert into Employee_Details values(?,?,?,?,?,?,?,?)";
			//Method is getting called on interface reference
			//the return type of the method is interface
			PreparedStatement pstmt = conn.prepareStatement(sql);
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
			pstmt.setString(8, date);
			
			int i = pstmt.executeUpdate(); //this line is same as selecting statement in database
			//and executing
			System.out.println(i+" row inserted");
					}
					catch(SQLException e) {
					System.out.println(e.getMessage());
					}
	}
}
