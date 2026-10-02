package chavez.alma.NebulaMusic.service;

import chavez.alma.NebulaMusic.model.Usuario;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class UsuarioService {
    private final Map<String, Usuario> usuarios = new ConcurrentHashMap<>();

    public UsuarioService(){

    }

    public void registrar(Usuario usuario){
        usuarios.put(usuario.getEmail(), usuario);
    }

    public boolean existeCorreo(String email){
        return usuarios.containsKey(email);
    }

    public boolean autenticar(String email, String password){
        Usuario usuario = usuarios.get(email);
        return usuario != null && usuario.getPassword().equals(password);
    }
}
