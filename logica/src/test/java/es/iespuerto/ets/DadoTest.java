package es.iespuerto.ets;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DadoTest {

    Dado dado;
    @Test
    public void constructoresTest(){
        dado = new Dado();
        Assert.assertNotNull("No se ha generado el objeto dado",dado);
        String[] caras = new String[]{"1","2","3","4","5"};
        dado = new Dado("d5","2232",caras.length,caras);
        Assert.assertNotNull("No se ha generado el objeto dadp con parametros",dado);
    }

}
