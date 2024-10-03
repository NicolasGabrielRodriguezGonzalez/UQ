package co.edu.uniquindio.poo;

public class Estudiante extends Persona {
    public Estudiante (String nombre, String cedula, String telefono, String email) {
        super(nombre, cedula, telefono, email);
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Estudiante" + nombre + "cedula" + cedula + "telefono" + telefono + "email" + email;
    }
    



    
}
