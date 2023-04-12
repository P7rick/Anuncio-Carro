package com.primeirotrampodev.Anuncio.Carro.Service;

import com.primeirotrampodev.Anuncio.Carro.Entidade.Usuario;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    public Usuario usuario(Integer idUsuario, String nomeUsuario, String telefoneUsuario){

        Usuario usuario = new Usuario();

        usuario.setId(idUsuario);
        usuario.setNome(nomeUsuario);
        usuario.setTelefone(telefoneUsuario);

        return usuario;
    }
}
