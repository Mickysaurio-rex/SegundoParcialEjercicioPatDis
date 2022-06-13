package ejercicio7ChangeResponsabilityYSingleton;



public class Manager implements IAtencion{

    private IAtencion next;


    @Override
    public void setNext(IAtencion handler) {
        next = handler;
    }

    @Override
    public void criteriaHandler(int monto) {
        CajeroBanco resp1 = new CajeroBanco();
        this.setNext(resp1);

        AgenteDeCredito resp2 = new AgenteDeCredito();
        resp1.setNext(resp2);

        Supervisor resp3 = new Supervisor();
        resp2.setNext(resp3);

        EncargadoDePrestamos resp4 = new EncargadoDePrestamos();
        resp3.setNext(resp4);

        this.next.criteriaHandler(monto);

    }

    @Override
    public IAtencion next() {
        return next;
    }
}
