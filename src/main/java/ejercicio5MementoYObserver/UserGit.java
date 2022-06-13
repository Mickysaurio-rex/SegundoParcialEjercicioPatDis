package ejercicio5MementoYObserver;

public class UserGit implements IUser {

    Persona persona;

    public UserGit(Persona persona) {
        this.persona = persona;
    }

    @Override
    public void update(String msg) {
        System.out.println("******* Notificacion: "+msg+" *****");
        System.out.println("persona: "+persona.getName());
    }

    public Persona getPersona() {
        return persona;
    }


}
