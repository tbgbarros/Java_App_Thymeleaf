package com.fatecararas.fatechelper.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fatecararas.fatechelper.model.entities.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer>{
    
}
