package ejercicio2ChainResponsability;

public class General implements IMando {

    private IMando next;

    @Override
    public void setNext(IMando handler) {
        next = handler;
    }

    @Override
    public void criteriaMando(String tarea) {
        if(tarea.equals("Entrevistas")){
            System.out.println("El general esta entrevistando");
        }else{
            next.criteriaMando(tarea);
        }
    }

    @Override
    public IMando next() {
        return next;
    }
}
