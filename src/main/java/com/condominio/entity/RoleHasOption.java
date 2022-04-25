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
@Table(name = "rol_has_opcion")
public class RoleHasOption {

	@EmbeddedId
	private RoleHasOptionPK rolHasOptionPK;
	
	@ManyToOne
	@JoinColumn(name = "idRol", nullable = false, insertable = false, updatable = false)
	private RoleUsuarioEntity rol;
	
	@ManyToOne
	@JoinColumn(name = "idOption", nullable = false, insertable = false, updatable = false)
	private OptionUsuario option;
}
