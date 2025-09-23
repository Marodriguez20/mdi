package DAO;

import java.sql.*;
import conexion.conexionbd;
import modelos.SesionDiagnostico;

public class SesionDiagnosticoDao {

    public int insertarSesionDiagnostico(int sesionId, int diagnosticoId) {
        int idGenerado = -1;
        String sql = "INSERT INTO sesion_diagnostico (sesion_id, diagnostico_id) VALUES (?, ?)";

        try (Connection con = conexionbd.getConnection();
             PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            ps.setInt(1, sesionId);
            ps.setInt(2, diagnosticoId);
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                idGenerado = rs.getInt(1);
            }
        } catch (SQLException e) {
            System.out.println("Error al asociar sesión y diagnóstico: " + e.getMessage());
        }
        return idGenerado;
    }
}
