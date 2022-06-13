package ejercicio1Memento;

public class Client {
    public static void main(String[] args){
        CorreccionesTesis ct = new CorreccionesTesis();
        Revisor r = new Revisor();

        Tesis tesis;

        tesis = new Tesis("Introduccion", "Faltan Objetivos");
        r.setRevision(tesis);
        ct.createCorreccion("Primera Revision", r.createRevision());

        tesis = new Tesis(" Introduccion \n Objetivo General \n Objetivo Especifico",
                "Faltan Marco Teorico");
        r.setRevision(tesis);
        ct.createCorreccion("Seguna Revision", r.createRevision());

        tesis = new Tesis("Introduccion \n Objetivo General \n Objetivo Especifico \n Marco Teorico",
                "Faltan Separar puntos");
        r.setRevision(tesis);
        ct.createCorreccion("Tercera Revision", r.createRevision());

        tesis = new Tesis("Introduccion \n Objetivo General \n Objetivo Especifico \n Marco Teorico \n Punto 1 \n Punto 2",
                "Falta Poner Conclusiones");
        r.setRevision(tesis);
        ct.createCorreccion("Cuarta Revision", r.createRevision());

        tesis = new Tesis("Introduccion \n Objetivo General \n Objetivo Especifico \n Marco Teorico \n Punto 1 \n Punto 2 \n Conclusiones",
                "Falta Poner Conclusiones");
        r.setRevision(tesis);
        ct.createCorreccion("Quinta Revision", r.createRevision());

        tesis = r.restoreTesis(ct.getCorrecion("Tercera Revision"));
        tesis.showInfo();
    }
}
