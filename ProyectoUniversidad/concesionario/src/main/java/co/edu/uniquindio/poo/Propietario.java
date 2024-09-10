package co.edu.uniquindio.poo;

public class Propietario {
    private String nombre;
    private int edad;
    private String numeroIdentificacion;

    public Propietario (String nombre, int edad, String numeroIdentificacion){
        this.nombre=nombre;
        this.edad=edad;
        this.numeroIdentificacion=numeroIdentificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    @Override
    public String toString() {
        return "El nombre del propietario es: " + nombre + "su edad es: " + edad
        + "y su # de identificacion es: " + numeroIdentificacion;
    }
     

    
}
