package com.condominio.entity;

	import java.util.Date;

	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;
	import javax.persistence.Temporal;
	import javax.persistence.TemporalType;

	import com.fasterxml.jackson.annotation.JsonFormat;

	@Entity
	@Table(name = "edificio")
	public class Edificio {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int idEdificio;
		
		private String nomEdificio;
		private String numPisos;
		
		@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
		@Temporal(TemporalType.DATE)
		private Date fechaRegistro;

		public int getIdEdificio() {
			return idEdificio;
		}

		public void setIdEdificio(int idEdificio) {
			this.idEdificio = idEdificio;
		}

		

		public String getNomEdificio() {
			return nomEdificio;
		}

		public void setNomEdificio(String nomEdificio) {
			this.nomEdificio = nomEdificio;
		}

		public String getNumPisos() {
			return numPisos;
		}

		public void setNumPisos(String numPisos) {
			this.numPisos = numPisos;
		}

		public Date getFechaRegistro() {
			return fechaRegistro;
		}

		public void setFechaRegistro(Date fechaRegistro) {
			this.fechaRegistro = fechaRegistro;
		}
		
		
	}

