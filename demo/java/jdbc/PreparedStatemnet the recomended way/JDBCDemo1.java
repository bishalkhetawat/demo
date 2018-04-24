import java.sql.*;
import java.util.*;
// Use PreparedStatement to prevent SQl Injection attack
public class JDBCDemo1 {
public static void main(String[] args) {
	Connection con=null;
	try
 	{
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter empid:");
		int empid=sc.nextInt();
		System.out.println("Enter name:");
		String name=sc.next();
		System.out.println("Enter age:");
		int age=sc.nextInt();
		
		
		
   // register the driver
   // load the driver jar file
    Class.forName("com.mysql.jdbc.Driver");
  // Create a connection
  
    String url = "jdbc:mysql://localhost:3306/sarba";
	String username = "root";
	String password = "root";
	
	con=DriverManager.getConnection(url,username,password);
	
	String query="insert into cgistudents values(?,?,?)";
	PreparedStatement ps= con.prepareStatement(query);
	ps.setInt(1,empid);
	ps.setString(2,name);
	ps.setInt(3, age);
	int result=ps.executeUpdate();
	if(result>0)			
	System.out.println("record inserted");
	else
		System.out.println(" Some error in inserteion");
	
		
	
  
	}
	catch(ClassNotFoundException e)
	{
		System.out.println(e);
	}
	catch(SQLException e)
	{
		System.out.println(e);
	}
	finally
	{
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}
