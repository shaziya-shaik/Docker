package JDBC;

import java.sql.*;
public class DemoClass {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url="jdbc:mysql://localhost:3306/restapi";
		String pass="";
		String uname="root";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(url , uname , pass);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from alien ");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" " +rs.getString(2)+" "+rs.getInt(3));
		}
		st.close();
		rs.close();
		// TODO Auto-generated method stub

	}

}
