package ejercicio5MementoYObserver;

public interface ICanalGit {
    void subscription(IUser observer);
    void detach(int posicion);
    void notifyObservers();
}
