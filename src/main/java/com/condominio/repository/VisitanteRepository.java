package com.condominio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.condominio.entity.Visitante;

public interface VisitanteRepository extends JpaRepository<Visitante, Integer> {
	
	public abstract List<Visitante> findByDniVisitante(String dniVisitante);
	
	@Query("select m from Visitante m where m.dniVisitante = :p_dni and m.idVisitante <> :p_id")
	public abstract List<Visitante> buscaPoDniDiferenteAlmismo(@Param("p_dni") String dni, @Param("p_id") int id);
}
