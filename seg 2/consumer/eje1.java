import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class eje1 {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        nombres.add("diego");
        nombres.add("mara");
        nombres.add("pepe");
        nombres.add("jose");
        nombres.add("juli");

        Consumer<List <String>> consumer = lista -> {
            Collections.reverse(lista);
            lista.forEach(System.out::println);
        };
        consumer.accept(nombres);
    }
}
