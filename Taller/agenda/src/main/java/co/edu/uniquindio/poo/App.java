package co.edu.uniquindio.poo;

import java.time.LocalDate;//Importación para trabajar con fechas.
import java.time.LocalTime;//importanción para trabajar con tiempo.
import java.util.LinkedList;//Importanción para trabajar con listas.
import javax.swing.JOptionPane;//Importanción para trabajar con el cuadro de dialogo.

public class App {

    public static void main(String[] args) {
        LinkedList<Contacto> contactos = new LinkedList<>();//Creacion de lista <contactos>.
        LinkedList<Grupo> grupos = new LinkedList<>();//Creacion de lista <grupos>.
        LinkedList<Reunion> reuniones = new LinkedList<>();//Creacion de lista <reuniones>.

        String continuar = "s";//Estructura de control e inicialización del bucle while.

        while (continuar.equals("s")) {//Condición que da paso al bucle.
            String opcion = JOptionPane.showInputDialog("Seleccione una opción:\n"
                    + "1. Agregar Contacto\n"
                    + "2. Crear Grupo\n"
                    + "3. Crear Reunión\n"
                    + "4. Mostrar Contactos\n"
                    + "5. Mostrar Grupos\n"
                    + "6. Mostrar Reuniones\n"
                    + "7. Salir");
                //Mensaje que muestra las opciones disponibles.

            //Inicio de las condiciones para realizar cada acción.
            if (opcion.equals("1")) {
                agregarContacto(contactos);
            //Si opcion es 1 se llama al metodo de agregar contacto.
            } else if (opcion.equals("2")) {
                crearGrupo(contactos, grupos);
            //Si opcion es 2 se llama al metodo crear grupo.
            } else if (opcion.equals("3")) {
                crearReunion(contactos, reuniones);
            //Si opcion es 3 se llama el metodo crear reunion.
            } else if (opcion.equals("4")) {
                mostrarContactos(contactos);
            //Si opcion es 4 se llama al metodo mostrar contactos.
            } else if (opcion.equals("5")) {
                mostrarGrupos(grupos);
            //Si opcion es 5 se llama al metodo mostrar grupos.
            } else if (opcion.equals("6")) {
                mostrarReuniones(reuniones);
            //Si opcion es 6 se llama al metodo mostrar reuniones.
            } else if (opcion.equals("7")) {
                continuar = "n";
            //Si opcion es 7 se sale del bucle.
            } else {
                JOptionPane.showMessageDialog(null, "Opción no válida. Intente de nuevo.");
            //Si no se ingresa un numero respecto a las opciones, la opcion es invalida.
            }
        }
    }
    //Metodo para agregar contactos.
    private static void agregarContacto(LinkedList<Contacto> contactos) {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del contacto:");
        String alias = JOptionPane.showInputDialog("Ingrese el alias del contacto:");
        String direccion = JOptionPane.showInputDialog("Ingrese la dirección del contacto:");
        String telefono = JOptionPane.showInputDialog("Ingrese el teléfono del contacto:");
        String email = JOptionPane.showInputDialog("Ingrese el email del contacto:");
        //Cuadro de dialogo que le pide al usuario cada dato referente a la clase Contacto.

        Contacto contacto = new Contacto(nombre, alias, direccion, telefono, email);
        //Creacion del objeto contacto.

        contactos.add(contacto);
        //Agregación de contacto a la lista contactos.

        JOptionPane.showMessageDialog(null, "Contacto agregado con éxito: " + contacto.toString());
        //Mensaje que muestra que el contacto se agrego exitosamente.
    }
    //metodo para crear grupo.
    private static void crearGrupo(LinkedList<Contacto> contactos, LinkedList<Grupo> grupos) {
        //Se le pasan como parametro la lista de contactos y de grupos para iterar sobre ellas y realizar cambios.
        String nombreGrupo = JOptionPane.showInputDialog("Ingrese el nombre del grupo:");
        //Cuadro de dialogo que le pide al usuario que le de un nombre al grupo.
        String[] categorias = {"AMIGOS", "FAMILIA", "TRABAJO", "OTROS"};
        //Declaración de Array que contiene una arreglo con las diferentes categorias de tipo ENUM.
        String categoriaSeleccionada = (String) JOptionPane.showInputDialog(null, "Seleccione la categoría del grupo:",
                "Categoría", JOptionPane.QUESTION_MESSAGE, null, categorias, categorias[0]);
            //Casting para String, es decir el retorno se pasa auna variable de tipo String.
            //Null es posicionamiento del cuadro del dialogo.
            //Categoria es para darle un titulo al cuadro de dialogo.
            //QUESTION_MESSAGE es para cambiar el tipo de icono y mensaje.
            //Null es para reacomodar el cuadro de dialogo.
            //Categorias es la que contiene las diferentes categorias a manera de Array.
            //Categorias[0] posicion estandar en la categoria de AMIGOS.
        Grupo.Categoria categoria = Grupo.Categoria.valueOf(categoriaSeleccionada.toUpperCase());
        //Grupo.Categoria: Nombre del tipo Enum definido dentro de la clase Grupo.
        //Grupo.Categoria.value0f: Metodo estatico que convierte una cadena de texto en un valor de tipo enum.
        //CategoriaSeleccionada.toUpperCase: Convierte la cadena de texto en mayusculas.

        Grupo grupo = new Grupo(nombreGrupo, categoria);
        //Creacion del objeto Grupo-


        for (Contacto contacto : contactos) {//Itera sobre la lista contactos
            int opcion = JOptionPane.showConfirmDialog(null, "¿Desea agregar a " + contacto.getNombre() + " al grupo?",
                    "Agregar Contacto", JOptionPane.YES_NO_OPTION);//Pregunta si quiere agregar el contacto al grupo.
            if (opcion == JOptionPane.YES_OPTION) {//Si selecciona si, se agrega al grupo.
                grupo.agregarContacto(contacto);//Resultado.
            }
        }
        //Verificar el # de conctactos en el grupo.
        if (grupo.getListaContactos().size() >= 5) {
            grupos.add(grupo);
            JOptionPane.showMessageDialog(null, "Grupo creado con éxito: " + grupo.toString());
        } else {
            JOptionPane.showMessageDialog(null, "El grupo debe tener al menos 5 contactos. No se creó el grupo.");
        }
    }

    private static void crearReunion(LinkedList<Contacto> contactos, LinkedList<Reunion> reuniones) {
        String descripcion = JOptionPane.showInputDialog("Ingrese la descripción de la reunión:");
        String fechaStr = JOptionPane.showInputDialog("Ingrese la fecha de la reunión (AAAA-MM-DD):");
        LocalDate fecha = LocalDate.parse(fechaStr);//Convierte el String a un objeto Localtime.
        String horaStr = JOptionPane.showInputDialog("Ingrese la hora de la reunión (HH:MM):");
        LocalTime hora = LocalTime.parse(horaStr);//Conversion del String a un objeto Localtime.

        Reunion reunion = new Reunion(descripcion, fecha, hora);//Crea nuenva instancia de reunion.
        //Agregar asistentes a la reunión.
        for (Contacto contacto : contactos) {//Iteración sonre la lista de contactos.
            int opcion = JOptionPane.showConfirmDialog(null, "¿Desea agregar a " + contacto.getNombre() + " a la reunión?",
                    "Agregar Asistente", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.YES_OPTION) {//if opcion == si;
                reunion.agregarAsistente(contacto);//Condición de que si el usuario elige Si se agrega el contacto a la lista de asistentes.
            }
        }

        reuniones.add(reunion);//agregar la nueva reunion a Reuniones.
        JOptionPane.showMessageDialog(null, "Reunión creada con éxito: " + reunion.toString());
        //Mostrar un cuadro de dialogo mostrando que la reunion fue creada.
    }

    private static void mostrarContactos(LinkedList<Contacto> contactos) {
        //Lista de objetos Contacto que se desea mostrar.
        String info = "Contactos:\n";
        for (Contacto contacto : contactos) {
            //Recorre cada Objeto Contacto en la lista Contactos.
            info += contacto.toString() + "\n";
        }
        JOptionPane.showMessageDialog(null, info);
    }   //Muestra una lista de todos los contactos almacenados en el sistema.

    private static void mostrarGrupos(LinkedList<Grupo> grupos) {
        //Muestra una lista de todos los grupos almacenados en el sistema.
        String info = "Grupos:\n";
        for (Grupo grupo : grupos) {
            info += grupo.toString() + "\n";
            //Se usa para obtener una representación en cadena del objeto, que se añade a info seguido de un salto de línea.
        }
        JOptionPane.showMessageDialog(null, info);
    }   //Muestra el contenidode info que contiene la lista de grupos.

    private static void mostrarReuniones(LinkedList<Reunion> reuniones) {
        //El metodo se encarga de mostrar una lista de reuniones almacenadas en el sistema.
        String info = "Reuniones:\n";
        for (Reunion reunion : reuniones) {
            info += reunion.toString() + "\n";
        }
        JOptionPane.showMessageDialog(null, info);
    }
}
