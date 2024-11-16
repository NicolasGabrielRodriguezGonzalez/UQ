package co.edu.uniquindio.poo;

public class JuegoMesa extends AreaJuego{
    private TipoJuegoMesa tipoJuegoMesa;

    public JuegoMesa(int limiteJugadores, String reglaEtiqueta, TipoJuegoMesa tipoJuegoMesa) {
        super(limiteJugadores, reglaEtiqueta);
        this.tipoJuegoMesa = tipoJuegoMesa;
    }

    public TipoJuegoMesa getTipoJuegoMesa() {
        return tipoJuegoMesa;
    }

    public void setTipoJuegoMesa(TipoJuegoMesa tipoJuegoMesa) {
        this.tipoJuegoMesa = tipoJuegoMesa;
    }

    @Override
    public String toString() {
        return "JuegoMesa [limiteJugadores=" + limiteJugadores + ", tipoJuegoMesa=" + tipoJuegoMesa + ", reglaEtiqueta="
                + reglaEtiqueta + "]";
    }

    public void sentarse(){
        System.out.println("El jugador se esta sentando");
    }
    public void retirarse(){
        System.out.println("El jugador se esta retirando");
    }
    public void hacerApuestaAdicional(){
        System.out.println("El jugador esta realizando una apuesta");
    }
    public void pedirCartas(){
        System.out.println("El jugador esta pidiendo cartas");
    }
    
}
