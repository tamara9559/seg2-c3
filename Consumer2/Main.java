package Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args){
        List<String> Deportes = new ArrayList<>();
        Deportes.add("futbol");
        Deportes.add("basquetbal");
        Deportes.add("natacion");

        Consumer<String>consumer= deportes -> System.out.println("estos son los deporte" + Deportes + ";)");
        consumer.accept(Deportes.toString());
    }
}
