package ejercicio3Strategy;

import java.util.List;

public class AlgoDosMax implements IBusqueda{

    private String modeloEntrada;
    private int precioEntrada;

    public AlgoDosMax(String modeloEntrada, int precioEntrada) {

        this.modeloEntrada = modeloEntrada;
        this.precioEntrada = precioEntrada;
    }

    @Override
    public void estrategiaDeBusqueda(List<Celular> inventario) {
        if(inventario.size() >= 10) {
            for(Celular celular: inventario){
                if(celular.getModelo().equals(modeloEntrada) && celular.getPrecio() == precioEntrada){
                    celular.showInfo();
                }
            }
        }else{
            System.out.println("Este arreglo es muy corto, utilice otra estrategia de busqueda");
        }
    }
}
