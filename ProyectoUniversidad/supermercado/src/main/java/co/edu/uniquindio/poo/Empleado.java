package co.edu.uniquindio.poo;

public class Empleado extends Persona {
    private String puesto;

    public Empleado(String nombre, String apellido, String cedula, String telefono, String puesto) {
        super(nombre, apellido, cedula, telefono);
        this.puesto = puesto;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return "Empleado: " + nombre + " " + apellido + ", Puesto: " + puesto + ", Cédula: " + cedula + ", Teléfono: " + telefono;
    }
}
