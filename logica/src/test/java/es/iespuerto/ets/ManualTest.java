package es.iespuerto.ets;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ManualTest {

    Manual manual;

    @Test
    public void constructoresTest(){
        manual = new Manual();
        Assertions.assertNotNull(manual,"No se ha generado el objeto Manual");
        manual = new Manual("Maual del jugador D&D","M002");
        Assertions.assertNotNull(manual,"No se ha generado el objeto Manual con parametros");
    }
}
