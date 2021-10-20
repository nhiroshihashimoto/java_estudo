package projetoDSI;

import java.sql.*;

public abstract class DBConnection {

    final String driver = "com.mysql.cj.jdbc.Driver";
    final String url = "jdbc:mysql://localhost:3308/bd_dsi";
    final String user = "root";
    final String password = "Estudante@1";

    public Connection getMyDBConnection() throws ClassNotFoundException, SQLException {

        Class.forName(driver);
        return DriverManager.getConnection(url, user, password);
    }
}
