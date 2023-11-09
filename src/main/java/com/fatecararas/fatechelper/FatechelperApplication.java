package com.fatecararas.fatechelper;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fatecararas.fatechelper.model.entities.Curso;
import com.fatecararas.fatechelper.model.repositories.CursoRepository;

@SpringBootApplication
public class FatechelperApplication  {

	@Autowired
	private CursoRepository repository;


	public static void main(String[] args) {
		SpringApplication.run(FatechelperApplication.class, args);
	}


}
