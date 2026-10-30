package com.jvpera.tarefas_api.repository;

import com.jvpera.tarefas_api.model.Tarefa;
import com.jvpera.tarefas_api.model.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Tarefa, Long> {
    // Só de estender o JpaRepository, você já ganha métodos como save(), findAll(), findById() e deleteById() de graça!

    // O Spring Data JPA entende isso e cria o SQL: SELECT * FROM usuario WHERE email = ?
    Optional<Usuario> findByEmail(String email);
}
