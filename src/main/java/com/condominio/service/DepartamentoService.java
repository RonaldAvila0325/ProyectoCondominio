package com.condominio.service;

import java.util.List;

import com.condominio.entity.Departamento;

public interface DepartamentoService {
	

	public abstract List<Departamento> listaTodos();
	public abstract Departamento insertaDepartamento(Departamento obj);
	void Delete(int id);

}
