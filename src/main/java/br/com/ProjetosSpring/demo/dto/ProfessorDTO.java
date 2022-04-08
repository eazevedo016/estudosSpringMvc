package br.com.ProjetosSpring.demo.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.com.ProjetosSpring.demo.models.StatusProfessor;

public class ProfessorDTO {

    @NotBlank
    @NotNull
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
