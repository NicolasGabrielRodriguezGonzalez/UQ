package co.edu.uniquindio.poo;


import java.util.LinkedList;
 
public class Grupo {
    private String nombre;
    private Categoria categoria;
    private LinkedList<Contacto> listaContactos;

    public Grupo(String nombre, Categoria categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.listaContactos = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public LinkedList<Contacto> getListaContactos() {
        return listaContactos;
    }

    public void agregarContacto(Contacto contacto) {
        if (listaContactos.contains(contacto)) {
            throw new IllegalArgumentException("El contacto ya está en la lista.");
        }
        listaContactos.add(contacto);
    }

    public void eliminarContacto(Contacto contacto) {
        if (!listaContactos.contains(contacto)) {
            throw new IllegalArgumentException("El contacto no existe en la lista.");
        }
        listaContactos.remove(contacto);
    }

    @Override
    public String toString() {
        return "\nEl grupo " + nombre + " de categoría " + categoria + " tiene los siguientes contactos:\n" +
               listaContactos.toString() + "\n";
    }

    public enum Categoria {
        AMIGOS, FAMILIA, TRABAJO, OTROS;
    }
}