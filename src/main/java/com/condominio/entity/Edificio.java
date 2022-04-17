package com.condominio.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "edificio")
@Getter
@Setter
public class Edificio {

	//@Column(name = "idEdificio")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEdificio;
	private String nomEdificio;
	private String numPisos;
	//private String correo;
	//@DateTimeFormat(pattern = "yyyy-MM-dd")
	//@Temporal(TemporalType.DATE)
	//private Date fechaNacimiento;
	
	
}






