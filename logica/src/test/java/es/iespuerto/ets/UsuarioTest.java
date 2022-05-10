package es.iespuerto.ets;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class UsuarioTest {

    Usuario usuario;

    @Test
    public void constructoresTest(){
        usuario = new Usuario();
        Assertions.assertNotNull(usuario,"No se ha generado el objeto Usuario");
        HashMap<String,Set> dados = new HashMap<>();
        HashMap<String,Rol> roles = new HashMap<>();
        usuario = new Usuario("dados D&D","S002",roles,dados);
        Assertions.assertNotNull(usuario,"No se ha generado el objeto Usuario con parametros");
    }
}
