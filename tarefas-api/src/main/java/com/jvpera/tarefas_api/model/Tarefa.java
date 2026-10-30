package com.jvpera.tarefas_api.model; 

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // Diz ao Spring que esta classe vai virar uma tabela no banco de dados
public class Tarefa {

    @Id // Define que este campo é a Chave Primária (Primary Key)
    @GeneratedValue(strategy = GenerationType.IDENTITY) // O MySQL vai gerar o ID automaticamente (AUTO_INCREMENT)
    private Long id;

    private String titulo;
    private boolean concluida;

    public Tarefa() {}

    // Construtor com parâmetros
    public Tarefa(Long id, String titulo, boolean concluida) {
        this.id = id;
        this.titulo = titulo;
        this.concluida = concluida;
    }

    // Getters
    public Long getId() { return id; }
    public String getTitulo() { return titulo; }
    public boolean getConcluida() { return concluida; }

    // Setters
    public void setId(Long id) { this.id = id; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setConcluida(boolean concluida) { this.concluida = concluida; }
}