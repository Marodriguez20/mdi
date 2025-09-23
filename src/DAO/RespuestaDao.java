package DAO;

import conexion.conexionbd;
import java.sql.*;

public class RespuestaDao {

    public boolean guardarRespuesta(int sesionId, int preguntaId, int opcionId) {
        String sql = "INSERT INTO respuestas (sesion_id, pregunta_id, opcion_id) VALUES (?, ?, ?)";
        try (Connection con = conexionbd.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, sesionId);
            ps.setInt(2, preguntaId);
            ps.setInt(3, opcionId);
            ps.executeUpdate();
            return true;

        } catch (SQLException e) {
            System.out.println("Error al guardar respuesta: " + e.getMessage());
            return false;
        }
    }
}
