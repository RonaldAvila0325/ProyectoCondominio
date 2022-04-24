package com.condominio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.condominio.entity.Visitante;
import com.condominio.repository.VisitanteRepository;

@Service
public class VisitanteServiceImpl implements VisitanteService {

	@Autowired
	private VisitanteRepository vRepository;
	@Override
	public List<Visitante> listaVisitante() {
		return vRepository.findAll();
	}
	@Override
	public Visitante insertaActualizaVisitante(Visitante obj) {
		return vRepository.save(obj);
	}
	@Override
	public List<Visitante> listarVisitantePorDni(String dniVisitante) {
		return vRepository.findByDniVisitante(dniVisitante);
	}
	@Override
	public Optional<Visitante> buscarPorId(int idVisitante) {
		return vRepository.findById(idVisitante);
	}
	@Override
	public List<Visitante> listaVisitantePorDniDiferenteAlMismo(String dniVisitante, int idVistante) {
		return vRepository.buscaPoDniDiferenteAlmismo(dniVisitante, idVistante);
	}
	@Override
	public void eliminaPorId(int idVisitante) {
		vRepository.deleteById(idVisitante);
	}
	

}
