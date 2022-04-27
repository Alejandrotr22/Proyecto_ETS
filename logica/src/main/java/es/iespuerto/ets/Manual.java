package es.iespuerto.ets;

import java.util.HashMap;

/**
 * Un manual consiste en informacion sobre un rol especifico
 */
public class Manual {
    private String nombre;
    private String id;

    /**
     * Constructor con 2 parametros
     * @param nombre nombre del manual
     * @param id id del manual
     */
    public Manual(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }
    /**
     * Constructor por defecto
     */
    public Manual() {
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
}
