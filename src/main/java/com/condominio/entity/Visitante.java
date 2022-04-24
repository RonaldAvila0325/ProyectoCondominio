package com.condominio.entity;

import java.util.Date;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "visitante")
@Getter
@Setter
public class Visitante {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idVisitante")
	private int idVisitante;
	private String nombreVisitante;
	private String apellidoVisitante;
	private String dniVisitante;
	
	@Temporal(TemporalType.DATE)
	private Date fechaRegistro;
}
