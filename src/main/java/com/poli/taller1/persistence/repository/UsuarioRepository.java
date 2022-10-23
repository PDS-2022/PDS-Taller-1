package com.poli.taller1.persistence.repository;

import com.poli.taller1.persistence.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
 * Cuando se implementa la herencia JPA se tienen todos
 * los metodos del ORM Hibernate
 * */
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
