package modelos;

public class Respuesta {
    private int id;
    private int sesionId;
    private int preguntaId;
    private int opcionId;

    public Respuesta() {}

    public Respuesta(int sesionId, int preguntaId, int opcionId) {
        this.sesionId = sesionId;
        this.preguntaId = preguntaId;
        this.opcionId = opcionId;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getSesionId() {
        return sesionId;
    }
    public void setSesionId(int sesionId) {
        this.sesionId = sesionId;
    }
    public int getPreguntaId() {
        return preguntaId;
    }
    public void setPreguntaId(int preguntaId) {
        this.preguntaId = preguntaId;
    }
    public int getOpcionId() {
        return opcionId;
    }
    public void setOpcionId(int opcionId) {
        this.opcionId = opcionId;
    }
}
