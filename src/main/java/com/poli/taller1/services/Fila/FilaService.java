package com.poli.taller1.services.Fila;

import com.poli.taller1.persistence.entity.Fila;
import com.poli.taller1.persistence.repository.FilaRepository;
import com.poli.taller1.services.Fila.ABC.IFilaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FilaService implements IFilaService {
    private final FilaRepository filaRepository;

    @Override
    public Fila crear_filas(Fila fila) {
        return this.filaRepository.save(fila);
    }

    @Override
    public List<Fila> obtener_filas() {
        return this.filaRepository.findAll();
    }
}
