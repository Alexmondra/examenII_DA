package com.mondragon.sisgestion.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mondragon.sisgestion.entity.Infracciones;
import com.mondragon.sisgestion.service.InfraccionService;


@RestController
@RequestMapping("/api/infraccion")
public class InfraccionApi {
	@Autowired
	private InfraccionService service;
	
	@GetMapping()
	public ResponseEntity<List<Infracciones>> getAll(){
		List<Infracciones> infraccion = service.findAll();
		return ResponseEntity.status(HttpStatus.OK).body(infraccion);
	}
	
	@GetMapping(value="/(id)")
	public ResponseEntity<Infracciones> getById(@PathVariable("id") int id){
		Infracciones infraccion = service.findById(id);
		return ResponseEntity.status(HttpStatus.OK).body(infraccion);
	}
	/*
	@GetMapping(value="/(id)")
	public ResponseEntity<Infracciones> getByPlaca(@PathVariable("placa") String placa){
		Infracciones infraccion = service.findByPlaca(placa);
		return ResponseEntity.status(HttpStatus.OK).body(infraccion);
	} 
	*/
	@PostMapping
	public ResponseEntity<Infracciones> create(@RequestBody Infracciones infra){
		Infracciones infraccionDb = service.create(infra);
		return ResponseEntity.status(HttpStatus.CREATED).body(infraccionDb);
	}
	
	@PutMapping
	public ResponseEntity<Infracciones> update(@RequestBody Infracciones categoria){
		Infracciones infraccionDb = service.update(categoria);
		return ResponseEntity.status(HttpStatus.OK).body(infraccionDb);
	}
	
	@DeleteMapping(value="/(id)")
	public int delete(@PathVariable("id") int id){
		return service.delete(id);
	}
}
