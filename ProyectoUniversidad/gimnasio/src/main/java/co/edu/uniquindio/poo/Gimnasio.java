package co.edu.uniquindio.poo;
import java.time.LocalDate;
import java.util.LinkedList;

public class Gimnasio {
    private String nombre;
    private LocalDate fechaInscripcion;
    private LinkedList<Miembro> miembros;
    private LinkedList<Entrenador> entrenadores;

    public Gimnasio (String nombre, LocalDate fechaInscripcion){
        this.nombre=nombre;
        this.fechaInscripcion=fechaInscripcion;
        miembros = new LinkedList<>();
        entrenadores = new LinkedList<>();

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(LocalDate fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    public LinkedList<Miembro> getMiembros() {
        return miembros;
    }

    public void setMiembros(LinkedList<Miembro> miembros) {
        this.miembros = miembros;
    }

    public LinkedList<Entrenador> getEntrenadores() {
        return entrenadores;
    }

    public void setEntrenadores(LinkedList<Entrenador> entrenadores) {
        this.entrenadores = entrenadores;
    }

    @Override
    public String toString() {
        return "Gimnasio [nombre=" + nombre + ", fechaInscripcion=" + fechaInscripcion + ", miembros=" + miembros
                + ", entrenadores=" + entrenadores + "]";
    }
    
    public void agregarMiembro (Miembro miembro){
        miembros.add(miembro);
    }
    public void agregarEntrenador (Entrenador entrenador){
        entrenadores.add(entrenador);

    }
    public static void mostrarMensaje (String mensaje){
        System.out.println(mensaje);
    }
    
    public void imprimirNombresInvertidos (){
        for (int i = miembros.size(); i>0; i --){//Cuando se aumenta es menor (i--) es para que disminuya.
            Miembro miembro = miembros.get(i);
            mostrarMensaje(miembro.getNombre());

        }
    }
    /*
     * LinkedList<Miembro> listsMenores
     * 
     */
    




    
}
