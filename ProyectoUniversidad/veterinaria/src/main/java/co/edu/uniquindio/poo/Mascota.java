package co.edu.uniquindio.poo;

public class Mascota {
    private String nombre;
    private int edad;
    private String especie;
    private HistorialMedico historialMedico;

    public Mascota(String nombre, int edad, String especie, HistorialMedico historialMedico) {
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
        this.historialMedico = historialMedico;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public HistorialMedico getHistorialMedico() {
        return historialMedico;
    }

    public void setHistorialMedico(HistorialMedico historialMedico) {
        this.historialMedico = historialMedico;
    }

    @Override
    public String toString() {
        return "Mascota [nombre=" + nombre + ", edad=" + edad + ", especie=" + especie + ", historialMedico="
                + historialMedico + "]";
    }
    

    
}
