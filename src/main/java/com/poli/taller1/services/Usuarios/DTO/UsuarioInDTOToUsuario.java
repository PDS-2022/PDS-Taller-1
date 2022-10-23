package com.poli.taller1.services.Usuarios.DTO;

import com.poli.taller1.persistence.entity.Fila;
import com.poli.taller1.persistence.entity.Usuario;
import com.poli.taller1.services.Fila.DTO.FilaInDTOToFila;
import com.poli.taller1.services.IMapper;

import java.sql.Date;
import java.util.List;

public class UsuarioInDTOToUsuario implements IMapper<UsuarioInDTO, Usuario> {

    @Override
    public Usuario map(UsuarioInDTO in) {
        Usuario usuario = new Usuario();
        List<Fila> fila = new FilaInDTOToFila().map(in.getFilas());

        usuario.setFilas(fila);
        usuario.setPerfil(in.getPerfil());
        usuario.setActivo(in.getActivo());
        usuario.setDependencia(in.getDependencia());
        usuario.setFecha_nacimiento((Date) in.getFecha_nacimiento());
        return usuario;

    }
}
