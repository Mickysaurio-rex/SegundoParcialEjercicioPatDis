package ejercicio5MementoYObserver;

import java.util.ArrayList;
import java.util.List;

public class RepositorioGit implements ICanalGit{

    private List<IUser> users= new ArrayList<>();

    @Override
    public void subscription(IUser observer) {
        users.add(observer);
    }

    @Override
    public void detach(int posicion) {
        users.remove(posicion);
    }

    @Override
    public void notifyObservers() {
        for (IUser user:users ) {
                user.update("nuevo codigo restaurado!\n Pasa por el respositorio para ver los cambios");
        }
    }
}
