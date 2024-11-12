package co.edu.uniquindio.poo;
import java.util.LinkedList;

public class Empresa {
    private String nombre;
    private LinkedList <ProductoEnvasado> productoEnvasados;
    private LinkedList <ProductoRefrigerado> productoRefrigerados;
    private LinkedList <ProductoPerecedero> productoPerecederos;
    private LinkedList <Proveedor> proveedores;




    public Empresa(String nombre) {
        this.nombre = nombre;
        this.productoEnvasados = new LinkedList<>();
        this.productoPerecederos = new LinkedList<>();
        this.productoPerecederos = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<ProductoEnvasado> getProductoEnvasados() {
        return productoEnvasados;
    }

    public void setProductoEnvasados(LinkedList<ProductoEnvasado> productoEnvasados) {
        this.productoEnvasados = productoEnvasados;
    }

    public LinkedList<ProductoRefrigerado> getProductoRefrigerados() {
        return productoRefrigerados;
    }

    public void setProductoRefrigerados(LinkedList<ProductoRefrigerado> productoRefrigerados) {
        this.productoRefrigerados = productoRefrigerados;
    }

    public LinkedList<ProductoPerecedero> getProductoPerecederos() {
        return productoPerecederos;
    }

    public void setProductoPerecederos(LinkedList<ProductoPerecedero> productoPerecederos) {
        this.productoPerecederos = productoPerecederos;
    }

    public LinkedList<Proveedor> getProveedores() {
        return proveedores;
    }

    public void setProveedores(LinkedList<Proveedor> proveedores) {
        this.proveedores = proveedores;
    }

    @Override
    public String toString() {
        return "Empresa [nombre=" + nombre + ", productoEnvasados=" + productoEnvasados + ", productoRefrigerados="
                + productoRefrigerados + ", productoPerecederos=" + productoPerecederos + ", proveedores=" + proveedores
                + "]";
    }
    /* public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }
 */
    public void agregarProductoRefrigerado(ProductoRefrigerado productoRefrigerado){
        productoRefrigerados.add(productoRefrigerado);

    }
    public void agregarProductoEnvasado(ProductoEnvasado productoEnvasado){
        productoEnvasados.add(productoEnvasado);
        
    }
    public void agregarProductoPerecedero(ProductoPerecedero productoPerecedero){
        productoPerecederos.add(productoPerecedero);
        
    }
    
    
}
