package ejercicio6MediatorDos;


import java.util.ArrayList;
import java.util.List;

public class OficinasChat implements IOficinasChat {

    List<Usuario> personasOficinasChat = new ArrayList<>();

    public OficinasChat addUsuarios(Usuario usuario){
        personasOficinasChat.add(usuario);
        return this;
    }

    @Override
    public void send(String msg, Persona persona, String destino) {
        Usuario emisor = (Usuario) persona;
        if(destino.equals("Todos")){
            for(Usuario usuario:personasOficinasChat){
                if(emisor.getCi() != usuario.getCi()) {
                    usuario.received(msg);
                }
            }
        }else{
            for(Usuario usuario:personasOficinasChat){
                if (destino.equals(usuario.getNombre()) ) {
                    usuario.received(msg);
                }
            }
        }
    }


}
