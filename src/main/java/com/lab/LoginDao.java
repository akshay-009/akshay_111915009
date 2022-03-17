package com.lab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {
	String sql="select * from akshayganjiwar_111915009_detail where id=? and pass=?";
	String url="jdbc:mysql://localhost:3306/register";
	String username="root";
	String password="password";
	public boolean check(String id,String pass)
	{
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,username,password);
			PreparedStatement st= con.prepareStatement(sql);
			st.setString(1, id);
			st.setString(2, pass);
			ResultSet rs=st.executeQuery();
			if(rs.next())
			{
				return true;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		return false;
}
}
