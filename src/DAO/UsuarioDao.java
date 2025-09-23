package DAO;

import java.sql.*;
import modelos.Usuario;
import conexion.conexionbd;

public class UsuarioDao {

    public int obtenerIdUsuarioPorCedula(String cedula) {
        int id = -1;
        String sql = "SELECT id FROM usuarios WHERE cedula = ?";
        try (Connection con = conexionbd.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, cedula);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                id = rs.getInt("id");
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar usuario: " + e.getMessage());
        }
        return id;
    }

    public int insertarUsuario(Usuario usuario) {
        int idGenerado = -1;
        String sql = "INSERT INTO usuarios (cedula, nombre) VALUES (?, ?)";
        try (Connection con = conexionbd.getConnection();
             PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            ps.setString(1, usuario.getCedula());
            ps.setString(2, usuario.getNombre());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                idGenerado = rs.getInt(1);
            }
        } catch (SQLException e) {
            System.out.println("Error al insertar usuario: " + e.getMessage());
        }
        return idGenerado;
    }
}
