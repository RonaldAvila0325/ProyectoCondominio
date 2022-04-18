package com.condominio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.condominio.entity.Edificio;
import com.condominio.repository.EdificioRepository;

@Service
public class EdificioServiceImpl implements EdificioService {

	@Autowired
	private EdificioRepository repository;
	
	@Override
	public List<Edificio> listaEdificio(){
		return repository.findAll();
	}
}
