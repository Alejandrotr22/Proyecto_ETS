package es.iespuerto.ets;

import java.util.HashMap;

/**
 * Un dado contiene un numero de caras y en ellas unos valores deterninados por el usuario
 */
public class Dado {
    private String nombre;
    private String id;
    private int nCaras;
    private String[] caras;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getnCaras() {
        return nCaras;
    }

    public void setnCaras(int nCaras) {
        this.nCaras = nCaras;
    }

    public String[] getCaras() {
        return caras;
    }

    public void setCaras(String[] caras) {
        this.caras = caras;
    }
}
