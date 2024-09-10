package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo("TOYOTA", "HILUX", 2024,
         "GLF 18C", "Negro", 48000, "Diesel", 4500);
        Vehiculo vehiculo2 = new Vehiculo("FORD", "HILUX", 2024,
         "GLF 18C", "Negro", 48000, "Diesel", 4500);
        
        Propietario propietario = new Propietario("Santiago Galeano Osorio", 17, "1138274319");
        Taller taller = new Taller("Donde la mogosa", propietario);
        taller.agregarVehiculos(vehiculo1);
        taller.agregarVehiculos(vehiculo2);
        
        Taller.mostrarMensaje(taller.toString());
    }
}
