package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Veterinaria {
    private String nombre;
    private LinkedList <Perro> perros;
    private LinkedList <Gato> gatos;
    private LinkedList <Leon> leones;
    private LinkedList <Aguila> aguilas;
    private LinkedList <Canario> canarios;
    public Veterinaria(String nombre) {
        this.nombre = nombre;
        perros = new LinkedList<>();
        gatos = new LinkedList<>();
        leones = new LinkedList<>();
        aguilas = new LinkedList<>();
        canarios = new LinkedList<>();

    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public LinkedList<Perro> getPerros() {
        return perros;
    }
    public void setPerros(LinkedList<Perro> perros) {
        this.perros = perros;
    }
    public LinkedList<Gato> getGatos() {
        return gatos;
    }
    public void setGatos(LinkedList<Gato> gatos) {
        this.gatos = gatos;
    }
    public LinkedList<Leon> getLeones() {
        return leones;
    }
    public void setLeones(LinkedList<Leon> leones) {
        this.leones = leones;
    }
    public LinkedList<Aguila> getAguilas() {
        return aguilas;
    }
    public void setAguilas(LinkedList<Aguila> aguilas) {
        this.aguilas = aguilas;
    }
    public LinkedList<Canario> getCanarios() {
        return canarios;
    }
    public void setCanarios(LinkedList<Canario> canarios) {
        this.canarios = canarios;
    }
    @Override
    public String toString() {
        return "Veterinaria [nombre=" + nombre + ", perros=" + perros + ", gatos=" + gatos + ", leones=" + leones
                + ", aguilas=" + aguilas + ", canarios=" + canarios + "]";
    }
    
    
}
