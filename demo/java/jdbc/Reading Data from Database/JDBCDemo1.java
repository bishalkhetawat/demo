import java.sql.*;
import java.util.*;
// Use PreparedStatement to prevent SQl Injection attack
public class JDBCDemo1 {
public static void main(String[] args) {
	Connection con=null;
	try
 	{	
    Class.forName("com.mysql.jdbc.Driver");  
    String url = "jdbc:mysql://localhost:3306/sarba";
	String username = "root";
	String password = "root";	
	con=DriverManager.getConnection(url,username,password);
	
	String query="SELECT * FROM cgistudents";
	
	PreparedStatement ps=
			con.prepareStatement(query);
	
	ResultSet rs=ps.executeQuery();
	
	while(rs.next())
	{
		
		int empid=rs.getInt(1);
		String name=rs.getString(2);
		int age=rs.getInt(3);
		
		System.out.print(empid+"  "+name+"    "+age);
		System.out.println();
		
	}
	
	
	
  
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
