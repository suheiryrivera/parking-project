
public class Auto {
    //Los atributos del auto:
    private String tablilla;
    private String marca;
    private String modelo;
    private int año;

    //constructor 
    public Auto(String tablilla, String marca, String modelo, int año) {
        this.tablilla = tablilla;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    //Getters para obtener la info del carro
    public String getTablilla() {
        return tablilla;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAño() {
        return año;
    }

    //retorna todos los atributos del auto
    @Override
    public String toString() {
        return tablilla + " " + marca + " " + modelo + " " + año;
    }
}