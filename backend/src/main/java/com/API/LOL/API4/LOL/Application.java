package com.API.LOL.API4.LOL;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.API.LOL.API4.LOL.entities.Categoria;
import com.API.LOL.API4.LOL.entities.Produto;
import com.API.LOL.API4.LOL.repositories.CategoriaRepository;
import com.API.LOL.API4.LOL.repositories.ProdutoRepository;

@SpringBootApplication
public class Application implements CommandLineRunner{

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(1L, "ELETRONICS");
		Categoria cat2 = new Categoria(2L, "BOOKS");		
		
		Produto p1 = new Produto(1L, "TV", 2200.00, cat1);
		Produto p2 = new Produto(2L, "DOMAIN DRIVEN DESING", 120.00, cat2);
		Produto p3 = new Produto(3L, "PS5", 2800.00, cat1);
		Produto p4 = new Produto(4L, "DOCKER", 100.00, cat2);

		cat1.getProdutos().addAll(Arrays.asList(p1, p3));
		cat2.getProdutos().addAll(Arrays.asList(p2, p4));
		
		categoriaRepository.save(cat1);
		categoriaRepository.save(cat2);
		
		produtoRepository.save(p1);
		produtoRepository.save(p2);
		produtoRepository.save(p3);
		produtoRepository.save(p4);
		
	}
}
