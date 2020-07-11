package com.ricardocosta.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ricardocosta.cursomc.domain.Categoria;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource 
{

	@RequestMapping(method=RequestMethod.GET)
	public List<Categoria> listar()
	{
		Categoria catOne = new Categoria(1, "Informática");
		Categoria catTwo = new Categoria(2, "Informática");
		
		List<Categoria> lista = new ArrayList<>();
		lista.add(catOne);
		lista.add(catTwo);
		
		return lista;
	}
	
}
