
public class Espacio {
    //Informacion de los espacios
    private String seccion;   //Esto es para VIP, General, y Electricos
    private int fila;
    private int numero;

    //Constructor 
    public Espacio(String seccion, int fila, int numero) {
        this.seccion = seccion;
        this.fila = fila;
        this.numero = numero;
    }

    //getters 
    public String getSeccion() {
        return seccion;
    }

    public int getFila() {
        return fila;
    }

    public int getNumero() {
        return numero;
    }

    //Para retornar info del parking
    @Override
    public String toString() {
        return seccion + " Fila: " + fila + ", Espacio: " + numero;
    }
}