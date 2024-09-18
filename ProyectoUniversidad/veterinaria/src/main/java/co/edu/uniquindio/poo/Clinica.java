package co.edu.uniquindio.poo;
import java.util.LinkedList;

public class Clinica {
    private String nombre;
    private String direccion;
    private String telefono;
    private LinkedList<Veterinario> veterinarios;
    private LinkedList<Mascota> mascotas;
    private LinkedList<Dueño> dueños;


    public Clinica (String nombre, String direccion, String telefono){
        this.nombre=nombre;
        this.direccion=direccion;
        this.telefono=telefono;
        veterinarios = new LinkedList<>();
        mascotas = new LinkedList<>();
        dueños = new LinkedList<>();
        
    }

    public String getNombre() {
        return nombre;
    }

    public LinkedList<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(LinkedList<Mascota> mascotas) {
        this.mascotas = mascotas;
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

    public LinkedList<Veterinario> getVeterinarios() {
        return veterinarios;
    }

    public void setVeterinarios(LinkedList<Veterinario> veterinarios) {
        this.veterinarios = veterinarios;
    }

    @Override
    public String toString() {
        return "Clinica [nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + ", veterinarios="
                + veterinarios + ", mascotas=" + mascotas + ", dueños=" + dueños + "]";
    }
    public void agregarVeterinario(Veterinario veterinario){
        veterinarios.add(veterinario);
    }
    public void agregarMascota(Mascota mascota){
        mascotas.add(mascota);

    }
    public static void mostrarMensaje (String mensaje){
        System.out.println(mensaje);
    }

    public LinkedList<Dueño> getDueños() {
        return dueños;
    }

    public void setDueños(LinkedList<Dueño> dueños) {
        this.dueños = dueños;
    }
    public void agregarDueño(Dueño dueño){
        dueños.add(dueño);
    }

    
    
    



    
}
