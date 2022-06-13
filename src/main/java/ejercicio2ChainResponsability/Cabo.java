package ejercicio2ChainResponsability;

public class Cabo implements IMando {

    private IMando next;

    @Override
    public void setNext(IMando handler) {
        next = handler;
    }

    @Override
    public void criteriaMando(String tarea) {
        if(tarea.equals("Limpieza")){
            System.out.println("El cabo debe limpiar");
        }else{
            next.criteriaMando(tarea);
        }
    }

    @Override
    public IMando next() {
        return next;
    }
}
