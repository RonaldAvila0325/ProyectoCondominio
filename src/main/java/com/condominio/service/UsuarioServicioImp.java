package com.condominio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.condominio.entity.OptionUsuario;
import com.condominio.entity.RoleUsuarioEntity;
import com.condominio.entity.UsuarioEntity;
import com.condominio.repository.UsuarioRepository;

@Service
public class UsuarioServicioImp implements UsuarioServicio{

	@Autowired
	UsuarioRepository urepo;
	
	@Override
	public UsuarioEntity login(UsuarioEntity bean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OptionUsuario> EnlaceUsuario(int idUsuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RoleUsuarioEntity> EnlaceRolesUsuario(int idUsuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<UsuarioEntity> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UsuarioEntity findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UsuarioEntity save(UsuarioEntity bean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
