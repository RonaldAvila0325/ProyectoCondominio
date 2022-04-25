package com.condominio.service;

import com.condominio.entity.*;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UsuarioServicio {
	public abstract UsuarioEntity login(UsuarioEntity bean);
	public abstract List<OptionUsuario> EnlaceUsuario(int idUsuario);
	public abstract List<RoleUsuarioEntity> EnlaceRolesUsuario(int idUsuario);
	public Page<UsuarioEntity> findAll(Pageable pageable);
	public UsuarioEntity findById(int id);
	public UsuarioEntity save(UsuarioEntity bean);
	public void delete (int id);
}
