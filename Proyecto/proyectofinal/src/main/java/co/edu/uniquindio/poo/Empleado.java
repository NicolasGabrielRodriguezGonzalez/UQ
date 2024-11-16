package co.edu.uniquindio.poo;
import java.time.LocalDate;
import java.util.LinkedList;
public class Empleado extends Persona{
    private String idEmpleado;
    private String puesto;
    private String usuario;
    private String contraseña;
    private boolean estadoEmpleado;
    private LocalDate fechaContratacion;
    private double salario;
    private LinkedList <Vehiculo> vehiculos;
    private LinkedList <Cliente> clientes;
    private LinkedList <Transaccion> transacciones;
    public Empleado(String nombre, String cedula, String telefono, String email, String idEmpleado, String puesto,
            String usuario, String contraseña, boolean estadoEmpleado, LocalDate fechaContratacion, double salario) {
        super(nombre, cedula, telefono, email);
        this.idEmpleado = idEmpleado;
        this.puesto = puesto;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.estadoEmpleado = estadoEmpleado;
        this.fechaContratacion = fechaContratacion;
        this.salario = salario;
        this.vehiculos=new LinkedList<>();
        this.clientes = new LinkedList<>();
        this.transacciones = new LinkedList<>();

    }
    public String getIdEmpleado() {
        return idEmpleado;
    }
    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    public String getPuesto() {
        return puesto;
    }
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getContraseña() {
        return contraseña;
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    public boolean isEstadoEmpleado() {
        return estadoEmpleado;
    }
    public void setEstadoEmpleado(boolean estadoEmpleado) {
        this.estadoEmpleado = estadoEmpleado;
    }
    public LocalDate getFechaContratacion() {
        return fechaContratacion;
    }
    public void setFechaContratacion(LocalDate fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void registrarVehiculo(Vehiculo vehiculo) {
        // Se agrega el vehículo a la lista de vehículos del empleado
        vehiculos.add(vehiculo);
        System.out.println("Vehículo registrado con éxito: " + vehiculo.toString());
    }
    public void registrarCliente(Cliente cliente) {
        // Se agrega el cliente a la lista de clientes del empleado
        clientes.add(cliente);
        System.out.println("Cliente registrado con éxito: " + cliente.toString());
    }
    public void registrarTransacciones(Transaccion transaccion) {
        // Agregar la transacción a la lista de transacciones del empleado
        transacciones.add(transaccion);
        System.out.println("Transacción registrada con éxito: " + transaccion.toString());
    }
    //Faltan los metodos de alquilar, vender y esos.
    
}
