package es.iespuerto.ets;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DadoTest {

    Dado dado;
    @Test
    public void constructoresTest(){
        dado = new Dado();
        Assertions.assertNotNull(dado, "No se ha generado el objeto dado");
        String[] caras = new String[]{"1","2","3","4","5"};
        dado = new Dado("d5","2232",caras.length,caras);
        Assertions.assertNotNull(dado,"No se ha generado el objeto dadp con parametros");
    }

}
