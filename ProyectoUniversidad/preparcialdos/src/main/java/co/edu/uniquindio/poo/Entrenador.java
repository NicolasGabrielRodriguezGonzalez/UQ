package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Entrenador extends Persona {
    private String especializacion;

    public Entrenador(String nombre, String apellido, LocalDate fechaNacimiento, String nacionalidad,
            String especializacion) {
        super(nombre, apellido, fechaNacimiento, nacionalidad);
        this.especializacion = especializacion;
    }

    public String getEspecializacion() {
        return especializacion;
    }

    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }

    @Override
    public String toString() {
        return "Entrenador [nombre=" + nombre + ", especializacion=" + especializacion + ", apellido=" + apellido
                + ", fechaNacimiento=" + fechaNacimiento + ", nacionalidad=" + nacionalidad + "]";
    }
    
    
}
