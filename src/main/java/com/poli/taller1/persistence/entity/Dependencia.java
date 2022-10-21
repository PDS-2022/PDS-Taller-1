package com.poli.taller1.persistence.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

public class Dependencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id_perfil")
    private Integer id_perfil;

    @Column(name = "nombre")
    private String nombre;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dependencia that = (Dependencia) o;
        return id_perfil.equals(that.id_perfil);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_perfil);
    }
}