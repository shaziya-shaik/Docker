package com.login.Dao;

import java.sql.*;

public class LoginDao {
    String url = "jdbc:mysql://localhost:3306/restapi";
    String password = "";
    String name = "root";

    public boolean check(int uname, String pass) throws ClassNotFoundException, SQLException {
        String query = "SELECT id FROM alien WHERE id=? AND name=?";
        Class.forName("com.mysql.cj.jdbc.Driver"); // Use the correct driver class for newer MySQL versions
        try (Connection con = DriverManager.getConnection(url, name, password);
             PreparedStatement st = con.prepareStatement(query)) {
            st.setInt(1, uname); // Set integer parameter
            st.setString(2, pass); // Set string parameter
            try (ResultSet rs = st.executeQuery()) {
                return rs.next(); // Returns true if user exists
            }
        }
    }
}
