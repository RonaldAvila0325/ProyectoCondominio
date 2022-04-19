package com.condominio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.condominio.entity.Propietario;
import com.condominio.repository.PropietarioRepository;

@Service
public class PropietarioServiceImpl implements PropietarioService {
	
	@Autowired //autoinyecta
	private PropietarioRepository repository;

	@Override
	public List<Propietario> listaTodos() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
