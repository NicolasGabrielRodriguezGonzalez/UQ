package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.LinkedList;

public class Reserva {
    private LocalDate fecha;
    private LocalTime hora;
    private String nombre;
    private int numeroPersonas;
    private double precio;
    private Persona persona;
    private LinkedList<Persona> personas;

    public Reserva(LocalDate fecha, LocalTime hora, String nombre, int numeroPersonas, double precio, Persona persona) {
        this.fecha = fecha;
        this.hora = hora;
        this.nombre = nombre;
        this.numeroPersonas = numeroPersonas;
        this.precio = precio;
        this.persona = persona;
        this.personas = new LinkedList<>(); // Inicializa la lista aquí
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getNombre() {
        return nombre;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroPersonas() {
        return numeroPersonas;
    }

    public void setNumeroPersonas(int numeroPersonas) {
        this.numeroPersonas = numeroPersonas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Reserva [fecha=" + fecha + ", hora=" + hora + ", nombre=" + nombre + ", numeroPersonas=" + numeroPersonas
                + ", precio=" + precio + ", persona=" + persona + ", personas=" + personas + "]";
    }

    public LinkedList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(LinkedList<Persona> personas) {
        this.personas = personas;
    }


    public void agregarPersona(Persona persona) {
        if (personas.size() >= numeroPersonas) {
            Persona.mostrarMensaje("No se pueden agregar más personas!");
        } 
        else if (validarNombreYTelefono(persona.getNombre(), persona.getTelefono())) {
            Persona.mostrarMensaje("La persona ya existe!");
        } 
        else {
            personas.add(persona);
        }
    }
    
    public boolean validarNombreYTelefono(String nombre, String telefono) {
        for (Persona persona : personas) {
            if (persona.getNombre().equals(nombre) && persona.getTelefono().equals(telefono)) {
                return true;
            }
        }
        return false;
    }
}
