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
	        String url = ""; // Assignar valor vacio a url

	        switch (System.getProperty("os.name")) {
	            case "Linux":
	                url = "jdbc:sqlite:src/recursos/datos_miembros.db";
	                break;
	            case "Windows":
	                url = "jdbc:sqlite:C:/recursos/datos_miembros.db";
	                break;
	        }

	        if (!url.isEmpty()) { // asegurarse de que URL no este vacio
	            conn = DriverManager.getConnection(url);
	        } else {
	            System.out.println("Hubo un problema con el sistema operativo");
	        }
	    } catch (SQLException e) {
	        System.out.println(e.getMessage());
	    }

	    return conn;
	}
    
    //Usamos una funcion publica para insertar datos que toma todos los datos necesarios para cada columna
    public static void insertarDatosAhorro(String nombre, String cedula, String apellidos, int dia_nacimiento, String mes_nacimiento, int ano_nacimiento, String sexo, String est_civil, String correo, String telefono, String direccion) {
        String sql = "INSERT INTO miembros_ahorro(cedula,nombre,apellidos,dia_nacimiento,mes_nacimiento,ano_nacimiento,sexo,est_civil,correo,telefono,direccion) VALUES(?,?,?,?,?,?,?,?,?,?,?)";

        //Aqui se insertan los datos uno por uno en cada columna
        try (Connection conn = connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, cedula);
            pstmt.setString(2, nombre);
            pstmt.setString(3, apellidos);
            pstmt.setInt(4, dia_nacimiento);
            pstmt.setString(5, mes_nacimiento);
            pstmt.setInt(6, ano_nacimiento);
            pstmt.setString(7, sexo);
            pstmt.setString(8, est_civil);
            pstmt.setString(9, correo);
            pstmt.setString(10, telefono);
            pstmt.setString(11, direccion);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    //Usamos una funcion publica para insertar datos que toma todos los datos necesarios para cada columna
    public static void insertarDatosCredito(String nombre, String cedula, String apellidos, int dia_nacimiento, String mes_nacimiento, int ano_nacimiento, String sexo, String est_civil, String correo, String telefono, String direccion) {
        String sql = "INSERT INTO miembros_credito(cedula,nombre,apellidos,dia_nacimiento,mes_nacimiento,ano_nacimiento,sexo,est_civil,correo,telefono,direccion) VALUES(?,?,?,?,?,?,?,?,?,?,?)";

        //Aqui se insertan los datos uno por uno en cada columna
        try (Connection conn = connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, cedula);
            pstmt.setString(2, nombre);
            pstmt.setString(3, apellidos);
            pstmt.setInt(4, dia_nacimiento);
            pstmt.setString(5, mes_nacimiento);
            pstmt.setInt(6, ano_nacimiento);
            pstmt.setString(7, sexo);
            pstmt.setString(8, est_civil);
            pstmt.setString(9, correo);
            pstmt.setString(10, telefono);
            pstmt.setString(11, direccion);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    //Usamos una funcion publica para insertar datos que toma todos los datos necesarios para cada columna
    public static void insertarDatosAportaciones(String nombre, String cedula, String apellidos, int dia_nacimiento, String mes_nacimiento, int ano_nacimiento, String sexo, String est_civil, String correo, String telefono, String direccion) {
        String sql = "INSERT INTO miembros_aportaciones(cedula,nombre,apellidos,dia_nacimiento,mes_nacimiento,ano_nacimiento,sexo,est_civil,correo,telefono,direccion) VALUES(?,?,?,?,?,?,?,?,?,?,?)";

        //Aqui se insertan los datos uno por uno en cada columna
        try (Connection conn = connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, cedula);
            pstmt.setString(2, nombre);
            pstmt.setString(3, apellidos);
            pstmt.setInt(4, dia_nacimiento);
            pstmt.setString(5, mes_nacimiento);
            pstmt.setInt(6, ano_nacimiento);
            pstmt.setString(7, sexo);
            pstmt.setString(8, est_civil);
            pstmt.setString(9, correo);
            pstmt.setString(10, telefono);
            pstmt.setString(11, direccion);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    //Usamos una funcion publica para insertar datos que toma todos los datos necesarios para cada columna
    public static void insertarDatosJuvenil(String nombre, String cedula, String apellidos, int dia_nacimiento, String mes_nacimiento, int ano_nacimiento, String sexo, String est_civil, String correo, String telefono, String direccion) {
        String sql = "INSERT INTO miembros_juvenil(cedula,nombre,apellidos,dia_nacimiento,mes_nacimiento,ano_nacimiento,sexo,est_civil,correo,telefono,direccion) VALUES(?,?,?,?,?,?,?,?,?,?,?)";

        //Aqui se insertan los datos uno por uno en cada columna
        try (Connection conn = connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, cedula);
            pstmt.setString(2, nombre);
            pstmt.setString(3, apellidos);
            pstmt.setInt(4, dia_nacimiento);
            pstmt.setString(5, mes_nacimiento);
            pstmt.setInt(6, ano_nacimiento);
            pstmt.setString(7, sexo);
            pstmt.setString(8, est_civil);
            pstmt.setString(9, correo);
            pstmt.setString(10, telefono);
            pstmt.setString(11, direccion);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


    
    
    public static void borrar(String cedula) {
        String sql = "DELETE FROM miembros WHERE cedula = ?";

        try (Connection conn = connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // set the corresponding param
            pstmt.setString(1, cedula);
            // execute the delete statement
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}  
