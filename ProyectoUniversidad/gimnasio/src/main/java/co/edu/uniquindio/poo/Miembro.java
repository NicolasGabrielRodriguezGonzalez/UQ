package co.edu.uniquindio.poo;

public class Miembro {
    private String nombre;
    private int edad;
    private String genero;
    private TipoMembresia tipoMembresia;
    private Entrenador entrenador;

    public Miembro(String nombre, int edad, String genero, TipoMembresia tipoMembresia, Entrenador entrenador){
        this.nombre=nombre;
        this.edad=edad;
        this.genero=genero;
        this.tipoMembresia=tipoMembresia;//Relacion no atributo.
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Miembro [nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + ", tipoMembresia="
                + tipoMembresia + ", entrenador=" + entrenador + "]";
    }

    public TipoMembresia getTipoMembresia() {
        return tipoMembresia;
    }

    public void setTipoMembresia(TipoMembresia tipoMembresia) {
        this.tipoMembresia = tipoMembresia;
    }
    
    
}
