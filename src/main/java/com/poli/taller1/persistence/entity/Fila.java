package com.poli.taller1.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name = "filas")
public class Fila {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_fila")
    private Long id_fila;

    @Column(name = "duracion")
    private Integer duracion;

    @OneToOne(mappedBy = "fila", cascade = CascadeType.ALL)
    private Tarea tarea;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fila fila = (Fila) o;
        return id_fila.equals(fila.id_fila);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_fila);
    }
}
