package modelos;

import java.util.Date;

public class Sesion {
    private int id;
    private int usuarioId;
    private Date fechaInicio;

    // Constructor vacío
    public Sesion() {}

    // Constructor con parámetros
    public Sesion(int usuarioId, Date fechaInicio) {
        this.usuarioId = usuarioId;
        this.fechaInicio = fechaInicio;
    }

    // Getters y setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getUsuarioId() { return usuarioId; }
    public void setUsuarioId(int usuarioId) { this.usuarioId = usuarioId; }

    public Date getFechaInicio() { return fechaInicio; }
    public void setFechaInicio(Date fechaInicio) { this.fechaInicio = fechaInicio; }
}
