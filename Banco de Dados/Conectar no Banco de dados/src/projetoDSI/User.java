package projetoDSI;

import java.sql.*;

public class User extends DBConnection {

    private String login;
    private String password;
    private String email;

    Connection cx;

    public User() throws ClassNotFoundException, SQLException {
        this.cx = getMyDBConnection();
    }

    public User(Connection cx) {
        this.cx = cx;
    }

       /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    public boolean verificarUser() throws SQLException{
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            pst = cx.prepareStatement("select * from user where login = ? and password = ?");
            pst.setString(1, this.login);
            pst.setString(2, this.password);
            rs = pst.executeQuery();
            if (rs.next()) {
                return true;
            }
        } finally {
            pst.close();
            rs.close();
        }
        return false;
    }

}
