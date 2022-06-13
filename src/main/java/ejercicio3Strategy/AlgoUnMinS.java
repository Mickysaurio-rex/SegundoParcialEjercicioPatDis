package ejercicio3Strategy;

import java.util.List;

public class AlgoUnMinS implements IBusqueda{

    private String modeloEntrada;

    public AlgoUnMinS(String modeloEntrada) {
        this.modeloEntrada = modeloEntrada;
    }

    @Override
    public void estrategiaDeBusqueda(List<Celular> inventario) {
        if(inventario.size() <= 10) {
            for (int i = 0; i < inventario.size(); i++) {
                if(inventario.get(i).getModelo().equals(modeloEntrada)){
                    inventario.get(i).showInfo();
                }
            }
        }else{
            System.out.println("Este arreglo es muy grande, utilice otra estrategia de busqueda");
        }
    }
}
