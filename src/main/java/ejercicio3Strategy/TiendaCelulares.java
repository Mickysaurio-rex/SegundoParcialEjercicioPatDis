package ejercicio3Strategy;

import java.util.ArrayList;
import java.util.List;

public class TiendaCelulares {
    private String name;
    private List<Celular> inventario = new ArrayList<>();
    private IBusqueda estrategiaBusqeuda;

    public TiendaCelulares(String name) {
        this.name = name;
    }

    public void addCelular(Celular celular){
        inventario.add(celular);
    }

    public IBusqueda getEstrategiaBusqeuda() {
        return estrategiaBusqeuda;
    }

    public void setEstrategiaBusqeuda(IBusqueda estrategiaBusqeuda) {
        this.estrategiaBusqeuda = estrategiaBusqeuda;
    }

    public void iniciarAlgoritmo(){
        estrategiaBusqeuda.estrategiaDeBusqueda(inventario);
    }
}
