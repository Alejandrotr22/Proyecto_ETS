package es.iespuerto.ets;

import java.util.HashMap;
import java.util.Random;

/**
 * Una compilacion de dados
 */
public class Set {

    private String nombre;
    private String id;
    private HashMap<String,Dado> dados;

    /**
     * Constructor con 3 parametros
     * @param nombre nombre del set de dados
     * @param id id del set de dados
     * @param dados dados asignados
     */
    public Set(String nombre, String id, HashMap<String, Dado> dados) {
        this.nombre = nombre;
        this.id = id;
        this.dados = dados;
    }
    /**
     * Constructor por defecto
     */
    public Set() {
    }
    public Set(String nombre) {
        Random rnd = new Random();
        this.nombre = nombre;
        this.id = rnd.nextInt(100) + "";
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

    public HashMap<String, Dado> getDados() {
        return dados;
    }

    public void setDados(HashMap<String, Dado> dados) {
        this.dados = dados;
    }


}
