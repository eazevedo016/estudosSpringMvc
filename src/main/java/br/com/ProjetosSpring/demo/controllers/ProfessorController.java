package br.com.ProjetosSpring.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.ProjetosSpring.demo.dto.ProfessorDTO;
import br.com.ProjetosSpring.demo.models.Professor;
import br.com.ProjetosSpring.demo.models.StatusProfessor;
import br.com.ProjetosSpring.demo.repositories.ProfessorRepository;

@Controller
public class ProfessorController {
    @Autowired
    private ProfessorRepository professorRepository;
    

    @GetMapping("/professores")
    public ModelAndView index() {
        List<Professor> professores = this.professorRepository.findAll();

        ModelAndView mv = new ModelAndView("professores/index");
        mv.addObject("professores", professores);

        return mv;
    }



    @GetMapping("/professor/new")
    public ModelAndView nnew() {

        ModelAndView mv = new ModelAndView("professor/new");
        mv.addObject("statusProfessor", StatusProfessor.values());

        return mv;

    } 

    @PostMapping("/professores")
    public String create(ProfessorDTO professorDTO) {
        Professor professor = requisicao.toProfessor();
        this.professorRepository.save(professor);
        

        return "redirect:/professores";
    }
}
