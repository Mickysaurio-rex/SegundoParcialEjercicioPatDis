package ejercicio4Mediator;

import java.util.List;

public class Usuario extends Persona{



    public Usuario(IWasap canalComunicacion) {
        super(canalComunicacion);
    }

    @Override
    public void send(String msg, List<Integer>listaPersonas) {
        wasap.send(msg, this, listaPersonas);
    }

    @Override
    public void received(String msg) {
        System.out.println("Nombre: " + getNombre() + " Numero Usuario: " + getNumeroDeUsuario());
        System.out.println("Recibio: " + msg);

    }
}
