import java.util.function.BiConsumer;

public class main {
    public static void main(String[] args) {
        infoEstudiante estudiante = new infoEstudiante("diego", "escobar", "10", "5A");

        curso grado = new curso("6B");

        BiConsumer<infoEstudiante, curso> biConsumer = (inf, cur) -> inf.setGrado(cur.getGrado());
        biConsumer.accept(estudiante, grado);

        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Apellidos: " + estudiante.getApellidos());
        System.out.println("edad: " + estudiante.getEdad());
        System.out.println("grado: " + estudiante.getGrado());

    }
}
