package com.condominio.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.condominio.entity.Departamento;
import com.condominio.service.DepartamentoService;
import com.condominio.util.Util;

@RequestMapping("/rest/departamento")
@CrossOrigin(origins ="http://localhost:4200")
@RestController	
public class DepartamentoController {
	


@Autowired
private DepartamentoService Service;

@GetMapping
@ResponseBody
public ResponseEntity<List<Departamento>>listaDepartamento(){
	List<Departamento> lista = Service.listaTodos();
	return ResponseEntity.ok(lista);
}

@PostMapping
@ResponseBody
public  ResponseEntity<Map<String, Object>> insertaDepartamento(@RequestBody Departamento obj){
	Map<String, Object> salida = new HashMap<>();
	try {
		Departamento objSalida = Service.insertaDepartamento(obj);
		if (objSalida == null) {
			salida.put("mensaje", Util.MENSAJE_REG_ERROR);
		}else {
			salida.put("mensaje", Util.MENSAJE_REG_EXITOSO);
		}
	} catch (Exception e) {
		e.printStackTrace();
		salida.put("mensaje", Util.MENSAJE_REG_ERROR);
	}
	return ResponseEntity.ok(salida);
}



}
