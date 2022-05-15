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

    @Test
    public void eliminarSetTest(){
        Set set = new Set();
        String resultado = "";
        boolean b = false;
        try {
            usuario.eliminarSet(set);
        }catch (Exception ex){
            resultado = ex + "";
        }
        Assertions.assertTrue(resultado.contains("sets guardados"),"Se ha eliminado un set no deseado");

        try {
            usuario.guardarSet(set);
            Set set2 = new Set();
            usuario.eliminarSet(set2);
        }catch (Exception ex){
            resultado = ex + "";
        }
        Assertions.assertTrue(resultado.contains("existe"),"Se ha eliminado un set inexistente");

        try {
            b = usuario.eliminarSet(set);
        }catch (Exception ex){
            resultado = ex + "";
        }
        Assertions.assertTrue(b,"Se ha eliminado un set inexistente");
    }

    @Test
    public void eliminarDado(){
        Set set = new Set();
        Dado dado = new Dado();
        String resultado = "";
        boolean b = false;
        try {
            usuario.eliminarDado(set,dado);
        }catch (Exception ex){
            resultado = ex + "";
        }
        Assertions.assertTrue(resultado.contains("dados guardados"),"Se ha eliminado un dado no deseado");

        try {
            usuario.guardarDado(set,dado);
            Dado dado2 = new Dado();
            usuario.eliminarDado(set,dado2);
        }catch (Exception ex){
            resultado = ex + "";
        }
        Assertions.assertTrue(resultado.contains("existe"),"Se ha eliminado un dado inexistente");

        try {
            b = usuario.eliminarDado(set,dado);
        }catch (Exception ex){
            resultado = ex + "";
        }
        Assertions.assertTrue(b,"Se ha eliminado un set inexistente");
    }

    @Test
    public void guardarSetTest(){
    Set set  = new Set();
    boolean b = false;
    String res = "";
    try {
        usuario.guardarSet(set);
        b = usuario.guardarSet(set);
    }catch (Exception ex){
        res = ex + "";
    }
    Assertions.assertTrue(res.contains("ya está"));
    }

    @Test
    public void guardarDadoTest(){
        Set set  = new Set();
        boolean b = false;
        Dado dado = new Dado();
        String res = "";
        try {
            usuario.guardarDado(set,dado);
            b = usuario.guardarDado(set,dado);
        }catch (Exception ex){
            res = ex + "";
        }
        Assertions.assertTrue(res.contains("ya está"));
    }
    @Test
    public void tirarDadoTest(){
        Set set  = new Set();
        boolean b = false;

        Dado dado = new Dado();
        String[] caras = {"1"};
        dado.setCaras(caras);
        String res = "";
        try {
            usuario.guardarSet(set);
            usuario.guardarDado(set,dado);
            res = usuario.tirarDado(set,dado);
        }catch (Exception ex){
            res = ex + "";
        }
        Assertions.assertTrue(res.contains("1"),"No se ha lanzado correctamente el dado");
    }

    @Test
    public void crearSetTest(){
        usuario.crearSet("hola");
        Assertions.assertEquals(usuario.getDados().size(),1,"no se ha creado el set");

        usuario.crearSet("hola");
        Assertions.assertEquals(usuario.getDados().size(),1,"se ha creado el set otra vez");

        usuario.crearSet("d&d");
        Assertions.assertEquals(usuario.getDados().size(),2,"se ha creado el set nuevo");

    }
    @Test
    public void crearDadoTest(){
        Set set = new Set();
        String[] caras = {"1","2","3","4"};
        usuario.crearDado(set,"d4",caras);
        Assertions.assertEquals(set.getDados().size(),1,"no se ha creado el dado");
        usuario.crearDado(set,"d4",caras);
        Assertions.assertEquals(set.getDados().size(),1,"se ha creado el dado otra vez");
        String[] caras2 = {"1","2","3","4","5"};
        usuario.crearDado(set,"d5",caras2);
        Assertions.assertEquals(set.getDados().size(),2,"se ha creado el dado nuevo");

    }



}
