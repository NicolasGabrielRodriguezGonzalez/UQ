package co.edu.uniquindio.poo;
import java.time.LocalDate;
import java.util.LinkedList;

public class Gimnasio {
    private String nombre;
    private LocalDate fechaInscripcion;
    private LinkedList<Miembro> miembros;
    private LinkedList<Entrenador> entrenadores;

    public Gimnasio (String nombre, LocalDate fechaInscripcion){
        this.nombre=nombre;
        this.fechaInscripcion=fechaInscripcion;
        miembros = new LinkedList<>();
        entrenadores = new LinkedList<>();

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(LocalDate fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    public LinkedList<Miembro> getMiembros() {
        return miembros;
    }

    public void setMiembros(LinkedList<Miembro> miembros) {
        this.miembros = miembros;
    }

    public LinkedList<Entrenador> getEntrenadores() {
        return entrenadores;
    }

    public void setEntrenadores(LinkedList<Entrenador> entrenadores) {
        this.entrenadores = entrenadores;
    }

    @Override
    public String toString() {
        return "El gimnasio tiene como nombre " + nombre + ", se inicia la fecha de Inscripcion el " + fechaInscripcion + ", y los miembros son: \n" + miembros+" los entrenadores son: \n"+entrenadores;
    }
    
    public void agregarMiembro (Miembro miembro){
        miembros.add(miembro);
    }
    public void agregarEntrenador (Entrenador entrenador){
        entrenadores.add(entrenador);

    }
    public static void mostrarMensaje (String mensaje){
        System.out.println(mensaje);
    }
    //Imprimir nombres de los miembros en orden inverso.
    public void imprimirNombresInvertidos (){
        for (int i = miembros.size()-1; i>=0; i --){//Cuando se aumenta es menor (i--) es para que disminuya.
            Miembro miembro = miembros.get(i);
            mostrarMensaje(miembro.getNombre());

        }
    }
    //Obtener todos los miembros con una edad menor a 18 años.
    public LinkedList<Miembro> ObtenerMiembrosMenoresEdad() {
        LinkedList<Miembro> menores = new LinkedList<>();
        for (Miembro miembro : miembros) {
            if (miembro.getEdad() < 18) {
                menores.add(miembro);
            }
        }
        return menores;
    }
    //Calcular el promedio de las edades de los miembros. 
    public double calcularPromedioEdades(){
        int sumaEdades = 0;
        int cantidadMiembros = miembros.size();
        for (Miembro miembro:miembros){
            sumaEdades += miembro.getEdad();
        }
        double promedio = 0.0;
        if (cantidadMiembros > 0){
                promedio = sumaEdades/cantidadMiembros;
        }
        return promedio;
        
    }
    
    //Eliminar miembros que contengan en el nombre al menos 3 vocales o más.
    //1) Metodo: Identificación de vocales:
    public boolean validarVocal (char letra){
        return letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra =='u';
    }
    //2) Metodo: Contar vocales:
    public int contarVocales (String palabra){
        int contadorVocales = 0;
        for (int i = 0; i< palabra.length(); i++){
            char letra = palabra.charAt(i);
            if(validarVocal(letra)){
                contadorVocales ++;
            }
        }
        return contadorVocales;
    }
    //3) Metodo: Eliminar a los miembros que cumplen la condición:
    public void eliminarMiembrosCon3Vocales (){
        for (int i = 0; i<miembros.size();i++){
            Miembro miembro = miembros.get(i);
            String nombre = miembro.getNombre();
            if (contarVocales(nombre)>= 3){
                miembros.remove(i);
            i--;
            }
        }
    }

    public int obtenerEdadMasRepetida() {
        int edadMasRepetida = miembros.get(0).getEdad();
        int maxFrecuencia = 0;

        for (Miembro miembro1 : miembros) {
            int edad = miembro1.getEdad();
            int frecuencia = 0;

            for (Miembro miembro2 : miembros) {
                if (miembro2.getEdad() == edad) {
                    frecuencia++;
                }
            }

            if (frecuencia > maxFrecuencia) {
                maxFrecuencia = frecuencia;
                edadMasRepetida = edad;
            }
        }

        return edadMasRepetida;
    }
    // contar la cantidad de miembros con menbresia anual y mayores de edad
    public int contarCantidadMiembrosMembresiaAnualMaYoresEdad() {
        int cantidadMiembros = 0;
        for (Miembro miembro : miembros) {
            if (miembro.getTipoMembresia() == TipoMembresia.ANUAL && miembro.getEdad() >= 18) {
                cantidadMiembros++;
            }
        }
        return cantidadMiembros;
    }
    // Lista de entrenadores cuya suma de teléfono es igual a 30
    public LinkedList<Entrenador> obtenerEntrenadoresSumaTelefonoIgual30() {
        LinkedList<Entrenador> listaEntrenadoresTelefono = new LinkedList<>();
        for (Entrenador entrenador : entrenadores) {
            int telefonoEntrenador = entrenador.getTelefono();
            int sumaTelefono = 0;
        
            // Calcular la suma de los dígitos del teléfono
            for (int i = telefonoEntrenador; i > 0; i /= 10) {
                sumaTelefono += i % 10;
            }
            // Si la suma es igual a 30, añadir el entrenador a la lista
            if (sumaTelefono == 30) {
                listaEntrenadoresTelefono.add(entrenador);
            }
        }
        return listaEntrenadoresTelefono;
    }

   
    // Método para invertir nombres de miembros menores de edad
    public void invertirNombresMiembros() {
        for (Miembro miembro : miembros) {
            if (miembro.getEdad() < 18) {
                String nombreMiembro = miembro.getNombre();
                String nombreInvertido = "";

                // Invertir el nombre del miembro
                for (int i = nombreMiembro.length() - 1; i >= 0; i--) {
                    nombreInvertido += nombreMiembro.charAt(i);
                }
                miembro.setNombre(nombreInvertido);
            }
        }
    }
}
