package com.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.model.Lista;

@Repository
public interface ListaRepository extends JpaRepository<Lista, Long>{
	
	

}
