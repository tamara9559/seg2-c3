package Consumer;

public class Deportes {
    private String tipo_de_deporte;

    public Deportes(String tipo_de_deporte) {
        this.tipo_de_deporte = tipo_de_deporte;
    }

    public String getTipo_de_deporte() {
        return tipo_de_deporte;
    }

    public void setTipo_de_deporte(String tipo_de_deporte) {
        this.tipo_de_deporte = tipo_de_deporte;
    }

    @Override
    public String toString() {
        return "Deportes{" +
                "tipo_de_deporte='" + tipo_de_deporte + '\'' +
                '}';
    }
}
