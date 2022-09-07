package FuncionesLimpias;

import java.util.Scanner;

public class NumeroPar {

    public static void main(String[] args) {

         /**
         *
         * Se solicita al usuario a través de consola que introduzca un número, usando
         * la clase Scanner se recibe el parámetro introducido por el usuario.
         * Para determinar si es par o impar se hace úso del operador ternario,
         * devolviendo el dato por consola.
         */
        System.out.println("Indica el número para comprobar si es par o impar: ");
        String entradaTeclado = "";
        Scanner entradaScanner = new Scanner(System.in);
        entradaTeclado = entradaScanner.nextLine();
        // Con Integer.parseInt() pasamos el dato string a dato entero.
        System.out.println(entradaTeclado + (Integer.parseInt(entradaTeclado) % 2 == 0 ? " es par." : " es impar.") );

    }
}
