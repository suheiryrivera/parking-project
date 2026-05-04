
public class Estudiante {
    //Atributos del estudiante
    private String nombre;
    private String numeroDeEstudiante;
    private String email;
    private String telefono;

        //Contructor 
    public Estudiante(String nombre, String numeroDeEstudiante, String email, String telefono) {
        this.nombre = nombre;
        this.numeroDeEstudiante = numeroDeEstudiante;
        this.email = email;
        this.telefono = telefono;
    }

        // Getters de estudiante
    public String getNombre() {
        return nombre;
    }

    public String getnumeroDeEstudiante() {
        return numeroDeEstudiante;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    //retornar los atributos del estudiante
    @Override
    public String toString() {
        return nombre + " # Estudiante: " + numeroDeEstudiante + " Email: " + email + " # Telefono: " + telefono;
    }
}