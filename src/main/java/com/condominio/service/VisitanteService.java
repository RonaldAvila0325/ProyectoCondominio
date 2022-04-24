package com.condominio.service;

import java.util.List;
import java.util.Optional;

import com.condominio.entity.Visitante;

public interface VisitanteService {
	
	public abstract List<Visitante> listaVisitante();
	public abstract Visitante insertaActualizaVisitante(Visitante obj);
	public abstract List<Visitante> listarVisitantePorDni(String dniVisitante);
	public abstract Optional<Visitante> buscarPorId(int idVisitante);
	public abstract List<Visitante> listaVisitantePorDniDiferenteAlMismo(String dniVisitante, int idVistante);
	public abstract void eliminaPorId(int idVisitante); 
}
