import java.sql.*;
import java.util.*;
// Accepting values form user
// Never write like this approach (Statement)
// User rather PreparedStatement which is safe
//Prone to sql injection attack
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
	
	Statement st=con.createStatement();
	st.executeUpdate("insert into cgistudents values('"+empid+"','"+name+"','"+age+"')");
	
	
	System.out.println("record inserted");
	
		
	
  
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
