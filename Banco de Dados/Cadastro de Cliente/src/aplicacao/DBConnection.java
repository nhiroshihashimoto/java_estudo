package aplicacao;

import java.sql.*;

public abstract class DBConnection {

    final String driver = "com.mysql.jdbc.Driver";
    final String url = "jdbc:mysql://localhost:3306/bd_dsi";
    final String user = "root";
    final String password = "";
    
    public Connection getMyDBConnection() throws ClassNotFoundException, SQLException {

        Class.forName(driver);
        return DriverManager.getConnection(url, user, password);
    }
}
