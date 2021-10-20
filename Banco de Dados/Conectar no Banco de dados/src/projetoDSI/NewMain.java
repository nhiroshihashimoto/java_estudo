package projetoDSI;

import java.sql.SQLException;

public class NewMain {

     public static void main(String[] args) throws ClassNotFoundException, SQLException {
         
         User usuario = new User();
         
         usuario.setLogin("jose");
         usuario.setPassword("456");
         
         System.out.println(usuario.verificarUser());
         
    }
    
}
