package JDBC;

import java.sql.*;
public class DemoClass2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url="jdbc:mysql://localhost:3306/restapi";
		String pass="";
		String uname="root";
		int userID=3731;
		String name="Nagoor Khan";
		int point=100;
		String querry="insert into alien values(?,?,?)";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(url , uname , pass);
		PreparedStatement st=con.prepareStatement(querry) ;
		st.setInt(1, userID);
		st.setString(2, name);
		st.setInt(3, point);
		int count=st.executeUpdate();
			System.out.println(count);
		st.close();
		con.close();
		// TODO Auto-generated method stub

	}

}
