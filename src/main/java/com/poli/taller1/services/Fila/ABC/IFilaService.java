package com.poli.taller1.services.Fila.ABC;

import com.poli.taller1.persistence.entity.Fila;
import com.poli.taller1.services.Fila.DTO.FilaInDTO;

import java.util.List;

public interface IFilaService {
    Fila crear_filas(FilaInDTO filaInDTO);
    List<Fila> obtener_filas();
}
