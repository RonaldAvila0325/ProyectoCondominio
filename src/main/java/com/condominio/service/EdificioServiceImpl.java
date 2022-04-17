package com.condominio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.condominio.entity.Edificio;
import com.condominio.repository.EdificioRepository;

@Service
public class EdificioServiceImpl implements EdificioService {

	@Autowired
	private EdificioRepository repository;

	@Override
	public List<Edificio> listaEdifico() {
		return repository.findAll();
	}

	@Override
	public Edificio insertaActualizaEdifico(Edificio obj) {
		return repository.save(obj);
	}

	/*@Override
	public List<Edifico> listaAlumnoPorDni(String dni) {
		return repository.findByDni(dni);
	}

	@Override
	public Optional<Edifico> buscaPorId(int idAlumno) {
		return repository.findById(idAlumno);
	}

	@Override
	public List<Edifico> listaAlumnoPorDniDiferenteDelMismo(String dni, int idAlumno) {
		return repository.listaUsuarioPorDniDiferenteDelMismo(dni, idAlumno);
	}

	@Override
	public void eliminaPorId(int idAlumno) {
		repository.deleteById(idAlumno);
	}
	
	@Override
	public List<Edifico> listaUsuarioPorNombreOCorreo(String nombre, String correo) {
		return repository.listaUsuarioPorNombreOCorreo(nombre, correo);
	}*/
}
