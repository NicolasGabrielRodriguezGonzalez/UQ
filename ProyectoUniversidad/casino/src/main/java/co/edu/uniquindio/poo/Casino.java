package co.edu.uniquindio.poo;

public class Casino {
    private String nombre;

    public Casino(String nombre) {
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
        return "Casino [nombre=" + nombre + "]";
    }
    
}
