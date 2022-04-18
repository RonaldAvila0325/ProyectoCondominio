package com.condominio.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "visitante")
public class Visitante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idVisitante;
	
	private String nombreVisitante;
	private String apellidosVisitante;
	private String dniVisitante;
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@Temporal(TemporalType.DATE)
	private Date fechaRegistro;
	
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idVisita")
	private Visita visita;

	
	public int getIdVisitante() {
		return idVisitante;
	}
	public void setIdVisitante(int idVisitante) {
		this.idVisitante = idVisitante;
	}

	public String getNombreVisitante() {
		return nombreVisitante;
	}
	public void setNombreVisitante(String nombreVisitante) {
		this.nombreVisitante = nombreVisitante;
	}
	public String getApellidosVisitante() {
		return apellidosVisitante;
	}
	public void setApellidosVisitante(String apellidosVisitante) {
		this.apellidosVisitante = apellidosVisitante;
	}
	public String getDniVisitante() {
		return dniVisitante;
	}
	public void setDniVisitante(String dniVisitante) {
		this.dniVisitante = dniVisitante;
	}
	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public Visita getVisita() {
		return visita;
	}
	public void setVisita(Visita visita) {
		this.visita = visita;
	}
	
	
	
	
	

}
