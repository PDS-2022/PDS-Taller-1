package com.poli.taller1.services.Tarea.ABC;

import com.poli.taller1.persistence.entity.Tarea;
import com.poli.taller1.services.Tarea.DTO.TareaInDTO;

import java.util.List;

public interface ITareaService {
    Tarea crear_tarea(TareaInDTO tareaInDTO);
    List<Tarea> obtener_tareas();
}
