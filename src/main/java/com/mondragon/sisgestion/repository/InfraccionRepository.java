package com.mondragon.sisgestion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mondragon.sisgestion.entity.Infraccion;

@Repository
public interface InfraccionRepository extends JpaRepository<Infraccion, Integer>{
	public Infraccion findByDni(String dni);
}
