package com.condominio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.condominio.entity.Visita;
import com.condominio.repository.VisitaRepository;

@Service
public class VisitaServiceImpl implements VisitaService{
	@Autowired
	private VisitaRepository repository;
	
	@Override
	public List<Visita> listaVisita(){
		return repository.findAll();
	}

}
