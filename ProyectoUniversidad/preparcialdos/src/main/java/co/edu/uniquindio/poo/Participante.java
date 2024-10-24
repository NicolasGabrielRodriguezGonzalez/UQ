package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Participante extends Persona {
    private String paisDeRepresentacion;

    public Participante(String nombre, String apellido, LocalDate fechaNacimiento, String nacionalidad,
            String paisDeRepresentacion) {
        super(nombre, apellido, fechaNacimiento, nacionalidad);
        this.paisDeRepresentacion = paisDeRepresentacion;
    }

    public String getPaisDeRepresentacion() {
        return paisDeRepresentacion;
    }

    public void setPaisDeRepresentacion(String paisDeRepresentacion) {
        this.paisDeRepresentacion = paisDeRepresentacion;
    }

    @Override
    public String toString() {
        return "Participante [nombre=" + nombre + ", paisDeRepresentacion=" + paisDeRepresentacion + ", apellido="
                + apellido + ", fechaNacimiento=" + fechaNacimiento + ", nacionalidad=" + nacionalidad + "]";
    }
    
    
}
