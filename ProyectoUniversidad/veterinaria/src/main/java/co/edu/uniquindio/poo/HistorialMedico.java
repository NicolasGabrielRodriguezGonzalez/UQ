package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class HistorialMedico {
    private LocalDate fecha;
    private String diagnostico;
    private String tratamiento;
    private String observacion;
    private Veterinario veterinario;
    public HistorialMedico(LocalDate fecha, String diagnostico, String tratamiento, String observacion,
            Veterinario veterinario) {
        this.fecha = fecha;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
        this.observacion = observacion;
        this.veterinario = veterinario;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public String getDiagnostico() {
        return diagnostico;
    }
    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }
    public String getTratamiento() {
        return tratamiento;
    }
    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }
    public String getObservacion() {
        return observacion;
    }
    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
    public Veterinario getVeterinario() {
        return veterinario;
    }
    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }
    @Override
    public String toString() {
        return "HistorialMedico [fecha=" + fecha + ", diagnostico=" + diagnostico + ", tratamiento=" + tratamiento
                + ", observacion=" + observacion + ", veterinario=" + veterinario + "]";
    }
    

    
    
}
