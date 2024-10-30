package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Clinica {
    private String nombre;
    private String telefono;
    private String direccion;
    private LinkedList<Especialista> especialistas;
    private LinkedList<MedicoGeneral> medicosGenerales;
    private LinkedList <Cirujano> cirujanos;
    public Clinica(String nombre, String telefono, String direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        especialistas = new LinkedList<>();
        cirujanos = new LinkedList<>();
        medicosGenerales = new LinkedList<>();
    }
    public LinkedList<Especialista> getEspecialistas() {
        return especialistas;
    }
    public void setEspecialistas(LinkedList<Especialista> especialistas) {
        this.especialistas = especialistas;
    }
    public LinkedList<MedicoGeneral> getMedicosGenerales() {
        return medicosGenerales;
    }
    public void setMedicosGenerales(LinkedList<MedicoGeneral> medicosGenerales) {
        this.medicosGenerales = medicosGenerales;
    }
    public LinkedList<Cirujano> getCirujanos() {
        return cirujanos;
    }
    public void setCirujanos(LinkedList<Cirujano> cirujanos) {
        this.cirujanos = cirujanos;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    @Override
    public String toString() {
        return "Clinica [nombre=" + nombre + ", telefono=" + telefono + ", direccion=" + direccion + "]";
    }
    
    
}
