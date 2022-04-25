package com.condominio.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "usuario_has_rol")
public class UsuarioHasRole {
	
	@EmbeddedId
	private UsuarioHasRolePK usuHasRolePk;
	
	@ManyToOne
	@JoinColumn(name= "idUsuario", nullable = false, insertable = false, updatable = false)
	private UsuarioEntity usuario;

	@ManyToOne
	@JoinColumn(name = "idRol", nullable = false, insertable = false, updatable = false)
	private RoleUsuarioEntity rol;
	
}
