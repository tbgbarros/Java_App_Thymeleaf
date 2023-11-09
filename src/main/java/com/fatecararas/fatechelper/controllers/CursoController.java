package com.fatecararas.fatechelper.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.expression.Lists;

import com.fatecararas.fatechelper.model.entities.Curso;
import com.fatecararas.fatechelper.model.services.CursoService;

@Controller
@RequestMapping("/curso")
public class CursoController {

    @Autowired
    private CursoService service;

    @GetMapping("/novo")
    public String criar() {
        System.out.println("Passou pelo controller");
        return "adicionar";
    }
    
    @GetMapping("/listar")
    public String listar() {
        return "listar";
    
    }

    @ModelAttribute("cursos")
    public List<Curso> getCursos()  {
        return service.listar();
    }
}
