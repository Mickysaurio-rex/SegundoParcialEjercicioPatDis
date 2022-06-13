package ejercicio4Mediator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[]args){
        Wasap wasap = new Wasap();
        List<Integer> l1 = Arrays.asList(2);
        List<Integer> l2 = Arrays.asList(1,2,3,4,5,6,7,8,9);


        Usuario u1 = new Usuario(wasap);
        u1.setNombre("Jose").setNumeroDeUsuario(1);
        Usuario u2 = new Usuario(wasap);
        u2.setNombre("Olga").setNumeroDeUsuario(2);
        Usuario u3 = new Usuario(wasap);
        u3.setNombre("Maria").setNumeroDeUsuario(3);
        Usuario u4 = new Usuario(wasap);
        u4.setNombre("Lian").setNumeroDeUsuario(4);
        Usuario u5 = new Usuario(wasap);
        u5.setNombre("Richy").setNumeroDeUsuario(5);
        Usuario u6 = new Usuario(wasap);
        u6.setNombre("Pablo").setNumeroDeUsuario(6);
        Usuario u7 = new Usuario(wasap);
        u7.setNombre("Juan").setNumeroDeUsuario(7);
        Usuario u8 = new Usuario(wasap);
        u8.setNombre("Luis").setNumeroDeUsuario(8);
        Usuario u9 = new Usuario(wasap);
        u9.setNombre("Rebe").setNumeroDeUsuario(9);
        Usuario u10 = new Usuario(wasap);
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
