package com.condominio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.condominio.entity.Propietario;

public interface PropietarioRepository extends JpaRepository<Propietario, Integer> {


	
	
}
