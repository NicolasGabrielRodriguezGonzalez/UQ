package co.edu.uniquindio.poo;

public class HabitatNatural {
    private String nombre;

    public HabitatNatural(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "HabitatNatural [nombre=" + nombre + "]";
    }
    
    
}
