package com.maiamateus.demoproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maiamateus.demoproject.domain.Categoria;
import com.maiamateus.demoproject.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Categoria obj = repo.findById(id).orElse(null);
		return obj;
	}
}
