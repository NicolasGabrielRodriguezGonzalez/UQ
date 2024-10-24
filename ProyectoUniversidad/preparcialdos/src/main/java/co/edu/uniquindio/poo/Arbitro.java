package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Arbitro extends Persona {
    private String categoria;

    public Arbitro(String nombre, String apellido, LocalDate fechaNacimiento, String nacionalidad, String categoria) {
        super(nombre, apellido, fechaNacimiento, nacionalidad);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Arbitro [nombre=" + nombre + ", categoria=" + categoria + ", apellido=" + apellido
                + ", fechaNacimiento=" + fechaNacimiento + ", nacionalidad=" + nacionalidad + "]";
    }
    
    
    
}
