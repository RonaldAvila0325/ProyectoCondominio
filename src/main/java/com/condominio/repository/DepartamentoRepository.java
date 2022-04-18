package com.condominio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.condominio.entity.Departamento;

public interface DepartamentoRepository extends JpaRepository<Departamento, Integer> {

	
}
