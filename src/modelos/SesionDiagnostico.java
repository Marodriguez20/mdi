package modelos;

public class SesionDiagnostico {
    private int id;
    private int sesionId;
    private int diagnosticoId;

    public SesionDiagnostico(int sesionId, int diagnosticoId) {
        this.sesionId = sesionId;
        this.diagnosticoId = diagnosticoId;
    }

    public int getSesionId() {
        return sesionId;
    }

    public int getDiagnosticoId() {
        return diagnosticoId;
    }
}
