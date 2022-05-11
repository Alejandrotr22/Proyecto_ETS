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
        gestor.crearUsuario(nombre);
        Assertions.assertEquals(gestor.getUsuarios().size(), 1,"No se ha añadido el usuario al mapa");
    }
    @Test
    public void eliminarUsuario(){
        Usuario u = new Usuario();
        String resultado = gestor.eliminarUsuario(u);
        Assertions.assertTrue(resultado.contains("creados"));
        //gestor.crearUsuario(nombre);
        //Assertions.assertEquals(gestor.getUsuarios().size(), 1,"No se ha añadido el usuario al mapa");
    }

}
