package es.iespuerto.ets;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class SetTest {

    Set set;

    @Test
    public void constructoresTest(){
        set = new Set();
        Assert.assertNotNull("No se ha generado el objeto Set",set);
        HashMap<String,Dado> dados = new HashMap<>();
        set = new Set("dados D&D","S002",dados);
        Assert.assertNotNull("No se ha generado el objeto Set con parametros",set);
    }

}
