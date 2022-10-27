package com.poli.taller1.services.Tarea;

import com.poli.taller1.persistence.entity.Tarea;
import com.poli.taller1.persistence.repository.TareaRepository;
import com.poli.taller1.services.Tarea.ABC.ITareaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TareaService implements ITareaService {
    private final TareaRepository tareaRepository; // Se tiene el bean

    @Override
    public Tarea crear_tarea(Tarea tarea) {
        return tareaRepository.save(tarea);
    }

    @Override
    public List<Tarea> obtener_tareas() {
        return tareaRepository.findAll();
    }
}
