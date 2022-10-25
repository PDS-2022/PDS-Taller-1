package com.poli.taller1.services.Tarea;

import com.poli.taller1.persistence.entity.Tarea;
import com.poli.taller1.persistence.repository.TareaRepository;
import com.poli.taller1.services.Tarea.ABC.ITareaService;
import com.poli.taller1.services.Tarea.DTO.TareaInDTO;
import com.poli.taller1.services.Tarea.DTO.TareaInDTOToTarea;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TareaService implements ITareaService {
    private final TareaRepository tareaRepository; // Se tiene el bean
    private final TareaInDTOToTarea tareaInDTOToTarea;

    @Override
    public Tarea crear_tarea(TareaInDTO tareaInDTO) {
        Tarea tarea = tareaInDTOToTarea.map(tareaInDTO);
        return tareaRepository.save(tarea);
    }

    @Override
    public List<Tarea> obtener_tareas() {
        return tareaRepository.findAll();
    }
}
