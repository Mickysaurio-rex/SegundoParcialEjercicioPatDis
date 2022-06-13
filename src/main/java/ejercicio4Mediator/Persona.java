package ejercicio4Mediator;

import java.util.List;

public abstract class Persona {
    protected IWasap wasap;

    private int numeroDeUsuario;
    private String nombre;


    public Persona(IWasap canalComunicacion){
        this.wasap =  canalComunicacion;
    }

    public int getNumeroDeUsuario() {
        return numeroDeUsuario;
    }

    public Persona setNumeroDeUsuario(int numeroDeUsuario) {
        this.numeroDeUsuario = numeroDeUsuario;
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public Persona setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }


    public abstract void send(String msg, List<Integer> listaPersonas);
    public abstract void received(String msg);
}
