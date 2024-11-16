package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        // Crear un proveedor de ejemplo
        Proveedor proveedor = new Proveedor("Proveedor Ejemplo", "Calle Falsa 123", "123456789");

        // Crear productos de diferentes tipos
        ProductoEnvasado productoEnvasado = new ProductoEnvasado(
                "P001", "Enlatado de Frutas", 1500.0, proveedor, LocalDate.now(), 0.5, TipoPaisOrigen.COLOMBIA);

        ProductoRefrigerado productoRefrigerado = new ProductoRefrigerado(
                "P002", "Yogurt Natural", 2000.0, proveedor, "AP123", 5.0);

        ProductoPerecedero productoPerecedero = new ProductoPerecedero(
                "P003", "Leche", 1200.0, proveedor, LocalDate.now().plusDays(7));

        // Crear una empresa y agregar productos
        Empresa empresa = new Empresa("SutiTodo");

        // Usar mostrarMensaje para imprimir mensajes en la consola
        empresa.mostrarMensaje("Producto Envasado:");
        System.out.println(productoEnvasado);
        empresa.mostrarMensaje("Precio de venta: " + productoEnvasado.precioVenta());
        empresa.mostrarMensaje("Impuesto: " + productoEnvasado.precioimpuesto());

        empresa.mostrarMensaje("\nProducto Refrigerado:");
        System.out.println(productoRefrigerado);
        empresa.mostrarMensaje("Precio de venta: " + productoRefrigerado.precioVenta());
        empresa.mostrarMensaje("Impuesto: " + productoRefrigerado.precioimpuesto());
        productoRefrigerado.iniciarProcesoRefrigeracion();

        empresa.mostrarMensaje("\nProducto Perecedero:");
        System.out.println(productoPerecedero);
        empresa.mostrarMensaje("Precio de venta: " + productoPerecedero.precioVenta());
        empresa.mostrarMensaje("Impuesto: " + productoPerecedero.precioimpuesto());

        // Agregar productos a la empresa y mostrar su información
        empresa.agregarProducto(productoEnvasado);
        empresa.agregarProducto(productoRefrigerado);
        empresa.agregarProducto(productoPerecedero);
        empresa.agregarProducto(productoEnvasado);
        empresa.agregarProducto(productoRefrigerado);
        empresa.agregarProveedor(proveedor);

        empresa.mostrarMensaje("\nEmpresa con productos:");
        System.out.println(empresa);
    }
}
