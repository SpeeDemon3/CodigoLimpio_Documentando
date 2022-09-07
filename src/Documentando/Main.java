package Documentando.PatronSingletonJava.src.ruiz;

public class Main {

    public static void main(String[] args) {

        /**
         * Se invoca al metodo getInstance para crear un objeto Singleton
         * con 2 variables diferentes y se pasa por consola
         * para comprobar que efectivamente sigue ocupando la misma zona de memoria del
         * ordenador.
         */
        Singleton superHeroe = Singleton.getInstance();

        Singleton superVillano = Singleton.getInstance();

        System.out.println("Tu amigo y vecino..." + superHeroe);
        System.out.println("Tu amigo y vecino..." + superVillano);

    }


}
