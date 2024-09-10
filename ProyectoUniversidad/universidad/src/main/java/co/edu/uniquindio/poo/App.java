package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App { 
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("1111111", "Camilo", "Zuñiga", "cz@gmail.com", "332000000", 20, 3.0, 3.5, 4.5, 2.0, 4.4);
        Estudiante estudiante2 = new Estudiante("2222222", "Sara", "Duque", "SaraDuke@gmail.com", "3207280117", 19, 3.5, 4.3, 1.5, 2.2, 5.0);
        Estudiante estudiante3 = new Estudiante("7654321", "Lucas", "García", "LucasGarcía@gmail.com", "320000002", 21, 2.5, 3.0, 4.0, 3.5, 4.1);
        Estudiante estudiante4 = new Estudiante("1111111", "Santiago", "Zuñiga", "cz@gmail.com", "332000000", 20, 3.0, 3.5, 4.5, 2.0, 4.4);
        

        /*¿como se instancia el objeto? */
        //Crear profesor.
        Profesor profesor = new Profesor("Ana Maria Tamayo", "113827574");
        
        //Crear curso.
        Curso curso = new Curso("Programacion 1 UQ", profesor);
        curso.agregarEstudiante(estudiante1);
        curso.agregarEstudiante(estudiante2);
        
        Curso.mostrarMensaje(curso.toString());

        //Verificar y mostrar estudiante.
        String numeroIdentificacion = " 1111111 ";
        boolean existe = curso.validarNumeroIdentificacion(numeroIdentificacion);
        if (existe) {
            Curso.mostrarMensaje("El estudiante" + numeroIdentificacion + "no existe.");
        }else{
            Curso.mostrarMensaje("Error, el estudiante" + numeroIdentificacion + "ya existe");
        }
        //eliminar estudiante
        curso.eliminarEstudiante(numeroIdentificacion);
        Curso.mostrarMensaje(curso.toString());


    }
}
