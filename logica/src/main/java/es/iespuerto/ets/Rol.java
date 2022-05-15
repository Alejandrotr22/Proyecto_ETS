package es.iespuerto.ets;

import java.util.HashMap;

/**
 * Un conjunto de manuales y un set de dados para jugar
 */
public class Rol {
    private String nombre;
    private String id;
    private Set dados;
    private HashMap<String,Manual> manuales;

    /**
     * Constructor con 3 paramatros
     * @param nombre nombre del rol
     * @param id id del rol
     * @param dados dados del rol
     */
    public Rol(String nombre, String id, Set dados) {
        this.nombre = nombre;
        this.id = id;
        this.dados = dados;
    }
    /**
     * Constructor por defecto
     */
    public Rol() {

    }
/*
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

 */

    public String getId() {
        return id;
    }
/*
    public void setId(String id) {
        this.id = id;
    }

    public Set getDados() {
        return dados;
    }

    public void setDados(Set dados) {
        this.dados = dados;
    }

    public HashMap<String, Manual> getManuales() {
        return manuales;
    }

    public void setManuales(HashMap<String, Manual> manuales) {
        this.manuales = manuales;
    }
*/
}
