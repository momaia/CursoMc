package com.maiamateus.demoproject.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.maiamateus.demoproject.domain.Categoria;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {

	@RequestMapping(method=RequestMethod.GET)
	public List<Categoria> listar() {
		
		Categoria categoria1 = new Categoria(1, "Informática");
		Categoria categoria2 = new Categoria(2, "Esritório");
		Categoria categoria3 = new Categoria(3, "Jardim");
		Categoria categoria4 = new Categoria(4, "Eletronicos");
		
		List<Categoria> lista = new ArrayList<>();
		lista.add(categoria1);
		lista.add(categoria2);
		lista.add(categoria3);
		lista.add(categoria4);
		
		return lista;
	}
}
