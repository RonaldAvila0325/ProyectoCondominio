package com.condominio.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Propietario")
public class Propietario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPropietario;
	private int numeroCliente;
	private String apellidoCliente;
	private int telefonoCliente;
	private Date fechaNac;
	private Date fechaRegistro;
}
