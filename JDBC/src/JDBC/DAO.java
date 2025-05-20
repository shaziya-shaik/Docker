package JDBC;

import java.sql.*;
public class DAO {
	Connection con;

	DemoDao d=new DemoDao();
	DAO() throws ClassNotFoundException, SQLException{
		String url="jdbc:mysql://localhost:3306/restapi";
		String pass="";
		String uname="root";
	Class.forName("com.mysql.jdbc.Driver");
	con=DriverManager.getConnection(url , uname , pass);
	}
	public  DemoDao findAll() throws SQLException {
		String Querry="select * from alien ";
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(Querry);
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" " +rs.getString(2)+" "+rs.getInt(3));
		}
		st.close();
		rs.close();
		con.close();
		return d;
		
	}
	public  DemoDao get(int ID) throws SQLException {
		String Querry="select * from alien where ID=?";
		PreparedStatement st=con.prepareStatement(Querry);
		st.setInt(1, ID);
		ResultSet rs=st.executeQuery();
			rs.next();
			 d.name=rs.getString(2);
			 d.points=rs.getInt(3);
		st.close();
		rs.close();
		con.close();
		return d;
		
	}
	public  void delete(int ID) throws SQLException {
		String Querry="Delete  from alien where ID=?";
		PreparedStatement st=con.prepareStatement(Querry);
		st.setInt(1, ID);
		int rs=st.executeUpdate();
		System.out.println(rs);
			
		st.close();
		con.close();
		
		
	}
	
	public  void create(int ID,String name, int points ) throws SQLException {
		String querry="insert into alien values(?,?,?)";
		PreparedStatement st=con.prepareStatement(querry);
		st.setInt(1, ID);
		st.setString(2, name);
		st.setInt(3, points);
		int rs=st.executeUpdate();
		System.out.println(rs);
			
		st.close();
		con.close();
	
		
		
	}
	
	

}
