package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Supermercado {
    private String nombre;
    private LinkedList<Cliente> clientes;
    private LinkedList<Empleado> empleados;
    private LinkedList<Producto> productos;

    public Supermercado(String nombre) {
        this.nombre = nombre;
        this.clientes = new LinkedList<>();
        this.empleados = new LinkedList<>();
        this.productos = new LinkedList<>();
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(LinkedList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public LinkedList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(LinkedList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public LinkedList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(LinkedList<Producto> productos) {
        this.productos = productos;
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    // Método para mostrar clientes
    public void mostrarClientes() {
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }

    // Método para mostrar empleados
    public void mostrarEmpleados() {
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }
    }

    // Método para mostrar productos
    public void mostrarProductos() {
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }

    // Método para mostrar mensajes
    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    @Override
    public String toString() {
        return "Supermercado [Nombre=" + nombre + "]";
    }
}
