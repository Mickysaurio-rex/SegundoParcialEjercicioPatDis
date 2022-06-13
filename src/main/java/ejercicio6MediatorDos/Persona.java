package ejercicio6MediatorDos;


public abstract class Persona {
    protected IOficinasChat oficinasChat;

    private String nombre;

    private String ci;

    public Persona(IOficinasChat canalComunicacion){
        this.oficinasChat =  canalComunicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public Persona setNombre(String nombre, String ci) {
        this.nombre = nombre;
        this.ci = ci;
        return this;
    }

    public String getCi() {
        return ci;
    }

    public Persona setCi(String ci) {
        this.ci = ci;
        return this;
    }

    public abstract void send(String msg, String nombre);
    public abstract void received(String msg);
}
