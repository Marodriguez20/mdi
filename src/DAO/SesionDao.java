package DAO;

import conexion.conexionbd;
import modelos.Sesion;
import java.sql.*;

public class SesionDao {

    public int insertarSesion(Sesion sesion) {
        int idGenerado = -1;

        // SQL corregido: columna de usuario = usuario_id
        String sql = "INSERT INTO sesiones (usuario_id, fecha_inicio) VALUES (?, ?)";

        try (Connection conn = conexionbd.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            ps.setInt(1, sesion.getUsuarioId()); // usuario_id
            ps.setTimestamp(2, new java.sql.Timestamp(sesion.getFechaInicio().getTime())); // fecha_inicio

            int filas = ps.executeUpdate();
            if (filas > 0) {
                try (ResultSet rs = ps.getGeneratedKeys()) {
                    if (rs.next()) {
                        idGenerado = rs.getInt(1); // ID de la sesión recién creada
                    }
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return idGenerado;
    }
}
