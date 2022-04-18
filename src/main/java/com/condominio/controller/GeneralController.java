package com.condominio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.condominio.entity.Departamento;
import com.condominio.entity.Edificio;
import com.condominio.entity.Propietario;
import com.condominio.entity.Visita;
import com.condominio.service.DepartamentoService;
import com.condominio.service.EdificioService;
import com.condominio.service.PropietarioService;
import com.condominio.service.VisitaService;
import com.condominio.service.VisitanteService;

@RestController
@RequestMapping("/url/lista")
@CrossOrigin(origins="http://localhost:4200")
public class GeneralController {

	@Autowired
	private DepartamentoService departamentoService;
	
	@Autowired
	private EdificioService edificioService;
	
	@Autowired
	private PropietarioService propietarioService;
	
	@Autowired
	private VisitaService visitaService;
	
	@GetMapping("/listaDepartamento")
	@ResponseBody
	public List<Departamento>listaDepartamentos(){
		return departamentoService.listaTodos();
	}
	
	@GetMapping("/listaEdificio")
	@ResponseBody
	public List<Edificio>listaEdificios(){
		return edificioService.listaEdificio();
	}
	
	@GetMapping("/listaPropietario")
	@ResponseBody
	public List<Propietario>listaPropietario(){
		return propietarioService.listaTodos();
	}
	
	@GetMapping("/listaVisita")
	@ResponseBody
	public List<Visita>listaVisita(){
		return visitaService.listaVisita();
	}
	
	
	
}
