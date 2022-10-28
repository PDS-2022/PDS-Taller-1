package com.poli.taller1.services.Usuarios;

import com.poli.taller1.exepciones.ExeptionUsuario;
import com.poli.taller1.persistence.entity.Usuario;
import com.poli.taller1.persistence.repository.UsuarioRepository;
import com.poli.taller1.services.Usuarios.ABC.IUsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor //Se utiliza lombok para la inyeccion de dependencias
public class UsuarioService implements IUsuarioService {
    private final UsuarioRepository usuarioRepository; // Se tiene el bean

    @Override
    public Usuario crear_usuario(Usuario usuario) {
        if (validar_mayor_edad(usuario.getFecha_nacimiento())) {
            return usuario;
        }
        if (usuario.getActivo()) {
            return usuario;
        }
        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario editar_usuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public void eliminar_usuario(Usuario usuario) {
        usuarioRepository.deleteById(usuario.getId());
    }

    @Override
    public List<Usuario> obtener_usuario() {
        return usuarioRepository.findAll();
    }


    public Boolean validar_mayor_edad(Date fecha_cumpleaños) {
        return !((Date.from(Instant.now()).getYear() - fecha_cumpleaños.getYear()) >= 18);
    }

}
