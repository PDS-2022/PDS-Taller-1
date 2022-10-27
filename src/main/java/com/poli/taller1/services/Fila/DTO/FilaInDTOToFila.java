package com.poli.taller1.services.Fila.DTO;

import com.poli.taller1.persistence.entity.Fila;
import com.poli.taller1.services.IMapper;
import com.poli.taller1.services.Tarea.DTO.TareaInDTOToTarea;
import com.poli.taller1.services.Usuarios.DTO.UsuarioInDTOToUsuario;
import org.springframework.stereotype.Component;

@Component
public class FilaInDTOToFila implements IMapper<FilaInDTO, Fila> {
    @Override
    public Fila map(FilaInDTO in) {
        Fila fila = new Fila();
        fila.setDuracion(in.getDuracion());
        fila.setTarea(new TareaInDTOToTarea().map(in.getTarea()));
        fila.setUsuario(new UsuarioInDTOToUsuario().map(in.getUsuario()));
        return fila;
    }
}