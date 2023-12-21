package com.mondragon.sisgestion.entity;

import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="infracciones")
@EntityListeners(AuditingEntityListener.class)
public class Infracciones {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "dni", unique = true, nullable = false, length = 100)
	private String dni;
	
	@Column(name = "fecha", nullable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	private Date fecha;
	
	@Column(name = "placa", unique = true, nullable = false, length = 100)
	private String placa;
	
	@Column(name = "infraccion", unique = true, nullable = false, length = 100)
	private String infraccion;
	
	@Column(name = "descripcion", unique = true, nullable = false, length = 100)
	private String descripcion;
	
	
}
