package com.poli.taller1.services.Tarea.DTO;

import com.poli.taller1.persistence.entity.Tarea;
import com.poli.taller1.services.IMapper;
import org.springframework.stereotype.Component;

@Component
public class TareaInDTOToTarea implements IMapper<TareaInDTO, Tarea> {

    @Override
    public Tarea map(TareaInDTO in) {
        Tarea tarea = new Tarea();
        tarea.setNombre(in.getNombre());
        return tarea;
    }
}
