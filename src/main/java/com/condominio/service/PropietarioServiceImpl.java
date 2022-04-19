package com.condominio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.condominio.entity.Propietario;
import com.condominio.repository.PropietarioRepository;

@Service
public class PropietarioServiceImpl implements PropietarioService {

	@Autowired
	private PropietarioRepository repository;
	
	@Override
	public Propietario insertaActualiza(Propietario obj) {
		return repository.save(obj);
	}

	@Override
	public List<Propietario> listaPropietario() {
		return repository.findAll();
	}

	@Override
	public Optional<Propietario> buscaPorId(int idPropietario) {
		// TODO Auto-generated method stub
		return repository.findById(idPropietario);
	}

	@Override
	public void eliminaPorId(int idPropietario) {
		// TODO Auto-generated method stub
		repository.deleteById(idPropietario);
		//No retorna valores
	}

}
