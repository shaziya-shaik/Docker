package JDBC;

import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		DAO dao=new DAO();
		DemoDao d=dao.get(1074);
		//dao.findAll();
		//dao.get(108);
		System.out.println(d.name +" "+d.points);
		//dao.delete(108);
		//dao.create(108,"ShaziyaBegum", 98);

	}

}
