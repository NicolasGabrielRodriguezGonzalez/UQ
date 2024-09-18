package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.time.LocalTime;

public class App {
    public static void main(String[] args) {
        // Creación de las personas.
        Persona personaTitular = new Persona("Nicolas Gabriel", "1138274319", "3012155790", 17);
        Persona persona1 = new Persona("Claudia Liliana", "57486798", "3207180117", 48);
        Persona persona2 = new Persona("Liliana", "4658445", "300301354789", 48);
        Persona personaPrueba = new Persona("Carlos", "9407894", "3000021045", 87);
        
        // Creación de la reserva.
        Reserva reserva = new Reserva(LocalDate.now(), LocalTime.now(), "Reservando.com", 50, 10000000, personaTitular);
        
        reserva.agregarPersona(persona1);
        reserva.agregarPersona(persona2);
        
        // Intentar agregar 50 veces la misma persona (debería imprimir un mensaje de error después de la primera vez)
        for (int i = 0; i < 50; i++) {
            reserva.agregarPersona(personaPrueba);
        }
        
        // Mostrar la reserva final
        System.out.println(reserva);
    }
}
