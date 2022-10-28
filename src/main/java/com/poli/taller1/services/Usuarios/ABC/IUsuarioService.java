package com.poli.taller1.services.Usuarios.ABC;

import com.poli.taller1.persistence.entity.Usuario;

import java.util.List;

public interface IUsuarioService {
    Usuario crear_usuario(Usuario usuario);

    Usuario editar_usuario(Usuario usuario);

    void eliminar_usuario(Usuario usuario);

    List<Usuario> obtener_usuario();
}
