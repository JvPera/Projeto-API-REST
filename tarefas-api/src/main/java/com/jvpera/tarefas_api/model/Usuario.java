package com.jvpera.tarefas_api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity 
public class Usuario {
    
    @Id // Define que este campo é a Chave Primária (Primary Key)
    @GeneratedValue(strategy = GenerationType.IDENTITY) // O MySQL vai gerar o ID automaticamente (AUTO_INCREMENT)
    private Long id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String senha;

    public Usuario() {}

    // Construtor com parâmetros
    public Usuario(Long id, String email, String senha) {
        this.id = id;
        this.email= email;
        this.senha = senha;
    }

    //Getters
    public Long getId() { return id; }
    public String getEmail() { return email; }
    public String getSenha() { return senha; }

    //Setters
    public void setId(Long id) { this.id = id; }
    public void setEmail(String email) { this.email = email; }
    public void setSenha(String senha) { this.senha = senha; }
}

