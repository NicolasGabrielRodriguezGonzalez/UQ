package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        Tratamiento tratamiento1 = new Tratamiento("Examen de Sangre", "Examen para medir el nivel de glucosa");
        Tratamiento tratamiento2 = new Tratamiento("Electrocardiograma", "Examen para evaluar el corazón");

        LinkedList<Tratamiento> tratamientosConsulta = new LinkedList<>();
        tratamientosConsulta.add(tratamiento1);
        tratamientosConsulta.add(tratamiento2);

        Consulta consulta = new Consulta("C001", TipoConsulta.ESPECIALIDAD, LocalDate.now(), 0);
        consulta.setTratamientos(tratamientosConsulta);

        Especialista especialista = new Especialista("Dr. Juan Pérez", "123456789", "Calle 1", "123456789",
                TipoEspecialidad.CARDIOLOGIA, 10, consulta);

        MedicoGeneral medicoGeneral = new MedicoGeneral("Dra. Ana Gómez", "987654321", "Calle 2", "987654321", 
                "Medicina Interna", consulta);

        Cirujano cirujano = new Cirujano("Dr. Carlos Ruiz", "456789123", "Calle 3", "456789123", 5);

        Clinica clinica = new Clinica("Clínica Vida Saludable", "555-1234", "Avenida 123");

        clinica.getEspecialistas().add(especialista);
        clinica.getMedicosGenerales().add(medicoGeneral);
        clinica.getCirujanos().add(cirujano);

        System.out.println(clinica);
        System.out.println("Costo de consulta del especialista: " + especialista.calcularCostoConsulta());
        System.out.println("Costo de consulta del médico general: " + medicoGeneral.calcularCostoConsulta());
        System.out.println("Costo de consulta del cirujano: " + cirujano.calcularCostoConsulta());
    }
}
