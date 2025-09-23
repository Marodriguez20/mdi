package DAO;

import conexion.conexionbd;
import modelos.Diagnostico;
import java.sql.*;
import java.util.List;

public class DiagnosticoDao {

    public int insertarDiagnostico(String cedula, String nombre, List<Integer> respuestas, Diagnostico diagnostico) {
        int idGenerado = -1;
        String sql = "INSERT INTO diagnosticos (cedula, nombre, respuestas, descripcion, fecha) VALUES (?, ?, ?, ?, ?)";

        try (Connection conexion = conexionbd.getConnection();
             PreparedStatement ps = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            ps.setString(1, cedula);
            ps.setString(2, nombre);
            ps.setString(3, respuestas.toString());
            ps.setString(4, diagnostico.getDescripcion());
            ps.setDate(5, new java.sql.Date(diagnostico.getFecha().getTime()));

            int filas = ps.executeUpdate();
            if (filas > 0) {
                try (ResultSet rs = ps.getGeneratedKeys()) {
                    if (rs.next()) {
                        idGenerado = rs.getInt(1);
                    }
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return idGenerado;
    }
}
