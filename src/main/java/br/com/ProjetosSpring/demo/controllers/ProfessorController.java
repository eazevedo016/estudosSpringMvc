package br.com.ProjetosSpring.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


import br.com.ProjetosSpring.demo.models.Professor;
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
    public String nnew() {
        return "professores/new";

    }

}
