package co.edu.uniquindio.poo;

public class AreaJuego {
    public int limiteJugadores;
    public String reglaEtiqueta;
    public AreaJuego(int limiteJugadores, String reglaEtiqueta) {
        this.limiteJugadores = limiteJugadores;
        this.reglaEtiqueta = reglaEtiqueta;
    }
    public int getLimiteJugadores() {
        return limiteJugadores;
    }
    public void setLimiteJugadores(int limiteJugadores) {
        this.limiteJugadores = limiteJugadores;
    }
    public String getReglaEtiqueta() {
        return reglaEtiqueta;
    }
    public void setReglaEtiqueta(String reglaEtiqueta) {
        this.reglaEtiqueta = reglaEtiqueta;
    }
    @Override
    public String toString() {
        return "AreaJuego [limiteJugadores=" + limiteJugadores + ", reglaEtiqueta=" + reglaEtiqueta + "]";
    }
    
    
}
