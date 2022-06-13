package ejercicio3Strategy;

import java.util.List;

public class AlgoUnMin implements IBusqueda{

    private int precioEntrada;

    public AlgoUnMin(int precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    @Override
    public void estrategiaDeBusqueda(List<Celular> inventario) {
        if(inventario.size() <= 10) {
            for (int i = 0; i < inventario.size(); i++) {
                if(inventario.get(i).getPrecio() == precioEntrada){
                    inventario.get(i).showInfo();
                }
            }
        }else{
            System.out.println("Este arreglo es muy grande, utilice otra estrategia de busqueda");
        }
    }
}
