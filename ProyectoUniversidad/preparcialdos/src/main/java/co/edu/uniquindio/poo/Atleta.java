package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Atleta extends Persona {
    private int experiencia;

    public Atleta(String nombre, String apellido, LocalDate fechaNacimiento, String nacionalidad, int experiencia) {
        super(nombre, apellido, fechaNacimiento, nacionalidad);
        this.experiencia = experiencia;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public String toString() {
        return "Atleta [nombre=" + nombre + ", experiencia=" + experiencia + ", apellido=" + apellido
                + ", fechaNacimiento=" + fechaNacimiento + ", nacionalidad=" + nacionalidad + "]";
    }
    
    
    
}
