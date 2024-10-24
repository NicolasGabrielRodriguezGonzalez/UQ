package co.edu.uniquindio.poo;

public class Miembro extends Persona{
    private int edad;
    private String genero;
    private TipoMembresia tipoMembresia;
    private Entrenador entrenador;  // Se conserva la relación con Entrenador.
    public Miembro(String nombre, String cedula, int telefono, String correo, int edad, String genero,
        TipoMembresia tipoMembresia, Entrenador entrenador) {
        super(nombre, cedula, telefono, correo);
        this.edad = edad;
        this.genero = genero;
        this.tipoMembresia = tipoMembresia;
        this.entrenador = entrenador; //Se asigna el entrenador.
        // Validaciones
        assert edad > 0 : "La edad debe ser un número positivo";
        assert genero != null && !genero.isBlank() : "El género no puede estar vacío";
        assert tipoMembresia != null : "El tipo de membresía no puede ser nulo";
        assert entrenador != null : "El entrenador no puede ser nulo";
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
