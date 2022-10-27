package com.poli.taller1.services.Fila.ABC;

import com.poli.taller1.persistence.entity.Fila;

import java.util.List;

public interface IFilaService {
    Fila crear_filas(Fila fila);
    List<Fila> obtener_filas();
}
