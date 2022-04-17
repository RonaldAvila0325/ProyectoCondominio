package com.condominio.service;

import java.util.List;
import java.util.Optional;

import com.condominio.entity.Edificio;

public interface EdificioService {

	public abstract List<Edificio> listaEdifico();
	public abstract Edificio insertaActualizaEdifico(Edificio obj);
	/*public abstract List<Edifico> listaAlumnoPorDni(String dni);
	public abstract Optional<Edifico> buscaPorId(int idAlumno);
	public abstract List<Edifico> listaAlumnoPorDniDiferenteDelMismo(String dni, int idAlumno);
	public abstract void eliminaPorId(int idAlumno);
	public abstract List<Edifico> listaUsuarioPorNombreOCorreo(String nombre, String correo);*/
}
