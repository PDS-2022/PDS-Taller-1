package com.poli.taller1.services.Tarea.DTO;

import com.poli.taller1.persistence.entity.Tarea;
import com.poli.taller1.services.IMapper;

public class TareaInDTOToTarea implements IMapper<TareaInDTO, Tarea> {

    @Override
    public Tarea map(TareaInDTO in) {
        Tarea tarea = new Tarea();

        tarea.setId(in.getId());
        tarea.setNombre(in.getNombre());

        return tarea;
    }
}
