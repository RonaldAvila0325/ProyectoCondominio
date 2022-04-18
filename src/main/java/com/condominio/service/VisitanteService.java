package com.condominio.service;

import java.util.List;

import com.condominio.entity.Visitante;

public interface VisitanteService {
	public abstract List<Visitante> listaTodos();
	public abstract Visitante insertaVisitante(Visitante obj);

}
