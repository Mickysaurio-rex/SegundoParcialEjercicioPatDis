package ejercicio2ChainResponsability;

public class Coronel implements IMando {

    private IMando next;

    @Override
    public void setNext(IMando handler) {
        next = handler;
    }

    @Override
    public void criteriaMando(String tarea) {
        if(tarea.equals("Desbloqueos")||tarea.equals("Manifestaciones")){
            System.out.println("El coronel esta organizando la montonera");
        }else{
            next.criteriaMando(tarea);
        }
    }

    @Override
    public IMando next() {
        return next;
    }
}
