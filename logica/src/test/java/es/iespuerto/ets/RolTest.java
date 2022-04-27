package es.iespuerto.ets;

import org.junit.Assert;
import org.junit.Test;

public class RolTest {
    Rol rol;

    @Test
    public void constructoresTest(){
        rol = new Rol();
        Assert.assertNotNull("No se ha generado el objeto Rol",rol);
        Set set = new Set();
        rol = new Rol("D&D","M002",set);
        Assert.assertNotNull("No se ha generado el objeto Rol con parametros",rol);
    }
}
