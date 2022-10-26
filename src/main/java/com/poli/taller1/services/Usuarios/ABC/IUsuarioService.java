package com.poli.taller1.services.Usuarios.ABC;

import com.poli.taller1.persistence.entity.Usuario;
import com.poli.taller1.services.Usuarios.DTO.UsuarioInDTO;

import java.util.List;

public interface IUsuarioService {
    Usuario crear_usuario(UsuarioInDTO usuarioInDTO);
    List<Usuario> obtener_usuario();
}
