package com.poli.taller1.controller.Usuario;

import com.poli.taller1.persistence.entity.Usuario;
import com.poli.taller1.services.Usuarios.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
@RequiredArgsConstructor
public class UsuarioController {
    private final UsuarioService usuarioService;

    @PostMapping
    public Usuario crear_usuario(@RequestBody Usuario usuario) {
        return usuarioService.crear_usuario(usuario);
    }

    @GetMapping
    public List<Usuario> obtenerUsuarios(){
        return usuarioService.obtener_usuario();
    }

}
