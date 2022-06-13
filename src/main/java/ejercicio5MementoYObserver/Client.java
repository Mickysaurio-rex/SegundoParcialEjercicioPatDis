package ejercicio5MementoYObserver;

public class Client {
    public static void main(String[] args){
        Github github= new Github();
        Git git= new Git();
        RepositorioGit upbGit = new RepositorioGit();



        upbGit.subscription(new UserGit(
                new Persona("123","Eynar")));
        upbGit.subscription(new UserGit(
                new Persona("444","Jose")));
        upbGit.subscription(new UserGit(
                new Persona("555","Juan")));

        Codigo codigo;
        codigo= new Codigo("public class..","iniciado");
        git.setCommit(codigo);
        github.createCommit("5096ee",git.createCommit());
        codigo= new Codigo("puclic abstract clas...","add persona");
        git.setCommit(codigo);
        github.createCommit("4099ey",git.createCommit());
        codigo= new Codigo("Class Person","add persona");
        git.setCommit(codigo);
        github.createCommit("4234ee",git.createCommit());
        codigo= new Codigo("Class Est","add estudiante");
        git.setCommit(codigo);
        github.createCommit("8096ez",git.createCommit());
        codigo= new Codigo("Class Doc","add doc");
        git.setCommit(codigo);
        github.createCommit("5345ew",git.createCommit());


        codigo = git.restoreCommit(github.getCommit("5096ee"));
        upbGit.notifyObservers();
        System.out.println("***************SE MUESTRAN LOS CAMBIOS EN EL CODIGO*************");
        codigo.showInfo();


        upbGit.detach(0);
        upbGit.detach(1);


        upbGit.subscription(new UserGit(
                new Persona("123","Pablo")));
        upbGit.subscription(new UserGit(
                new Persona("444","Gabo")));
        upbGit.subscription(new UserGit(
                new Persona("555","Richy")));

        upbGit.detach(0);

        codigo = git.restoreCommit(github.getCommit("5345ew"));
        upbGit.notifyObservers();
        System.out.println("***************SE MUESTRAN LOS CAMBIOS EN EL CODIGO*************");
        codigo.showInfo();
    }
}
