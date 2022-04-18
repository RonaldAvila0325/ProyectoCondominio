package com.condominio.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.condominio.entity.Visitante;
import com.condominio.repository.VisitanteRepository;

@Service
public class VisitanteServiceImpl implements VisitanteService {
	
	@Autowired
	private VisitanteRepository repository;
	
	@Override
	public Visitante insertaVisitante(Visitante obj) {
		obj.setFechaRegistro(new Date());
		return repository.save(obj);
	}
	
	@Override
	public List<Visitante> listaTodos(){
		return repository.findAll();
	}
	

}
