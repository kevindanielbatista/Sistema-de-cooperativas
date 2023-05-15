package aplicacion;

//Esta parte importa los paquetes necesarios para trabajar con SQL
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
    
    
    //este metodo toma la cedula y una cantidad de dinero y deposita donde es debido en una cuenta de ahorro
    
    public static void depositarAhorro(String cedula, Double monto) {
        String sql = "SELECT monto FROM miembros_ahorro WHERE cedula = ?";
        String sql2 = "UPDATE miembros_ahorro SET monto = ? WHERE cedula = ?";
        
        try (Connection conn = connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, cedula);
            ResultSet rs = pstmt.executeQuery();
            
            if (rs.next()) {
                Double montoExistente = rs.getDouble("monto");
                Double nuevoMonto = montoExistente + monto;
                
                try (PreparedStatement pstmt2 = conn.prepareStatement(sql2)) {
                    pstmt2.setDouble(1, nuevoMonto);
                    pstmt2.setString(2, cedula);
                    pstmt2.executeUpdate();
                    System.out.println("Monto actualizado correctamente");
                } catch (SQLException e) {
                    System.out.println("Error al ejecutar la actualización: " + e.getMessage());
                }
            } else {
                System.out.println("No se encontró la fila con la cédula especificada");
            }
        } catch (SQLException e) {
            System.out.println("Error al ejecutar la consulta: " + e.getMessage());
        }
    }
    
    //este metodo toma la cedula y una cantidad de dinero y deposita donde es debido en una cuenta de ahorro
    
    public static void depositarCredito(String cedula, Double monto) {
        String sql = "SELECT monto FROM miembros_credito WHERE cedula = ?";
        String sql2 = "UPDATE miembros_credito SET monto = ? WHERE cedula = ?";
        
        try (Connection conn = connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, cedula);
            ResultSet rs = pstmt.executeQuery();
            
            if (rs.next()) {
                Double montoExistente = rs.getDouble("monto");
                Double nuevoMonto = montoExistente + monto;
                
                try (PreparedStatement pstmt2 = conn.prepareStatement(sql2)) {
                    pstmt2.setDouble(1, nuevoMonto);
                    pstmt2.setString(2, cedula);
                    pstmt2.executeUpdate();
                    System.out.println("Monto actualizado correctamente");
                } catch (SQLException e) {
                    System.out.println("Error al ejecutar la actualización: " + e.getMessage());
                }
            } else {
                System.out.println("No se encontró la fila con la cédula especificada");
            }
        } catch (SQLException e) {
            System.out.println("Error al ejecutar la consulta: " + e.getMessage());
        }
    }
    
    //este metodo toma la cedula y una cantidad de dinero y deposita donde es debido en una cuenta de ahorro
    
    public static void depositarAportaciones(String cedula, Double monto) {
        String sql = "SELECT monto FROM miembros_aportaciones WHERE cedula = ?";
        String sql2 = "UPDATE miembros_aportaciones SET monto = ? WHERE cedula = ?";
        
        try (Connection conn = connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, cedula);
            ResultSet rs = pstmt.executeQuery();
            
            if (rs.next()) {
                Double montoExistente = rs.getDouble("monto");
                Double nuevoMonto = montoExistente + monto;
                
                try (PreparedStatement pstmt2 = conn.prepareStatement(sql2)) {
                    pstmt2.setDouble(1, nuevoMonto);
                    pstmt2.setString(2, cedula);
                    pstmt2.executeUpdate();
                    System.out.println("Monto actualizado correctamente");
                } catch (SQLException e) {
                    System.out.println("Error al ejecutar la actualización: " + e.getMessage());
                }
            } else {
                System.out.println("No se encontró la fila con la cédula especificada");
            }
        } catch (SQLException e) {
            System.out.println("Error al ejecutar la consulta: " + e.getMessage());
        }
    }
    
    //este metodo toma la cedula y una cantidad de dinero y deposita donde es debido en una cuenta de ahorro
    
    public static void depositarJuvenil(String cedula, Double monto) {
        String sql = "SELECT monto FROM miembros_juvenil WHERE cedula = ?";
        String sql2 = "UPDATE miembros_juvenil SET monto = ? WHERE cedula = ?";
        
        try (Connection conn = connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, cedula);
            ResultSet rs = pstmt.executeQuery();
            
            if (rs.next()) {
                Double montoExistente = rs.getDouble("monto");
                Double nuevoMonto = montoExistente + monto;
                
                try (PreparedStatement pstmt2 = conn.prepareStatement(sql2)) {
                    pstmt2.setDouble(1, nuevoMonto);
                    pstmt2.setString(2, cedula);
                    pstmt2.executeUpdate();
                    System.out.println("Monto actualizado correctamente");
                } catch (SQLException e) {
                    System.out.println("Error al ejecutar la actualización: " + e.getMessage());
                }
            } else {
                System.out.println("No se encontró la fila con la cédula especificada");
            }
        } catch (SQLException e) {
            System.out.println("Error al ejecutar la consulta: " + e.getMessage());
        }
    }



    
    
    public static void borrarAhorro(String cedula) {
        String sql = "DELETE FROM miembros_ahorro WHERE cedula = ?";

        try (Connection conn = connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, cedula);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void borrarCredito(String cedula) {
        String sql = "DELETE FROM miembros_credito WHERE cedula = ?";

        try (Connection conn = connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, cedula);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void borrarAportaciones(String cedula) {
        String sql = "DELETE FROM miembros_aportaciones WHERE cedula = ?";

        try (Connection conn = connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, cedula);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void borrarJuvenil(String cedula) {
        String sql = "DELETE FROM miembros_juvenil WHERE cedula = ?";

        try (Connection conn = connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, cedula);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static String mostrarCuentaAhorro(String cedula) {
        StringBuilder cuentaAhorroInfo = new StringBuilder();

        String sql = "SELECT * FROM miembros_ahorro WHERE cedula = ?";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, cedula);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                String cedu = rs.getString("cedula");
                String nombre = rs.getString("nombre");
                String apellidos = rs.getString("apellidos");
                String dia_nacimiento = String.valueOf(rs.getInt("dia_nacimiento"));
                String mes_nacimiento = rs.getString("mes_nacimiento");
                String ano_nacimiento = String.valueOf(rs.getInt("ano_nacimiento"));
                String sexo = rs.getString("sexo");
                String est_civil = rs.getString("est_civil");
                String correo = rs.getString("correo");
                String telefono = rs.getString("telefono");
                String direccion = rs.getString("direccion");
                String monto = String.valueOf(rs.getDouble("monto"));
                
                

                cuentaAhorroInfo.append("Cedula: ").append(cedu).append("\n");
                cuentaAhorroInfo.append("nombre: ").append(nombre).append("\n");
                cuentaAhorroInfo.append("Apellido: ").append(apellidos).append("\n");
                cuentaAhorroInfo.append("Dia nacimiento: ").append(dia_nacimiento).append("\n");
                cuentaAhorroInfo.append("Mes nacimiento: ").append(mes_nacimiento).append("\n");
                cuentaAhorroInfo.append("Año nacimiento: ").append(ano_nacimiento).append("\n");
                cuentaAhorroInfo.append("Sexo: ").append(sexo).append("\n");
                cuentaAhorroInfo.append("Estado civil: ").append(est_civil).append("\n");
                cuentaAhorroInfo.append("Correo: ").append(correo).append('\n');
                cuentaAhorroInfo.append("Telefono: ").append(telefono).append("\n");
                cuentaAhorroInfo.append("Direccion: ").append(direccion).append("\n");
                cuentaAhorroInfo.append("Monto: ").append(monto).append("\n");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return cuentaAhorroInfo.toString();
    }
    
    public static String mostrarCuentaCredito(String cedula) {
        StringBuilder cuentaAhorroInfo = new StringBuilder();

        String sql = "SELECT * FROM miembros_credito WHERE cedula = ?";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, cedula);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                String cedu = rs.getString("cedula");
                String nombre = rs.getString("nombre");
                String apellidos = rs.getString("apellidos");
                String dia_nacimiento = String.valueOf(rs.getInt("dia_nacimiento"));
                String mes_nacimiento = rs.getString("mes_nacimiento");
                String ano_nacimiento = String.valueOf(rs.getInt("ano_nacimiento"));
                String sexo = rs.getString("sexo");
                String est_civil = rs.getString("est_civil");
                String correo = rs.getString("correo");
                String telefono = rs.getString("telefono");
                String direccion = rs.getString("direccion");
                String monto = String.valueOf(rs.getDouble("monto"));
                
                

                cuentaAhorroInfo.append("Cedula: ").append(cedu).append("\n");
                cuentaAhorroInfo.append("nombre: ").append(nombre).append("\n");
                cuentaAhorroInfo.append("Apellido: ").append(apellidos).append("\n");
                cuentaAhorroInfo.append("Dia nacimiento: ").append(dia_nacimiento).append("\n");
                cuentaAhorroInfo.append("Mes nacimiento: ").append(mes_nacimiento).append("\n");
                cuentaAhorroInfo.append("Año nacimiento: ").append(ano_nacimiento).append("\n");
                cuentaAhorroInfo.append("Sexo: ").append(sexo).append("\n");
                cuentaAhorroInfo.append("Estado civil: ").append(est_civil).append("\n");
                cuentaAhorroInfo.append("Correo: ").append(correo).append('\n');
                cuentaAhorroInfo.append("Telefono: ").append(telefono).append("\n");
                cuentaAhorroInfo.append("Direccion: ").append(direccion).append("\n");
                cuentaAhorroInfo.append("Monto: ").append(monto).append("\n");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return cuentaAhorroInfo.toString();
    }
    
    public static String mostrarCuentaAportaciones(String cedula) {
        StringBuilder cuentaAhorroInfo = new StringBuilder();

        String sql = "SELECT * FROM miembros_aportaciones WHERE cedula = ?";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, cedula);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                String cedu = rs.getString("cedula");
                String nombre = rs.getString("nombre");
                String apellidos = rs.getString("apellidos");
                String dia_nacimiento = String.valueOf(rs.getInt("dia_nacimiento"));
                String mes_nacimiento = rs.getString("mes_nacimiento");
                String ano_nacimiento = String.valueOf(rs.getInt("ano_nacimiento"));
                String sexo = rs.getString("sexo");
                String est_civil = rs.getString("est_civil");
                String correo = rs.getString("correo");
                String telefono = rs.getString("telefono");
                String direccion = rs.getString("direccion");
                String monto = String.valueOf(rs.getDouble("monto"));
                
                

                cuentaAhorroInfo.append("Cedula: ").append(cedu).append("\n");
                cuentaAhorroInfo.append("nombre: ").append(nombre).append("\n");
                cuentaAhorroInfo.append("Apellido: ").append(apellidos).append("\n");
                cuentaAhorroInfo.append("Dia nacimiento: ").append(dia_nacimiento).append("\n");
                cuentaAhorroInfo.append("Mes nacimiento: ").append(mes_nacimiento).append("\n");
                cuentaAhorroInfo.append("Año nacimiento: ").append(ano_nacimiento).append("\n");
                cuentaAhorroInfo.append("Sexo: ").append(sexo).append("\n");
                cuentaAhorroInfo.append("Estado civil: ").append(est_civil).append("\n");
                cuentaAhorroInfo.append("Correo: ").append(correo).append('\n');
                cuentaAhorroInfo.append("Telefono: ").append(telefono).append("\n");
                cuentaAhorroInfo.append("Direccion: ").append(direccion).append("\n");
                cuentaAhorroInfo.append("Monto: ").append(monto).append("\n");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return cuentaAhorroInfo.toString();
    }
    
    public static String mostrarCuentaJuvenil(String cedula) {
        StringBuilder cuentaAhorroInfo = new StringBuilder();

        String sql = "SELECT * FROM miembros_juvenil WHERE cedula = ?";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, cedula);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                String cedu = rs.getString("cedula");
                String nombre = rs.getString("nombre");
                String apellidos = rs.getString("apellidos");
                String dia_nacimiento = String.valueOf(rs.getInt("dia_nacimiento"));
                String mes_nacimiento = rs.getString("mes_nacimiento");
                String ano_nacimiento = String.valueOf(rs.getInt("ano_nacimiento"));
                String sexo = rs.getString("sexo");
                String est_civil = rs.getString("est_civil");
                String correo = rs.getString("correo");
                String telefono = rs.getString("telefono");
                String direccion = rs.getString("direccion");
                String monto = String.valueOf(rs.getDouble("monto"));
                
                

                cuentaAhorroInfo.append("Cedula: ").append(cedu).append("\n");
                cuentaAhorroInfo.append("nombre: ").append(nombre).append("\n");
                cuentaAhorroInfo.append("Apellido: ").append(apellidos).append("\n");
                cuentaAhorroInfo.append("Dia nacimiento: ").append(dia_nacimiento).append("\n");
                cuentaAhorroInfo.append("Mes nacimiento: ").append(mes_nacimiento).append("\n");
                cuentaAhorroInfo.append("Año nacimiento: ").append(ano_nacimiento).append("\n");
                cuentaAhorroInfo.append("Sexo: ").append(sexo).append("\n");
                cuentaAhorroInfo.append("Estado civil: ").append(est_civil).append("\n");
                cuentaAhorroInfo.append("Correo: ").append(correo).append('\n');
                cuentaAhorroInfo.append("Telefono: ").append(telefono).append("\n");
                cuentaAhorroInfo.append("Direccion: ").append(direccion).append("\n");
                cuentaAhorroInfo.append("Monto: ").append(monto).append("\n");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return cuentaAhorroInfo.toString();
    }







    
    
    

}  
