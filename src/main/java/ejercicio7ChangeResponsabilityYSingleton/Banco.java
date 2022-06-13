package ejercicio7ChangeResponsabilityYSingleton;

public class Banco {
    private String name;
    private Person person;
    private Manager m;

    public Banco(Person person, String name, Manager m){
        this.person=person;
        this.name=name;
        this.m = m;
    }

    public void depositarDinero(int cantidad){
        ManagerSaldo.getInstance().depositoDinero(cantidad);
        m.criteriaHandler(cantidad);
    }
}
