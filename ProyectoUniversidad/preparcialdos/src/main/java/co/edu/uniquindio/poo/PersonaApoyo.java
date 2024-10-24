package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class PersonaApoyo extends Persona{
    private String experienciaLaboral;

    public PersonaApoyo(String nombre, String apellido, LocalDate fechaNacimiento, String nacionalidad,
            String experienciaLaboral) {
        super(nombre, apellido, fechaNacimiento, nacionalidad);
        this.experienciaLaboral = experienciaLaboral;
    }

    public String getExperienciaLaboral() {
        return experienciaLaboral;
    }

    public void setExperienciaLaboral(String experienciaLaboral) {
        this.experienciaLaboral = experienciaLaboral;
    }

    @Override
    public String toString() {
        return "PersonaApoyo [nombre=" + nombre + ", experienciaLaboral=" + experienciaLaboral + ", apellido="
                + apellido + ", fechaNacimiento=" + fechaNacimiento + ", nacionalidad=" + nacionalidad + "]";
    }
    
    
}
