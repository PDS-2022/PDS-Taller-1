package com.poli.taller1.services.Tarea.ABC;

import com.poli.taller1.persistence.entity.Tarea;
import com.poli.taller1.persistence.entity.Usuario;

import java.util.List;

public interface ITareaService {
    Tarea crear_tarea(Tarea tarea);
    List<Tarea> obtener_tareas();
    Tarea editar_tarea(Tarea tarea);

    void eliminar_tarea(Tarea tarea);
}
