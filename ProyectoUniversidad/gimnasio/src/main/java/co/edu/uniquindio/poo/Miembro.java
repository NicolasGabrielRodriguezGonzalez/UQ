package co.edu.uniquindio.poo;

public class Miembro {
    private String nombre;
    private int edad;
    private String genero;
    private String cedula;
    private TipoMembresia tipoMembresia;
    private Entrenador entrenador;  // Se conserva la relación con Entrenador.

    public Miembro(String nombre, int edad, String genero, String cedula, TipoMembresia tipoMembresia, Entrenador entrenador) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.cedula = cedula;
        this.tipoMembresia = tipoMembresia;
        this.entrenador = entrenador;  // Se asigna el entrenador.
        
        assert !nombre.isBlank();
        assert edad > 0;
        assert !genero.isBlank();
        assert !cedula.isBlank();
    }

    // Getters y setters
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public TipoMembresia getTipoMembresia() {
        return tipoMembresia;
    }

    public void setTipoMembresia(TipoMembresia tipoMembresia) {
        this.tipoMembresia = tipoMembresia;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    @Override
    public String toString() {
        return nombre + ", edad=" + edad + ", genero=" + genero + ", cedula=" + cedula
                + ", membresia=" + tipoMembresia + ", entrenador=" + entrenador.getNombre() + "\n\n";
    }
}
