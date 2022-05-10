package es.iespuerto.ets;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class SetTest {

    Set set;

    @Test
    public void constructoresTest(){
        set = new Set();
        Assertions.assertNotNull(set,"No se ha generado el objeto Set");
        HashMap<String,Dado> dados = new HashMap<>();
        set = new Set("dados D&D","S002",dados);
        Assertions.assertNotNull(set,"No se ha generado el objeto Set con parametros");
    }

}
