package co.edu.uniquindio.poo;
import java.util.LinkedList;

public class Dueño {
    private String nombre;
    private String direccion;
    private String telefono;
    private LinkedList<Mascota> mascotas;
    
    public Dueño(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        mascotas = new LinkedList<>();
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public LinkedList<Mascota> getMascotas() {
        return mascotas;
    }
    public void setMascotas(LinkedList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }
    public void agregarMascota (Mascota mascota){
        mascotas.add(mascota);
    }
    @Override
    public String toString() {
        return "Dueño [nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + ", mascotas="
                + mascotas + "]";
    }
    
    
    

    
}
