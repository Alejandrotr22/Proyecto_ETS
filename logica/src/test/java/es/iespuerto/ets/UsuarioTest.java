package es.iespuerto.ets;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class UsuarioTest {

    Usuario usuario;

    @Test
    public void constructoresTest(){
        usuario = new Usuario();
        Assert.assertNotNull("No se ha generado el objeto Usuario",usuario);
        HashMap<String,Set> dados = new HashMap<>();
        HashMap<String,Rol> roles = new HashMap<>();
        usuario = new Usuario("dados D&D","S002",roles,dados);
        Assert.assertNotNull("No se ha generado el objeto Usuario con parametros",usuario);
    }
}
