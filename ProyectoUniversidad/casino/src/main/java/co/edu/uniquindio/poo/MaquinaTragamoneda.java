package co.edu.uniquindio.poo;

public class MaquinaTragamoneda extends AreaJuego {
    private String nombre;

    public MaquinaTragamoneda(int limiteJugadores, String reglaEtiqueta, String nombre) {
        super(limiteJugadores, reglaEtiqueta);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "MaquinaTragamoneda [limiteJugadores=" + limiteJugadores + ", nombre=" + nombre + ", reglaEtiqueta="
                + reglaEtiqueta + "]";
    }
    
    
}
