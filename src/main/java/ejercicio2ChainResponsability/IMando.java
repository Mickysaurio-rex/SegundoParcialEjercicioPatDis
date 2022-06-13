package ejercicio2ChainResponsability;

public interface IMando {
    void setNext(IMando handler);//setear al siguiente responsable
    void criteriaMando(String tarea);//el objeto para manejar
    IMando next();
}
