package co.edu.uniquindio.poo;

public class App {

    public static void main(String[] args) {
        // Crear instancias de los vehículos
        VehiculoAcuatico vehiculoAcuatico = new VehiculoAcuatico("MarcaAcuatica", "ModeloAcuatico", 5, "MotorNáutico");
        VehiculoAereo vehiculoAereo = new VehiculoAereo("MarcaAerea", "ModeloAerea", 20, 30000);
        VehiculoAnfibio vehiculoAnfibio = new VehiculoAnfibio("MarcaAnfibia", "ModeloAnfibio", 10, "Gasolina", 4, "MotorV8");
        
        // Acciones sobre el vehículo acuático
        System.out.println("Vehículo Acuático: " + vehiculoAcuatico);
        vehiculoAcuatico.encender();
        vehiculoAcuatico.apagar();
        
        // Acciones sobre el vehículo aéreo
        System.out.println("\nVehículo Aéreo: " + vehiculoAereo);
        vehiculoAereo.despegar();
        vehiculoAereo.aterrizar();
        
        // Acciones sobre el vehículo anfibio
        System.out.println("\nVehículo Anfibio: " + vehiculoAnfibio);
        vehiculoAnfibio.avanzar();
        vehiculoAnfibio.retroceder();
        vehiculoAnfibio.girar();
        vehiculoAnfibio.detenerse();
        vehiculoAnfibio.apagar();
    }
}
