package com.condominio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.condominio.entity.Departamento;
import com.condominio.repository.DepartamentoRepository;

@Service
public class DepartamentoServiceImpl implements DepartamentoService {
	
	@Autowired
	private DepartamentoRepository repository;
	

	@Override
	public Departamento insertaDepartamento(Departamento obj) {
		obj.setEstado("Activo");
		return repository.save(obj);
	}
	
	@Override
	public List<Departamento> listaTodos(){
		return repository.findAll();
	}
	
	@Override
	public void Delete(int id) {
		repository.deleteById(id);
	}

}
