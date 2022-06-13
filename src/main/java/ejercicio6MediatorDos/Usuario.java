package ejercicio6MediatorDos;


public class Usuario extends Persona {



    public Usuario(IOficinasChat canalComunicacion) {
        super(canalComunicacion);
    }

    @Override
    public void send(String msg) {
        oficinasChat.send(msg, this);
    }

    @Override
    public void received(String msg) {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Recibio: " + msg);

    }
}
