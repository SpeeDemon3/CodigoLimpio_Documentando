package FuncionesLimpias;

import java.util.Scanner;

public class Conversor {

    public static void main(String[] args) {

        /**
         * Se pide una cantidad en € al usuario, se utiliza la clase Scanner para recibir el
         * número indicado por el usuario y a través de del método conversor se devuelve
         * dicha cantidad en $.
         */
        System.out.println("Escribe una cantidad en euros que quieres converir a dolares: ");
        String entradaTeclado = "";
        Scanner entradaScanner = new Scanner(System.in);
        entradaTeclado = entradaScanner.nextLine();
        System.out.println(entradaTeclado + " Euros, corresponde " +
                conversor(Double.parseDouble(entradaTeclado)) + " $.");

    }

    public static double conversor(double cantidad) {
        return cantidad * 1.29;
    }


}
