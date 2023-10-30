public class infoEstudiante {
    private String nombre;
    private String apellidos;
    private  String edad;
    private String grado;

    public infoEstudiante(String nombre, String apellidos, String edad, String grado) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.grado = grado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }
}
