package ejercicio4Mediator;

import java.util.List;

public interface IWasap {
    void send(String msg, Persona persona, List<Integer> listapersonas);
}
