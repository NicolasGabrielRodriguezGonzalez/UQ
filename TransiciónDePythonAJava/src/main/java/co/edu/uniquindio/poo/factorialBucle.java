package co.edu.uniquindio.poo;
import java.util.Scanner;
public class factorialBucle {
    public static void main(String[] args) {
        int numero = ingresarEntero ("Ingrese un numero cualquiera: ");
        String mensaje = generarMensaje (numero);
        mostrarMensaje (mensaje);
    }
    public static int ingresarEntero (String mensaje){
        Scanner scanner = new Scanner (System.in);//La variable "scanner" puede tener cualquier nombre, "System.in" Todos los datos que entran, 
        System.out.print(mensaje);
        return scanner.nextInt();//Ingrese un entero.
    }
    public static String generarMensaje (int numero){
        int i = 1;
        int factorial = 1;
        String mensaje = "";
        while(i<=numero){
            factorial = factorial * i;
            i+=1;
        }
        mensaje += factorial;
        return mensaje;
    }
    public static void mostrarMensaje(String mensaje){
        System.out.println(mensaje);

    }

    
}

