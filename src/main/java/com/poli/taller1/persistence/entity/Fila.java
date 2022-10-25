package com.poli.taller1.persistence.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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

    @OneToOne(mappedBy = "fila", fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    private Tarea tarea;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.EAGER)
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
