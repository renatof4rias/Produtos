package com.API.LOL.API4.LOL.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.API.LOL.API4.LOL.entities.Categoria;
import com.API.LOL.API4.LOL.repositories.CategoriaRepository;

@RestController
@RequestMapping(value = "/categoria")
public class CategoriaResource {

	 
	@Autowired
	private CategoriaRepository categoriaRepository;

	@GetMapping
	public ResponseEntity<List<Categoria> >findAll(){
		List <Categoria> list = categoriaRepository.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value ="/{id}")
	public ResponseEntity<Categoria> findById(@PathVariable Long id){
		Categoria cat = categoriaRepository.findById(id);
		return ResponseEntity.ok().body(cat);
	}
	
}
 
