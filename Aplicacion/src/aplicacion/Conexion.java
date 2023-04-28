package aplicacion;

import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.SQLException;  
   
public class Conexion {    
    public static void connect() {  
        Connection conn = null;  
        try {  
            String url = null;
            switch (System.getProperty("os.name")) {
               case "Linux": url = "jdbc:sqlite:\\recursos\\datos_miembros.db";
                      break;
               case "Windows": url = "jdbc:sqlite:C:/recursos/datos_miembros.db";
            
            }  
            conn = DriverManager.getConnection(url);  
              
            System.out.println("Base de datos conectada");  
              
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        } finally {  
            try {  
                if (conn != null) {  
                    conn.close();  
                }  
            } catch (SQLException ex) {  
                System.out.println(ex.getMessage());  
            }  
        }  
    }   
    public static void main(String[] args) {  
        connect();  
    }  
}  
