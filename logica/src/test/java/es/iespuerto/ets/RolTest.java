package es.iespuerto.ets;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class RolTest {
    Rol rol;

    @Test
    public void constructoresTest(){
        rol = new Rol();
        Assertions.assertNotNull(rol,"No se ha generado el objeto Rol");
        Set set = new Set();
        rol = new Rol("D&D","M002",set);
        Assertions.assertNotNull(rol,"No se ha generado el objeto Rol con parametros");
    }
}
