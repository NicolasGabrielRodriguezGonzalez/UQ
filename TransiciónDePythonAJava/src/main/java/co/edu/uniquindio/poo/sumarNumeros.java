package co.edu.uniquindio.poo;

public class sumarNumeros{
    public static final int NUMERO1 = 7;
    public static final int NUMERO2 = 8;
    public static void main(String[] args) {
        int suma = sumarNumeros (NUMERO1,NUMERO2);
        String mensaje = generarMensaje (NUMERO1,NUMERO2,suma);
        mostrarMensaje (mensaje);
    }
    public static int sumarNumeros (int numero1, int numero2){
        return numero1 + numero2;
    }

    public static String generarMensaje (int numero1, int numero2, int suma){
        String mensaje = "La suma de: " + numero1 + " y " + numero2 + " es igual a: " + suma;
        return mensaje;
    }
    public static void mostrarMensaje (String mensaje){
        System.out.println(mensaje);
    }
    
    
}
