package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        //crear supermercado
        Supermercado supermercado= new Supermercado("Olimpica");
        
        //crear empleado
        Empleado empleado = new Empleado("Juam","Garcia", "12345", "317000","Tarde");

        //crear cliente
        Cliente cliente1 = new Cliente("Sofia","lopez","14321", "31412345");
        Cliente cliente2 = new Cliente("Andrea","Suarez","452316", "3512234");

        //crear producto
        Producto producto1= new Producto("Shampooo", 15000, 10);
        Producto producto2= new Producto("Crema de dientes", 5000, 10);
        Producto producto3= new Producto("Listerine", 8000, 10);

        //agregar productos a supermercado
        supermercado.agregarProducto(producto1);
        supermercado.agregarProducto(producto2);
        supermercado.agregarProducto(producto3);

        //Agregar clientes a supermercado
        supermercado.agregarCliente(cliente1);
        supermercado.agregarCliente(cliente2);

        //agregar empleado a supermercado
        supermercado.agregarEmpleado(empleado);

        //crear factura
        Factura factura= new Factura("01");

        //crear detalle y agregar a factura
        DetalleFactura detalleFactura1= new DetalleFactura(2, producto1);
        factura.agregarDetalleFactura(detalleFactura1);
        detalleFactura1.calcularSubtotalStock();

        DetalleFactura detalleFactura2= new DetalleFactura(3, producto2);
        factura.agregarDetalleFactura(detalleFactura2);
        detalleFactura2.calcularSubtotalStock();


        //mostrar mensaje
        Supermercado.mostrarMensaje(supermercado.toString());




    
    }
}
