package ejercicio6MediatorDos;


public class Client {
    public static void main(String[]args){
        OficinasChat of1 = new OficinasChat();



        Usuario u1 = new Usuario(of1);
        u1.setNombre("Jose", "123");
        Usuario u2 = new Usuario(of1);
        u2.setNombre("Olga", "124");
        Usuario u3 = new Usuario(of1);
        u3.setNombre("Maria", "125");
        Usuario u4 = new Usuario(of1);
        u4.setNombre("Lian", "126");
        Usuario u5 = new Usuario(of1);
        u5.setNombre("Richy", "127");

        of1.addUsuarios(u1).
                addUsuarios(u2).addUsuarios(u3).addUsuarios(u4).addUsuarios(u5);

        System.out.println("***********NUEVO MENSAJE*************");
        u5.send("Esto es para Maria", "Maria");
        System.out.println("***********NUEVO MENSAJE*************");
        u1.send("Esto es para todos", "Todos");


    }
}
