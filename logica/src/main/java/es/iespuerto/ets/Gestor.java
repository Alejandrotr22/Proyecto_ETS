package es.iespuerto.ets;

import java.util.HashMap;
import java.util.Random;

public class Gestor {
    private HashMap<String,Usuario> usuarios;

    public Gestor(HashMap<String, Usuario> u) {
        usuarios = u;
    }

    public Gestor() {
        usuarios = new HashMap<>();
    }

    /**
     * Metodo para crear un Usuario vacio asignandole un id aleatorio y comprobando que no hayan mas de 1000 usuarios
     * @param nombre nombre del nuevo usuario
     * @return boolean para comprobar el estado(verdadero: se genera y aniade usuario, falso: no se genera el usuario)
     */
    public boolean crearUsuario(String nombre){
        boolean res = true;
        Random rnd = new Random();
        String id;
        do{
            id = rnd.nextInt(1000) + "";
        }while (usuarios.containsKey(id));
        if(usuarios.size() < 1000){
            HashMap<String,Set> dados = new HashMap<>();
            HashMap<String,Rol> roles = new HashMap<>();
            Usuario u = new Usuario(nombre,id,roles,dados);
            usuarios.put(id,u);
            res = true;
        }else{
            res = false;
        }
        return res;
    }

    public String eliminarUsuario(Usuario u){
        String res = "";
        if(usuarios.size()==0){
            res = "No hay usuarios creados";
        }else{
            if (!usuarios.containsValue(u)){
                res = "No existe este usuario";
            }else {
                usuarios.remove(u.getId(),u);
            }
        }
        return res;
    }

    public void elegirUsuario(){

    }

    public HashMap<String, Usuario> getUsuarios() {
        return usuarios;
    }
}
