package aplicacion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;  
import java.sql.DriverManager;  
import java.sql.SQLException;  
   
public class Conexion {    
    public static Connection connect() {  
        Connection conn = null;  
        try {  
            String url = null;
            switch (System.getProperty("os.name")) {
               case "Linux": url = "jdbc:sqlite:\\recursos\\datos_miembros.db"; //esto es para encontrar la base de datos en el programa si usamos linux
                      break;
               case "Windows": url = "jdbc:sqlite:C:/recursos/datos_miembros.db"; //Para encontrar el archivo de base de datos si usamos windows
            
            }  
            conn = DriverManager.getConnection(url);  
              
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
        
        return conn; //La funcion devuelve un objeto de tipo conexion que permite hacer una funcion para insertar datos
    }
    
    //Usamos una funcion publica para insertar datos que toma todos los datos necesarios para cada columna
    public static void insertarDatos(String nombre, String cedula, String apellidos, int dia_nacimiento, String mes_nacimiento, int ano_nacimiento, String sexo, String est_civil, String correo, String telefono, String direccion) {
        String sql = "INSERT INTO miembros(nombre,cedula,apellidos,dia_nacimiento,mes_nacimiento,ano_nacimiento,sexo,est_civil,correo,telefono,direccion) VALUES(?,?,?,?,?,?,?,?,?,?,?)";

        //Aqui se insertan los datos uno por uno en cada columna
        try (Connection conn = connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(0, nombre);
            pstmt.setString(1, cedula);
            pstmt.setString(2, apellidos);
            pstmt.setInt(3, dia_nacimiento);
            pstmt.setString(4, mes_nacimiento);
            pstmt.setInt(5, ano_nacimiento);
            pstmt.setString(6, sexo);
            pstmt.setString(7, est_civil);
            pstmt.setString(8, correo);
            pstmt.setString(9, telefono);
            pstmt.setString(10, direccion);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}  
