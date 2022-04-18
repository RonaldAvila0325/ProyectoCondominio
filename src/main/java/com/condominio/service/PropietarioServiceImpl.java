package com.condominio.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.condominio.entity.Departamento;
import com.condominio.entity.Propietario;
import com.condominio.repository.PropietarioRepository;

@Service
public class PropietarioServiceImpl implements PropietarioService {
	
	
	@Autowired
	private PropietarioRepository repository;
	
	@Override
	public Propietario insertaPropietario(Propietario obj) {
		obj.setFechaRegistro(new Date());;
		return repository.save(obj);
	}
	
	@Override
	public List<Propietario> listaTodos(){
		return repository.findAll();
	}
	
	
}