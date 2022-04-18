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
	@Table(name="incidente")
	public class Incidente {
		
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int idIncidente;
		private String descripcion;
		
		@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
		@Temporal(TemporalType.DATE)
		private Date fechaIncidente;
		
		@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name="idDepartamento")
		private Departamento departamento;

		public int getIdIncidente() {
			return idIncidente;
		}

		public void setIdIncidente(int idIncidente) {
			this.idIncidente = idIncidente;
		}

		public String getDescripcion() {
			return descripcion;
		}

		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}

		public Date getFechaIncidente() {
			return fechaIncidente;
		}

		public void setFechaIncidente(Date fechaIncidente) {
			this.fechaIncidente = fechaIncidente;
		}

		public Departamento getDepartamento() {
			return departamento;
		}

		public void setDepartamento(Departamento departamento) {
			this.departamento = departamento;
		}
		
		

	}


