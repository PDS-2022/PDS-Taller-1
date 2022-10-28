package com.poli.taller1.services.Fila.ABC;

import com.poli.taller1.persistence.entity.Fila;
import com.poli.taller1.persistence.entity.Usuario;

import java.util.List;

public interface IFilaService {
    Fila crear_filas(Fila fila);


    Fila editar_fila(Fila fila);

    void eliminar_fila(Fila fila);
    List<Fila> obtener_filas();
}
