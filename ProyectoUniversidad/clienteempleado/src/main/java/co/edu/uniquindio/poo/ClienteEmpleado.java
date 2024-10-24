package co.edu.uniquindio.poo;

public class ClienteEmpleado extends Cliente implements IEmpleado,ICliente{//Implementación doble.
    public ClienteEmpleado  (String nombre, String cedula, String correo, String telefono){
        super(nombre, cedula, correo, telefono);
    }

    @Override
    public void hacerTarea() {
        System.out.println(nombre + "recoge la basura");        
    }

    @Override
    public void comprar() {
        System.out.println(nombre +" compra una botella de agua");

    }
    
    
}
