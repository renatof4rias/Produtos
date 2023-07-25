package com.API.LOL.API4.LOL.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.API.LOL.API4.LOL.entities.Produto;
import com.API.LOL.API4.LOL.repositories.ProdutoRepository;

@RestController
@RequestMapping(value = "/produto")
public class ProdutoResource {

	 
	@Autowired
	private ProdutoRepository CategoriaRepository;

	@GetMapping
	public ResponseEntity<List<Produto>>findAll(){
		List <Produto> list = CategoriaRepository.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value ="/{id}")
	public ResponseEntity<Produto> findById(@PathVariable Long id){
		Produto cat = CategoriaRepository.findById(id);
		return ResponseEntity.ok().body(cat);
	}
	
}
  
