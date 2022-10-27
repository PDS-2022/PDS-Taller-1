package com.poli.taller1.services.Usuarios;

import com.poli.taller1.persistence.entity.Usuario;
import com.poli.taller1.persistence.repository.UsuarioRepository;
import com.poli.taller1.services.Usuarios.ABC.IUsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor //Se utiliza lombok para la inyeccion de dependencias
public class UsuarioService implements IUsuarioService {
    private final UsuarioRepository usuarioRepository; // Se tiene el bean

    @Override
    public Usuario crear_usuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public List<Usuario> obtener_usuario() {
        return usuarioRepository.findAll();
    }

    public String calcular_edad(Date fecha_cumpleaños) {
        //TODO:: Calcular la edad del usuario
        return "";
    }

    public Boolean calcular_rango(Integer duracion) {
        //TODO:: Calcular que la duración este entre 1-60
        return true;
    }
}
