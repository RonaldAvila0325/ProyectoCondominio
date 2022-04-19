package com.condominio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.condominio.entity.Propietario;
import com.condominio.service.PropietarioService;

@RestController
@RequestMapping("/rest/propietario")
public class PropietarioController {
	@Autowired
	private PropietarioService service;
	
	@GetMapping
	@ResponseBody
	public ResponseEntity <List <Propietario>> listarPropietarios(){
		return ResponseEntity.ok(service.listaTodos());
	}
	
}
