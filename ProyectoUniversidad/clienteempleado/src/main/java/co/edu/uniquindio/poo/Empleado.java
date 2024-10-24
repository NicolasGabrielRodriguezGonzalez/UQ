package co.edu.uniquindio.poo;

public class Empleado extends Persona implements IEmpleado{
    private String direccion;

    public Empleado(String nombre, String cedula, String correo, String telefono, String direccion) {
        super(nombre, cedula, correo, telefono);
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public void hacerTarea() {
        System.out.println(nombre + "esta haciendo tareas.");        
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Empleado direccion=" + direccion + super.toString();
    }
    
    
}
