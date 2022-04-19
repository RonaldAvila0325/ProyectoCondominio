package com.condominio.service;

import java.util.List;
import java.util.Optional;

import com.condominio.entity.Propietario;

public interface PropietarioService {
	
	public abstract Propietario insertaActualiza(Propietario obj);	
	public abstract List<Propietario> listaPropietario();
	public abstract Optional<Propietario> buscaPorId(int idPropietario);
	//permite devolver de forma opcional si lo que ha encontrado es nulo o con valor
	public abstract void eliminaPorId(int idPropietario);
}
