package es.iespuerto.ets;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class UsuarioTest {

    Usuario usuario;
    @BeforeEach
    public void crearUsuario(){
        Usuario u = new Usuario();
        usuario = u;
        Assertions.assertNotNull(usuario,"no se ha generado un usuario");
    }

    @Test
    public void constructoresTest(){
        usuario = new Usuario();
        Assertions.assertNotNull(usuario,"No se ha generado el objeto Usuario");
        HashMap<String,Set> dados = new HashMap<>();
        HashMap<String,Rol> roles = new HashMap<>();
        usuario = new Usuario("dados D&D","S002",roles,dados);
        Assertions.assertNotNull(usuario,"No se ha generado el objeto Usuario con parametros");
    }

    @Test
    public void guardarRol(){
        Rol rol = new Rol();
        boolean b = false;
        try {
            b = usuario.guardarRol(rol);
        }catch (Exception ex){
            System.out.println(ex);
        }
        Assertions.assertTrue(b,"No se ha guardado el rol seleccionado");

        try {
            b = usuario.guardarRol(rol);
        }catch (Exception ex){
            System.out.println(ex);
        }
        Assertions.assertTrue(b,"Se ha guardado el rol seleccionado otra vez");
    }


}
