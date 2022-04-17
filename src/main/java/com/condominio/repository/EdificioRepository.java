package com.condominio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.condominio.entity.Edificio;

public interface EdificioRepository extends JpaRepository<Edificio, Integer> {
	
	/*public abstract List<Edifico> findByDni(String dni);
	
	@Query("select e from Alumno e where e.dni = ?1 and e.idAlumno <> ?2")
	public abstract List<Edifico> listaUsuarioPorDniDiferenteDelMismo(String dni, int idAlumno);
	
	@Query("select e from Alumno e where e.nombre = ?1 or e.correo = ?2")
	public abstract List<Edifico> listaUsuarioPorNombreOCorreo(String nombre, String correo);
*/

}