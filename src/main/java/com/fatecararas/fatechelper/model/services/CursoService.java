package com.fatecararas.fatechelper.model.services;

import org.springframework.stereotype.Service;

import com.fatecararas.fatechelper.model.entities.Curso;
import com.fatecararas.fatechelper.model.repositories.CursoRepository;

import java.util.List;
import java.util.Optional;
import java.util.Collections;

@Service
public class CursoService {
    //crud basico
    private final CursoRepository repository;
    
    public CursoService(CursoRepository repository) {
        this.repository = repository;
    }

    public Curso criar(Curso pCurso){
        return repository.save(pCurso);
    }

    public Curso buscarPorId(Integer pId){
        Optional<Curso> optional = repository.findById(pId);

        if(!optional.isPresent()) throw new RuntimeException("Curso não encontrado");

        return optional.get();        
    
    }

    public void excluir(Integer id){
        repository.deleteById(id);        
        if(repository.findById(id).isPresent()) throw new RuntimeException("Curso não encontrado");        
        else System.out.println("Curso excluido com sucesso");         
        
    }

    public Curso atualizar(Curso pCurso){
        Integer id = pCurso.getId();
        Curso curso = buscarPorId(id);
        curso.setNome(pCurso.getNome());
        curso.setDescricao(pCurso.getDescricao());
        return repository.save(curso);
    }

    public List<Curso> listar(){
        return repository.findAll();
    }
}
