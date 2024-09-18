package co.edu.uniquindio.poo;

public class Veterinario {
    private String nombre;
    private String numLicencia;
    private TipoEspecialidad especialidad;
    public Veterinario(String nombre, String numLicencia, TipoEspecialidad especialidad) {
        this.nombre = nombre;
        this.numLicencia = numLicencia;
        this.especialidad = especialidad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNumLicencia() {
        return numLicencia;
    }
    public void setNumLicencia(String numLicencia) {
        this.numLicencia = numLicencia;
    }
    public TipoEspecialidad getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(TipoEspecialidad especialidad) {
        this.especialidad = especialidad;
    }
    @Override
    public String toString() {
        return "Veterinario [nombre=" + nombre + ", numLicencia=" + numLicencia + ", especialidad=" + especialidad
                + "]";
    }
    

    

    
}
