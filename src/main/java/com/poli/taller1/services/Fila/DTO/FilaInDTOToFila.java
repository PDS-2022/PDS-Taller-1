package com.poli.taller1.services.Fila.DTO;

import com.poli.taller1.persistence.entity.Fila;
import com.poli.taller1.persistence.entity.Tarea;
import com.poli.taller1.services.IMapper;
import com.poli.taller1.services.Tarea.DTO.TareaInDTOToTarea;
import org.springframework.stereotype.Component;

@Component
public class FilaInDTOToFila implements IMapper<FilaInDTO, Fila> {
    @Override
    public Fila map(FilaInDTO in) {
        Fila fila = new Fila();
        fila.setDuracion(in.getDuracion());
        fila.setTarea(new TareaInDTOToTarea().map(in.getTarea()));
        return fila;
    }
}