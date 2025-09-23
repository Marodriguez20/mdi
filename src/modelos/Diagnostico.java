package modelos;

import java.util.Date;

public class Diagnostico {
    private int id;
    private String descripcion;
    private Date fecha;

    // Constructor con descripción y fecha
    public Diagnostico(String descripcion, Date fecha) {
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    // Constructor solo con descripción (fecha actual)
    public Diagnostico(String descripcion) {
        this.descripcion = descripcion;
        this.fecha = new Date();
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public Date getFecha() { return fecha; }
    public void setFecha(Date fecha) { this.fecha = fecha; }
}
