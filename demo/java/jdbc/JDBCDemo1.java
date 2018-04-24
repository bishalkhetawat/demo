import java.sql.*;

public class JDBCDemo1 {
public static void main(String[] args) {
	Connection con=null;
	try
 	{
   // register the driver
   // load the driver jar file
    Class.forName("com.mysql.jdbc.Driver");
  // Create a connection
  
    String url = "jdbc:mysql://localhost:3306/sarba";
	String username = "root";
	String password = "root";
	
	con=DriverManager.getConnection(url,username,password);
	
	Statement st=con.createStatement();
	st.executeUpdate("insert into cgistudents values(102,'Rohan',22)");
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
