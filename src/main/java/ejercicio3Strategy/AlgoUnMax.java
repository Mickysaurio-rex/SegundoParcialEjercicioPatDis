package ejercicio3Strategy;

import java.util.List;

public class AlgoUnMax implements  IBusqueda{

    private int precioEntrada;

    public AlgoUnMax(int precioEntrada) {
        this.precioEntrada = precioEntrada;
    }


    @Override
    public void estrategiaDeBusqueda(List<Celular> inventario) {
        if (inventario.size() >= 10)  {
            for (Celular celular : inventario) {
                if(celular.getPrecio() == precioEntrada){
                    celular.showInfo();
                }
            }
        }else{
            System.out.println("Este inventario es muy corto, por favor utilice otra estrategia de busqueda");
        }
    }
}
