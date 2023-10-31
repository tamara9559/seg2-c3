package Supplier;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        Supplier<Identificacion>provedornombre= () -> new Identificacion(" Juan Reales",18,"123456");
        Identificacion identificacion = provedornombre.get();
        System.out.println(" nombre " +identificacion.getNombre() + " edad " + identificacion.getEdad()+ " numero de identificacion " + identificacion.getId());

    }
}
