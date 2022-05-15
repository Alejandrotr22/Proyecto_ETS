package es.iespuerto.ets;



import java.util.HashMap;
import java.util.Random;

public class Gestor {
    private HashMap<String,Usuario> usuarios;
    private Usuario usuario;

    public Gestor(HashMap<String, Usuario> u) {
        usuarios = u;
    }

    public Gestor() {
        usuarios = new HashMap<>();
    }

    public Usuario getUsuario() {
        return usuario;
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

        if(usuarios.size() < 10){
            do{
                id = rnd.nextInt(10) + "";
            }while (usuarios.containsKey(id));
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
    public boolean crearUsuario(Usuario usuario){
        boolean res = true;
        if (!usuarios.containsValue(usuario)){
            usuarios.put(usuario.getId(),usuario);
            res = true;
        }else {
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
                res = "Se ha eliminado el usuario";
            }
        }
        return res;
    }

    public boolean elegirUsuario(Usuario u) throws Exception {
        boolean res = true;
        if (usuarios.containsValue(u)){
            usuario = u;
        }else{
            throw new Exception("No existe el usuario seleccionado");
        }

        return res;
    }

    public HashMap<String, Usuario> getUsuarios() {
        return usuarios;
    }
}
