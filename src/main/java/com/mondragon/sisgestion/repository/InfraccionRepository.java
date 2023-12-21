package com.mondragon.sisgestion.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mondragon.sisgestion.entity.Infracciones;


@Repository
public interface InfraccionRepository extends JpaRepository<Infracciones, Integer>{
	public Infracciones findByDni(String dni);
	public List<Infracciones> findByPlacaContaining(String placa);
	public Infracciones findByPlaca(String placa);
}
