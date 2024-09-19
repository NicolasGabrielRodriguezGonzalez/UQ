package co.edu.uniquindio.poo;
import java.util.LinkedList;

public class Dueño {
    private String nombre;
    private String direccion;
    private String telefono;
    private LinkedList<Mascota> mascotas;

    public Dueño(String nombre, String direccion, String telefono) {
        setNombre(nombre); // Usar los setters para aplicar validaciones
        setDireccion(direccion); // Usar los setters para aplicar validaciones
        setTelefono(telefono); // Usar los setters para aplicar validaciones
        mascotas = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío o ser nulo.");
        }
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        if (direccion == null || direccion.trim().isEmpty()) {
            throw new IllegalArgumentException("La dirección no puede estar vacía o ser nula.");
        }
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        if (telefono == null || telefono.trim().isEmpty()) {
            throw new IllegalArgumentException("El teléfono no puede estar vacío o ser nulo.");
        }
        this.telefono = telefono;
    }

    public LinkedList<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(LinkedList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public void agregarMascota(Mascota mascota) {
        mascotas.add(mascota);
    }

    @Override
    public String toString() {
        return "Dueño [nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + ", mascotas=" + mascotas + "]";
    }
}
