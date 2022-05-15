package es.iespuerto.ets;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class GestorTest {

    Gestor gestor;
    String nombre = "Alejandro";

    @BeforeEach
    public void Before(){
        gestor = new Gestor();
        Assertions.assertNotNull(gestor,"No se ha generado el objeto gestor");
        HashMap<String,Usuario> usuarios = new HashMap<>();
        gestor = new Gestor(usuarios);
        Assertions.assertNotNull(gestor,"No se ha generado el objeto gestor con un HashMap");
    }

    @Test
    public void crearUsuario(){
        Usuario u = new Usuario();
        gestor.crearUsuario(u);
        Assertions.assertEquals(gestor.getUsuarios().size(), 1,"No se ha añadido el usuario al mapa");
        for (int i = 0; i < 9; i++) {
            gestor.crearUsuario(nombre);
        }
        boolean b = gestor.crearUsuario(nombre);
        Assertions.assertTrue(!(b),"Se añade mas de 100 usuarios");
        boolean res = gestor.crearUsuario(u);
        Assertions.assertTrue(!res,"Se ha añadido el usuario 2 veces");
    }
    @Test
    public void eliminarUsuario(){
        Usuario u = new Usuario();
        String resultado = gestor.eliminarUsuario(u);
        Assertions.assertTrue(resultado.contains("creados"));
        Usuario usuario = new Usuario();
        gestor.crearUsuario(usuario);
        resultado = gestor.eliminarUsuario(gestor.getUsuarios().get(u.getId()));
        Assertions.assertTrue(resultado.contains("eliminado"),"No se ha eliminado el usuario");
        Usuario usuario2 = new Usuario();
        gestor.crearUsuario("hola");
        resultado = gestor.eliminarUsuario(usuario2);
        Assertions.assertTrue(resultado.contains("existe"),"Se ha eliminado el usuario indebido");
    }
    @Test
    public void elegirUsuario(){
        Usuario u = new Usuario();
        try {
            gestor.elegirUsuario(u);
            System.out.println(gestor.getUsuario());
        }catch (Exception ex){
            System.out.println(ex);
        }
        Assertions.assertEquals(gestor.getUsuario(),null,"no existe el usuario seleccionado");

        gestor.crearUsuario(u);
        try{
            gestor.elegirUsuario(u);
        }catch (Exception ex){
            System.out.println(ex);
        }
        Assertions.assertNotNull(gestor.getUsuario(),"no se ha seleccionado el usuario");
        
    }

}
