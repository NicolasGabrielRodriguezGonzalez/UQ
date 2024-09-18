package co.edu.uniquindio.poo;

public class Miembro {
    private String nombre;
    private int edad;
    private String genero;
    private String cedula;
    private TipoMembresia tipoMembresia;

    public Miembro(String nombre, int edad, String genero,String cedula, TipoMembresia tipoMembresia){
        this.nombre=nombre;
        this.edad=edad;
        this.genero=genero;
        this.cedula=cedula;
        this.tipoMembresia=tipoMembresia;//Relacion no atributo.
        assert ! nombre.isBlank();
        assert edad> 0;
        assert ! genero.isBlank();
        assert ! cedula.isBlank();
        

        
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public TipoMembresia getTipoMembresia() {
        return tipoMembresia;
    }

    public void setTipoMembresia(TipoMembresia tipoMembresia) {
        this.tipoMembresia = tipoMembresia;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return nombre + ", edad=" + edad + ", genero=" + genero + ", cedula=" + cedula
                + ", membresia=" + tipoMembresia + "\n\n";
    }
}
