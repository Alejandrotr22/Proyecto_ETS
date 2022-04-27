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

    /**
     * Constructor con 4 parametros
     * @param nombre nombre del dado
     * @param id id del dado
     * @param nCaras numero de caras del dado
     * @param caras Array de las caras del dado
     */
    public Dado(String nombre, String id, int nCaras, String[] caras) {
        this.nombre = nombre;
        this.id = id;
        this.nCaras = nCaras;
        this.caras = caras;
    }
    /**
     * Constructor por defecto
     */
    public Dado() {
    }

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
