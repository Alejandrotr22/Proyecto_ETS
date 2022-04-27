package es.iespuerto.ets;

import java.util.HashMap;

/**
 * Un objeto que almacena la informacion de una persona, como los roles que tiene y sus sets de dados personalizados
 */
public class Usuario {

    private String nombre;
    private String id;
    private HashMap<String,Rol> roles;
    private HashMap<String,Set> dados;

    /**
     * Constructor con 4 parametros
     * @param nombre nombre del usuario
     * @param id id del usuario
     * @param roles roles del usuarios
     * @param dados sets de dados del usuario
     */
    public Usuario(String nombre, String id, HashMap<String, Rol> roles, HashMap<String, Set> dados) {
        this.nombre = nombre;
        this.id = id;
        this.roles = roles;
        this.dados = dados;
    }

    /**
     * Constructor por defecto
     */
    public Usuario() {
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

    public HashMap<String, Rol> getRoles() {
        return roles;
    }

    public void setRoles(HashMap<String, Rol> roles) {
        this.roles = roles;
    }

    public HashMap<String, Set> getDados() {
        return dados;
    }

    public void setDados(HashMap<String, Set> dados) {
        this.dados = dados;
    }

    /**
     * Se guarda el Rol en el usuario
     * @param rol a guardar
     */
    public void guardarRol(Rol rol){

    }

    /**
     * Se guarda el set de dados en el usuario
     * @param set a guardar
     */
    public void guardarSet(Set set){

    }

    /**
     * Se crea un set de dados que tambien se guarda
     */
    public void crearSet(){

    }

    /**
     * Se elimina el set de dados del usuario
     * @param set a eliminar
     */
    public void eliminarSet(Set set){

    }

    /**
     * Se crea un dado personalizado para guardarlo en el set
     * @param set donde se guarda el dado
     */
    public void crearDado(Set set){

    }

    /**
     * Se elimina el dado personalizado
     * @param set donde se elimina el dado
     */
    public void eliminarDado(Set set){

    }

    /**
     * Se guarda un dado en un set
     * @param set a guardar el dado
     */
    public void guardarDado(Set set){

    }

    /**
     * Se lanza un dado para obtener un resultado aleatorio
     * @param dado a lanzar
     */
    public String tirarDado(Dado dado){
        return "";
    }
}
