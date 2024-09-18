package co.edu.uniquindio.poo;

public class Persona {
    private String nombre;
    private String numeroIdentificacion;
    private String telefono;
    private int edad;

    public Persona(String nombre, String numeroIdentificacion, String telefono, int edad) {
        this.nombre = nombre;
        this.numeroIdentificacion = numeroIdentificacion;
        this.telefono = telefono;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", numeroIdentificacion=" + numeroIdentificacion + ", telefono=" + telefono
                + ", edad=" + edad + "]";
    }

    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
