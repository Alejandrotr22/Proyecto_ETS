package es.iespuerto.ets;

import org.junit.Assert;
import org.junit.Test;

public class ManualTest {

    Manual manual;

    @Test
    public void constructoresTest(){
        manual = new Manual();
        Assert.assertNotNull("No se ha generado el objeto Manual",manual);
        manual = new Manual("Maual del jugador D&D","M002");
        Assert.assertNotNull("No se ha generado el objeto Manual con parametros",manual);
    }
}
