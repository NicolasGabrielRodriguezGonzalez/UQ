package co.edu.uniquindio.poo;
import java.util.LinkedList;

public class Biblioteca {
    private String nombre;
    private LinkedList <Libro> libros; 
    private LinkedList <Estudiante> estudiantes;
    private LinkedList <Bibliotecario> bibliotecarios;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new LinkedList<>();
        this.estudiantes = new LinkedList<>();
        this.bibliotecarios = new LinkedList<>();
        

    }

    public LinkedList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(LinkedList<Libro> libros) {
        this.libros = libros;
    }

    public LinkedList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(LinkedList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public LinkedList<Bibliotecario> getBibliotecarios() {
        return bibliotecarios;
    }

    public void setBibliotecarios(LinkedList<Bibliotecario> bibliotecarios) {
        this.bibliotecarios = bibliotecarios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
    return "Biblioteca: " + nombre + "\n" +
           "Libros: " + libros.toString() + "\n" +
           "Estudiantes: " + estudiantes.toString() + "\n" +
           "Bibliotecarios: " + bibliotecarios.toString();
    }


    public void agregarLibro (Libro libro){
        libros.add(libro);
    }
    public void agregarEstudiante (Estudiante estudiante){
        estudiantes.add(estudiante);
    }
    public void agregarBibliotecario (Bibliotecario bibliotecario){
        bibliotecarios.add(bibliotecario);
    }
    public static void mostrarMensaje (String mensaje){
        System.out.println(mensaje);
    }
    
}
