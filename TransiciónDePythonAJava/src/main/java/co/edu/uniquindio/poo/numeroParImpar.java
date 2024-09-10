package co.edu.uniquindio.poo;

import java.util.Scanner;
public class numeroParImpar {
    public static void main(String[] args) {
        int numero = ingresarEntero ("Ingrese un número: ");
        String mensaje = generarMensaje (numero);
        mostrarMensaje (mensaje);
    }
    public static int ingresarEntero (String mensaje){
        Scanner scanner = new Scanner (System.in);//La variable "scanner" puede tener cualquier nombre, "System.in" Todos los datos que entran, 
        System.out.print(mensaje);
        return scanner.nextInt();//Ingrese un entero.
    }

    public static String generarMensaje (int numero){
        String tipo;
        if (numero%2==0){
            tipo = "El numero " + numero + " es par";
        }else{
            tipo = "El numero " + numero + "es impar";
        }
        return tipo;
    }
    public static void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }    

}
