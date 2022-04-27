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
}
