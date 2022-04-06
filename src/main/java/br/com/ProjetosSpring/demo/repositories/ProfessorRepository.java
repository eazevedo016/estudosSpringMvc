package br.com.ProjetosSpring.demo.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ProjetosSpring.demo.models.Professor;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long>{
    
}
