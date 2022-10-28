package com.poli.taller1.services.Tarea;

import com.poli.taller1.persistence.entity.Tarea;
import com.poli.taller1.persistence.entity.Usuario;
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

    @Override
    public Tarea editar_tarea(Tarea usuario) {
        return tareaRepository.save(usuario);
    }

    @Override
    public void eliminar_tarea(Tarea usuario) {
        tareaRepository.deleteById(usuario.getId());
    }
}
