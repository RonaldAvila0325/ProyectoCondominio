package com.condominio.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "rol")
public class RoleUsuarioEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator = "native")
	private int idRol;
	private String nombre;
	private int estado;
	
}
