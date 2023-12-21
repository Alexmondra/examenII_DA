package com.mondragon.sisgestion.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mondragon.sisgestion.entity.Infracciones;

@Service
public interface InfraccionService {
	public List<Infracciones> findAll();
	public Infracciones findById(int id);
	public Infracciones findByPlaca(String placa);
	public Infracciones create(Infracciones obj);
	public Infracciones update(Infracciones obj);
	public int delete(int id);
}
