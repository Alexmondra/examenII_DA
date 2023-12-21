package com.mondragon.sisgestion.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mondragon.sisgestion.entity.Infracciones;
import com.mondragon.sisgestion.repository.InfraccionRepository;
import com.mondragon.sisgestion.service.InfraccionService;


import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class InfraccionServiceImp implements InfraccionService {

	@Autowired
	private InfraccionRepository repository;

	@Override
	@Transactional(readOnly = true)
	public List<Infracciones> findAll() {
		try {
			return repository.findAll();
		} catch (Exception e) {
			//log.error(e.getMessage());
			throw e;
		}
	}

	@Override
	@Transactional(readOnly = true)
	public Infracciones findById(int id) {
		try {
			return repository.findById(id).orElse(null);
		} catch (Exception e) {
			//log.error(e.getMessage());
			throw e;
		}
	}
	

	@Override
	@Transactional(readOnly = true)
	public Infracciones findByPlaca(String placa) {
		try {
			return repository.findByPlaca(placa);
		} catch (Exception e) {
			//log.error(e.getMessage());
			throw e;
		}
	}

	@Override
	@Transactional
	public Infracciones create(Infracciones obj) {
		try {
			return repository.save(obj);
		} catch (Exception e) {
			//log.error(e.getMessage());
			throw e;
		}
	}

	@Override
	public Infracciones update(Infracciones obj) {
		try {
			Infracciones infra=findById(obj.getId());
			infra.setDescripcion(obj.getDescripcion());
			
			return repository.save(infra);
		} catch (Exception e) {
			//log.error(		e.getMessage());
			throw e;
		}
	}

	@Override
	public int delete(int id) {
		try {
			Infracciones infra=findById(id);
			if(infra==null) {
				return 0;
			}else {
				repository.delete(infra);
				return 1;
			}
		} catch (Exception e) {
			//log.error(e.getMessage());
			throw e;
		}
	}


}
