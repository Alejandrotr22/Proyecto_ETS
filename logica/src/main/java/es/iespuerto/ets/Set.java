package es.iespuerto.ets;

import java.util.HashMap;

/**
 * Una compilacion de dados
 */
public class Set {

    private String nombre;
    private String id;
    private HashMap<String,Dado> dados;

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
