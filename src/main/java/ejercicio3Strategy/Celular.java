package ejercicio3Strategy;

public class Celular {
    private String modelo;
    private String marca;
    private String gama;
    private int precio;

    public Celular(String modelo, String marca, String gama, int precio) {
        this.modelo = modelo;
        this.marca = marca;
        this.gama = gama;
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public Celular setModelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public String getMarca() {
        return marca;
    }

    public Celular setMarca(String marca) {
        this.marca = marca;
        return this;
    }

    public String getGama() {
        return gama;
    }

    public Celular setGama(String gama) {
        this.gama = gama;
        return this;
    }

    public int getPrecio() {
        return precio;
    }

    public Celular setPrecio(int precio) {
        this.precio = precio;
        return this;
    }

    public void showInfo(){
        System.out.println("*********INFO CELULAR*********");
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Gama: " + gama );
        System.out.println("Precio: " + precio + "bs");
    }
}
