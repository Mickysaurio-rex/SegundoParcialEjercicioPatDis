package ejercicio7ChangeResponsabilityYSingleton;

public class Client {

    public static void main(String[] args) {

        Manager m = new Manager();

        Thread hilo1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Banco banco = new Banco(new Person("Jose"), "BCP", m);
                banco.depositarDinero(100);
                banco.depositarDinero(300);
                banco.depositarDinero(200);
                banco.depositarDinero(100);
                banco.depositarDinero(300);
            }
        });

        hilo1.start();
    }

}
