package com.condominio.service;

import java.util.List;
import java.util.Optional;

import com.condominio.entity.Edificio;

public interface EdificioService {

	public abstract List<Edificio> listaEdifico();
	public abstract Edificio insertaActualizaEdifico(Edificio obj);
}
