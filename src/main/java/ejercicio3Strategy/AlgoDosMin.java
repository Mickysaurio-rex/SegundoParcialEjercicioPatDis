package ejercicio3Strategy;

import java.util.List;

public class AlgoDosMin implements IBusqueda{

    private String modeloEntrada;
    private int precioEntrada;

    public AlgoDosMin(String modeloEntrada, int precioEntrada) {
        this.modeloEntrada = modeloEntrada;
        this.precioEntrada = precioEntrada;
    }

    @Override
    public void estrategiaDeBusqueda(List<Celular> inventario) {
        if(inventario.size() <= 10) {
            for (int i = 0; i < inventario.size(); i++) {
                if(inventario.get(i).getModelo().equals(modeloEntrada) && inventario.get(i).getPrecio() == precioEntrada){
                    inventario.get(i).showInfo();
                }
            }
        }else{
            System.out.println("Este arreglo es muy grande, utilice otra estrategia de busqueda");
        }
    }
}
