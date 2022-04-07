package br.com.ProjetosSpring.demo.dto;

import br.com.ProjetosSpring.demo.models.StatusProfessor;

public class ProfessorDTO {
    private String nome;
    private StatusProfessor statusProfessor;


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public StatusProfessor getStatusProfessor() {
        return statusProfessor;
    }
    public void setStatusProfessor(StatusProfessor statusProfessor) {
        this.statusProfessor = statusProfessor;
    }


    
}
