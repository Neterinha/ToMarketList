package com.projeto.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.model.Categoria;
import com.projeto.model.Lista;
import com.projeto.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	Iterable<Produto> findByLista(Lista lista);
	Iterable<Produto> findByCategoria(Categoria categoria);
	Optional<Produto> findById(Long id);
	
}
