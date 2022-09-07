package Documentando.PatronSingletonJava.src.ruiz;

public class Singleton {
    /**
     * El patón Singleton solo permita que haya una instancia de una clase.
     * Se crea una variable privada, se añaden las funcion getInstance() que devuelve una instancia de
     * la clase Singleton.
     */
    private static Singleton singleton;

    String superheroe;

    /**
     * Se crea un constructor con la clase privada para evitar que se pueda
     * invocar desde fuera, creando una nueva instancia.
     */
    private Singleton() {}

    /**
     *
     * @return Devuelve una instancia del objeto Singleton.
     * Con un condicional if le decimos al método que si la variable singleton
     * es null devolverá un objeto, pero si no lo es, devolverá la que ya está creada.
     */
    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    public String getSuperheroe() {
        return superheroe;
    }

    public void setSuperheroe(String superheroe) {
        this.superheroe = superheroe;
    }

}
