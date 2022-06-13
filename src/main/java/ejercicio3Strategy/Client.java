package ejercicio3Strategy;

public class Client {
    public static void main(String []args){
        TiendaCelulares tiendaCelulares = new TiendaCelulares("Mi celu");

        tiendaCelulares.addCelular(new Celular("S10","Samsung", "Alta", 100));
        tiendaCelulares.addCelular(new Celular("S11","Samsung", "Alta", 100));
        tiendaCelulares.addCelular(new Celular("Iphone X","Apple", "Alta", 100));
        tiendaCelulares.addCelular(new Celular("Iphone XS","Apple", "Alta", 90));
        tiendaCelulares.addCelular(new Celular("S6","Samsung", "Alta", 90));
        tiendaCelulares.addCelular(new Celular("X3","POCO", "Media", 50));

        tiendaCelulares.setEstrategiaBusqeuda(new AlgoDosMin("X3", 50));
        tiendaCelulares.iniciarAlgoritmo();

    }
}
