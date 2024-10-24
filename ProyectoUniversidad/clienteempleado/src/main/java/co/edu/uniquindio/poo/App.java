package co.edu.uniquindio.poo;

public class App {
    public static void main(String[] args) {
        //Creacion de Cliente.
        Cliente cliente = new Cliente("Federico", "1111", "federico@gmail.com", "30000000");
        //Creacion de Empleado.
        Empleado empleado = new Empleado("Loaiza", "2222", "loaiza@gmail.com", "31111111", "Calle 33 19A 06");
        //Creación de ClienteEmpleado.
        ClienteEmpleado clienteEmpleado = new ClienteEmpleado("Santiago", "3333", "santiago@gmail.com", "322222222");
        //var siver para identificar el tipo de dato.
        cliente.comprar();
        empleado.hacerTarea();
        clienteEmpleado.hacerTarea();
        clienteEmpleado.comprar();

    }
}
