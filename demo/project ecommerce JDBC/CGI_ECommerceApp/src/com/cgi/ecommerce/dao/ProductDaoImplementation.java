package com.cgi.ecommerce.dao;
/**************************************
 * 
 *************************************/
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cgi.ecommerce.bean.Product;

public class ProductDaoImplementation implements ProductDaoInterface{
	Connection con=null;
/**********************************************
 * 
 * Method Name:
 * Description
 * Parameter
 * Return
 * Exception
 ********************************************/
	@Override
	public boolean addProduct(Product p) {
		int result=0;
		try
		{
		con=MyConnectionFactory.giveMeaConnection();
		String query="Insert into product values(?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(query);
		ps.setInt(1, p.getId());
		ps.setString(2, p.getName());
		ps.setDouble(3,p.getPrice());
		ps.setString(4, p.getDescription());
		result=ps.executeUpdate();
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
		if(result>0)
			return true;
		else
			return false;
		
	}
/*********************************************
 * 
 *
 ***********************************************/
	@Override
	public List<Product> getAllProducts() {		
		Connection con=MyConnectionFactory.giveMeaConnection();
		List <Product> prodList=null;
		try
		{
		String query="select * from product";
		PreparedStatement ps=con.prepareStatement(query);
		ResultSet rs=ps.executeQuery();
		
		prodList= new ArrayList<Product>();
		
		while(rs.next())
		{
			Product p=new Product();
			p.setId(rs.getInt(1));
			p.setName(rs.getString(2));
			p.setPrice(rs.getDouble(3));
			p.setDescription(rs.getString(4));
			prodList.add(p);						
		}
						
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}		
		return prodList;		
	}

}
