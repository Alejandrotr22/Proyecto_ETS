package es.iespuerto.ets;

import java.util.HashMap;

/**
 * Un manual consiste en informacion sobre un rol especifico
 */
public class Manual {
    private String nombre;
    private String id;

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
}
