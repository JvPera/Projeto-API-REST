package com.jvpera.tarefas_api.repository;

import com.jvpera.tarefas_api.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
    // Só de estender o JpaRepository, você já ganha métodos como save(), findAll(), findById() e deleteById() de graça!
}
