package com.condominio.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	public ResponseEntity<List<Propietario>> lista(){
		List<Propietario> lista=service.listaPropietario();
			return ResponseEntity.ok(lista);
	}	
	
	@PostMapping
	@ResponseBody
	public ResponseEntity<Propietario> inserta(@RequestBody Propietario obj){
		if(obj == null) {
			return ResponseEntity.noContent().build();
		}else {
			obj.setIdPropietario(0);
			Propietario objSalida = service.insertaActualiza(obj);
			return ResponseEntity.ok(objSalida);
	}
	}
	@PutMapping
	@ResponseBody
	public ResponseEntity<Propietario> actualizaPropietario(@RequestBody Propietario obj){
		if (obj == null) {
			return ResponseEntity.badRequest().build();
		}else {
			Optional<Propietario> optPropietario = service.buscaPorId(obj.getIdPropietario());
			if(optPropietario.isPresent()) {
				Propietario objActualizado = service.insertaActualiza(obj);
				return ResponseEntity.ok(objActualizado);
			}else {
				return ResponseEntity.badRequest().build();
			}
		}
	}
	
	@DeleteMapping("/{paramId}")
	@ResponseBody
	public ResponseEntity<Propietario> eliminaPropietario(@PathVariable("paramId") int idPropietario){
		Optional<Propietario> optPropietario = service.buscaPorId(idPropietario);
		if (optPropietario.isPresent()) {
			service.eliminaPorId(idPropietario);
			Optional<Propietario> optEliminado = service.buscaPorId(idPropietario);
			if (optEliminado.isPresent()) {
				return ResponseEntity.badRequest().build();
			}else {
				return ResponseEntity.ok(optPropietario.get());
			}
		}else {
			return ResponseEntity.badRequest().build();
		}
	}
	
	}








