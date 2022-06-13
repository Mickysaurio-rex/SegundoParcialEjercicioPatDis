package ejercicio7ChangeResponsabilityYSingleton;

public class ManagerSaldo {
    private static ManagerSaldo managerSaldo;
    private int saldo;
    private int saldoO;

    private int acumulador;
    private ManagerSaldo(){
        this.saldo=1000;
        this.saldoO=1000;
        acumulador = 0;
        System.out.println("Inicial Saldo: "+saldo);
    }


    private synchronized static void  multiThreadControl(){
        if (managerSaldo== null)
            managerSaldo= new ManagerSaldo();
    }


    public static ManagerSaldo getInstance(){
        if (managerSaldo==null)
            multiThreadControl();
        return managerSaldo;
    }

    public synchronized void depositoDinero(int cantidad){
        if (cantidad<=saldo){
            saldo=saldo-cantidad;
            acumulador=acumulador+cantidad;
            System.out.println("cantidad devuelta: ["+cantidad+"] falta devolver[" +saldo+"]");
        }else{
            System.out.println("Que fiera que eres choco pero solo te falta devolver "+saldo);
        }
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldoO() {
        return saldoO;
    }

    public void setSaldoO(int saldoO) {
        this.saldoO = saldoO;
    }

    public int getAcumulador() {
        return acumulador;
    }

    public void setAcumulador(int acumulador) {
        this.acumulador = acumulador;
    }
}
