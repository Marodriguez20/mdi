package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexionbd {
    private static final String URL = "jdbc:mysql://localhost:3306/sistema_diagnostico";
    private static final String USER = "root"; // tu usuario de MySQL
    private static final String PASSWORD = ""; // tu contraseña (si no tienes, deja vacío)

    public static Connection getConnection() {
        Connection con = null;
        try {
            // Cargar el driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Crear la conexión
            con = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            System.out.println("Error: No se encontró el driver JDBC. " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
        }
        return con;
    }
}
