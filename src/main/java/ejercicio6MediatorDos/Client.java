package ejercicio6MediatorDos;


public class Client {
    public static void main(String[]args){
        OficinasChat of1 = new OficinasChat();



        Usuario u1 = new Usuario(of1);
        u1.setNombre("Jose");
        Usuario u2 = new Usuario(of1);
        u2.setNombre("Olga");
        Usuario u3 = new Usuario(of1);
        u3.setNombre("Maria");
        ejercicio4Mediator.Usuario u4 = new ejercicio4Mediator.Usuario(wasap);
        u4.setNombre("Lian").setNumeroDeUsuario(4);
        ejercicio4Mediator.Usuario u5 = new ejercicio4Mediator.Usuario(wasap);
        u5.setNombre("Richy").setNumeroDeUsuario(5);
        ejercicio4Mediator.Usuario u6 = new ejercicio4Mediator.Usuario(wasap);
        u6.setNombre("Pablo").setNumeroDeUsuario(6);
        ejercicio4Mediator.Usuario u7 = new ejercicio4Mediator.Usuario(wasap);
        u7.setNombre("Juan").setNumeroDeUsuario(7);
        ejercicio4Mediator.Usuario u8 = new ejercicio4Mediator.Usuario(wasap);
        u8.setNombre("Luis").setNumeroDeUsuario(8);
        ejercicio4Mediator.Usuario u9 = new ejercicio4Mediator.Usuario(wasap);
        u9.setNombre("Rebe").setNumeroDeUsuario(9);
        ejercicio4Mediator.Usuario u10 = new Usuario(wasap);
        u10.setNombre("Camila").setNumeroDeUsuario(10);

        wasap.addUsuarios(u1).
                addUsuarios(u2).addUsuarios(u3).addUsuarios(u4).addUsuarios(u5).addUsuarios(u6).
                addUsuarios(u7).addUsuarios(u8).addUsuarios(u9).addUsuarios(u10);

        System.out.println("***********NUEVO MENSAJE*************");
        u1.send("Esto es para 2", l1);
        System.out.println("***********NUEVO MENSAJE*************");
        u10.send("Esto es para todos", l2);
    }
}
