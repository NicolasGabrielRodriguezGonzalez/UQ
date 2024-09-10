package co.edu.uniquindio.poo;
import java.util.Scanner;
public class tablasMultiplicar {
    public static void main(String[] args) {
        int numero = ingresarEntero ("Ingrese el primer numero: ");
        int numero2 = ingresarEntero ("Ingrese el segundo numero: ");
        String mensaje = generarMensaje (numero, numero2);
        mostrarMensaje (mensaje);
    }
    public static int ingresarEntero (String mensaje){
        Scanner scanner = new Scanner (System.in);
        System.out.println(mensaje);
        return scanner.nextInt();
    }
    public static String generarMensaje (int numero, int numero2){
        String mensaje = "";
        for (int i = numero;i <= numero2; i++){
            mensaje += "Para el numero " + i + " queda lo siguiente:\n";
            for (int j = 0; j<= 10; j += 2){
                int factor = i * j;
                mensaje += i + " X " + j + " = " + factor + "\n";
            }
            mensaje += "\n";
        }
        return mensaje;
   

    }
    public static void mostrarMensaje (String mensaje){
        System.out.println(mensaje);
    }
}
/*package co.edu.uniquindio.poo;
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

 */

    