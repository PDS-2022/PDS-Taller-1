package com.poli.taller1.services.Usuarios.ABC;

import com.poli.taller1.persistence.entity.Usuario;
import com.poli.taller1.services.Usuarios.DTO.UsuarioInDTO;

import java.util.List;

public interface IUsuarioService {
    Usuario crearUsuario(UsuarioInDTO usuarioInDTO);
    List<Usuario> obtenerUsuarios();
}
