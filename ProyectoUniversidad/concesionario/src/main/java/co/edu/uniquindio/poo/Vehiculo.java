package co.edu.uniquindio.poo;
public class Vehiculo {
    private String marca;
    private String modelo;
    private int añoDeFabricacion;
    private String numeroDePlaca;
    private String color;
    private double kilometraje;
    private String tipoDeCombustible;
    private double potencia;

    public Vehiculo(String marca, String modelo, int añoDeFabricacion, String numeroDePlaca, String color,
     double kilometraje, String tipoDeCombustible, double potencia){
        this.marca=marca;
        this.modelo=modelo;
        this.añoDeFabricacion=añoDeFabricacion;
        this.numeroDePlaca=numeroDePlaca;
        this.color=color;
        this.kilometraje=kilometraje;
        this.tipoDeCombustible=tipoDeCombustible;
        this.potencia=potencia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAñoDeFabricacion() {
        return añoDeFabricacion;
    }

    public void setAñoDeFabricacion(int añoDeFabricacion) {
        this.añoDeFabricacion = añoDeFabricacion;
    }

    public String getNumeroDePlaca() {
        return numeroDePlaca;
    }

    public void setNumeroDePlaca(String numeroDePlaca) {
        this.numeroDePlaca = numeroDePlaca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getTipoDeCombustible() {
        return tipoDeCombustible;
    }

    public void setTipoDeCombustible(String tipoDeCombustible) {
        this.tipoDeCombustible = tipoDeCombustible;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "\n\nEl vehiculo tiene una marca: " + marca + ", modelo: " + modelo + ", año de fabricacion: " + añoDeFabricacion
                + ", numero de placa: " + numeroDePlaca + ", color: " + color + ", kilometraje: " + kilometraje
                + ", tipo de combustible: " + tipoDeCombustible + ", potencia: " + potencia + "\n\n";
    }
    
    public static void mostrarMensaje (String mensaje){
        System.out.println(mensaje);
    }
    

}
/*    public double calcularAutonomia() {
        double consumoPromedio = 8.0; // Ejemplo
        return capacidadTanque / consumoPromedio;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        if (placa == null || placa.isBlank()) {
            throw new IllegalArgumentException("La placa no puede estar vacía.");
        }
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca == null || marca.isBlank()) {
            throw new IllegalArgumentException("La marca no puede estar vacía.");
        }
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        if (modelo <= 0) {
            throw new IllegalArgumentException("El modelo debe ser un número positivo.");
        }
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isBlank()) {
            throw new IllegalArgumentException("El color no puede estar vacío.");
        }
        this.color = color;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        if (tipoCombustible == null || tipoCombustible.isBlank()) {
            throw new IllegalArgumentException("El tipo de combustible no puede estar vacío.");
        }
        this.tipoCombustible = tipoCombustible;
    }

    public double getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(double capacidadTanque) {
        if (capacidadTanque <= 0) {
            throw new IllegalArgumentException("La capacidad del tanque debe ser un número positivo.");
        }
        this.capacidadTanque = capacidadTanque;
    }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(int numeroPasajeros) {
        if (numeroPasajeros <= 0) {
            throw new IllegalArgumentException("El número de pasajeros debe ser un número positivo.");
        }
        this.numeroPasajeros = numeroPasajeros;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso <= 0) {
            throw new IllegalArgumentException("El peso debe ser un número positivo.");
        }
        this.peso = peso;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        if (potencia <= 0) {
            throw new IllegalArgumentException("La potencia debe ser un número positivo.");
        }
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Vehiculo [placa=" + placa + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color
                + ", tipoCombustible=" + tipoCombustible + ", capacidadTanque=" + capacidadTanque
                + ", numeroPasajeros=" + numeroPasajeros + ", peso=" + peso + ", potencia=" + potencia + "]";
    }

    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
 */
