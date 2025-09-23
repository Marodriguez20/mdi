package DAO;

import conexion.conexionbd;
import modelos.Diagnostico;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * DAO para consultas (lectura) de la tabla diagnosticos.
 * No toca al DiagnosticoDao que usas para inserciones.
 */
public class DiagnosticoConsultaDao {

    /**
     * Obtiene todos los diagnósticos (ordenados por fecha descendente).
     */
    public List<Diagnostico> obtenerTodos() {
        List<Diagnostico> lista = new ArrayList<>();
        String sql = "SELECT id, descripcion, fecha FROM diagnosticos ORDER BY fecha DESC";

        try (Connection con = conexionbd.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                // usa el constructor que tienes: Diagnostico(String descripcion, Date fecha)
                Diagnostico d = new Diagnostico(rs.getString("descripcion"), rs.getDate("fecha"));
                d.setId(rs.getInt("id"));
                lista.add(d);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error en obtenerTodos(): " + e.getMessage());
        }

        return lista;
    }

    /**
     * Obtiene los diagnósticos de un usuario por su cédula.
     */
    public List<Diagnostico> obtenerPorCedula(String cedula) {
        List<Diagnostico> lista = new ArrayList<>();
        String sql = "SELECT id, descripcion, fecha FROM diagnosticos WHERE cedula = ? ORDER BY fecha DESC";

        try (Connection con = conexionbd.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, cedula);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Diagnostico d = new Diagnostico(rs.getString("descripcion"), rs.getDate("fecha"));
                    d.setId(rs.getInt("id"));
                    lista.add(d);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error en obtenerPorCedula(): " + e.getMessage());
        }

        return lista;
    }
}
