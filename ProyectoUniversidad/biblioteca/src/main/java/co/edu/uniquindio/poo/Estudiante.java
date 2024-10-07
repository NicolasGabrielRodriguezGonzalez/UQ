package co.edu.uniquindio.poo;

public class Estudiante extends Persona {
    private Prestamo prestamo;
    public Estudiante (String nombre, String cedula, String telefono, String email, Prestamo prestamo) {
        super(nombre, cedula, telefono, email);
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.email = email;
        this.prestamo = prestamo;
    }

    @Override
    public String toString() {
        return "Estudiante: " + nombre + ", Cedula: " + cedula + ", Telefono: " + telefono + ", Email: " + email + "prestamo" + prestamo;
    }

    



    
}
