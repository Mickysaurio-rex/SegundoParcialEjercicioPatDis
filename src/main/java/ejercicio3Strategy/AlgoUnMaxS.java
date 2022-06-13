package ejercicio3Strategy;

import java.util.List;

public class AlgoUnMaxS implements IBusqueda{

    private String modeloEntrada;

    public AlgoUnMaxS(String modeloEntrada) {
        this.modeloEntrada = modeloEntrada;
    }

    @Override
    public void estrategiaDeBusqueda(List<Celular> inventario) {
        if(inventario.size() >= 10) {
            for(Celular celular: inventario){
                if(celular.getModelo().equals(modeloEntrada)){
                    celular.showInfo();
                }
            }
        }else{
            System.out.println("Este arreglo es muy corto, utilice otra estrategia de busqueda");
        }
    }
}
