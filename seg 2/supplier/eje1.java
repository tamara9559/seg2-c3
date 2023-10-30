import java.time.LocalDate;
import java.util.Random;
import java.util.function.Supplier;

public final class eje1 {
    public static void main(String[] args) {
        Supplier<LocalDate> date=()->LocalDate.now();
        var random = new Random();
        Supplier<Integer> randomint = random::nextInt;
        usingSupplier(randomint);
        usingSupplier(randomint);
        usingSupplier(randomint);
        usingSupplier(randomint);
        usingSupplier(date);
    }
    static <T> void usingSupplier(Supplier<T> supplier){
        System.out.println("hola");
        System.out.println("numero random: " + supplier.get());

    }
}
