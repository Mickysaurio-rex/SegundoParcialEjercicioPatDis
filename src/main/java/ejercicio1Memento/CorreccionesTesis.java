package ejercicio1Memento;

import java.util.HashMap;
import java.util.Map;

public class CorreccionesTesis {
    private Map<String,Memento> commits= new HashMap<>();

    public void createCorreccion(String numeroRevision,Memento m){
        commits.put(numeroRevision,m);
    }

    public Memento getCorrecion(String numeroRevision){
        return commits.get(numeroRevision);
    }
}
