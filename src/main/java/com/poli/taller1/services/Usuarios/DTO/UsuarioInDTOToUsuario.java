package com.poli.taller1.services.Usuarios.DTO;

import com.poli.taller1.persistence.entity.Fila;
import com.poli.taller1.persistence.entity.Tarea;
import com.poli.taller1.persistence.entity.Usuario;
import com.poli.taller1.services.Fila.DTO.FilaInDTO;
import com.poli.taller1.services.IMapper;
import com.poli.taller1.services.Tarea.DTO.TareaInDTOToTarea;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Component
public class UsuarioInDTOToUsuario implements IMapper<UsuarioInDTO, Usuario> {

    @Override
    public Usuario map(UsuarioInDTO in) {
        Usuario usuario = new Usuario();

        usuario.setFilas(this.FilaInDTOToFila(in.getFilas()));
        usuario.setActivo(in.getActivo());
        usuario.setPerfil(in.getPerfil());
        usuario.setDependencia(in.getDependencia());
        usuario.setFecha_nacimiento(in.getFecha_nacimiento());
        return usuario;

    }

    private List<Fila> FilaInDTOToFila(List<FilaInDTO> in) {
        List<Fila> filaLista = new ArrayList<>();
        Fila fila = new Fila();
        for (FilaInDTO cd_fila : in) {
            fila.setTarea(new TareaInDTOToTarea().map(cd_fila.getTarea()));
            fila.setDuracion(cd_fila.getDuracion());
            filaLista.add(fila);
        }
        return filaLista;
    }
}
