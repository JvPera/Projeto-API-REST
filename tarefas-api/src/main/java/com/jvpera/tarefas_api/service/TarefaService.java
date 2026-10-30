package com.jvpera.tarefas_api.service;

import com.jvpera.tarefas_api.model.Tarefa;
import com.jvpera.tarefas_api.repository.TarefaRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TarefaService {
    private final TarefaRepository repository;

    public TarefaService(TarefaRepository repository) {
        this.repository = repository;
    }

    public List<Tarefa> listarTodas() {
        return repository.findAll();
    }

    public Tarefa salvar(Tarefa tarefa) {
        // Futuramente, regras como "validar título" entrarão aqui antes de salvar
        return repository.save(tarefa);
    }

    public Tarefa atualizar(Long id, Tarefa tarefaAtualizada) {
        Optional<Tarefa> existente = repository.findById(id);
        if (existente.isPresent()) {
            Tarefa t = existente.get();
            t.setTitulo(tarefaAtualizada.getTitulo());
            t.setConcluida(tarefaAtualizada.getConcluida());
            return repository.save(t);
        }
        return null;
    }

    public boolean deletar(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }
}