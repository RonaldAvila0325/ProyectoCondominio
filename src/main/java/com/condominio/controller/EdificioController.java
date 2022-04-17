package com.condominio.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.condominio.entity.Edificio;
import com.condominio.service.EdificioService;

@RestController
@RequestMapping("/rest/Edificio")
@CrossOrigin(origins = "http://localhost:4200")
public class EdificioController {

	@Autowired
	private EdificioService service;

	@GetMapping
	@ResponseBody
	public ResponseEntity<List<Edificio>> listaEdifico() {
		List<Edificio> lista = service.listaEdifico();
		return ResponseEntity.ok(lista);
	}
	
	@PostMapping
	@ResponseBody
	public ResponseEntity<Map<String, Object>> insertaEdifico(@RequestBody Edificio obj) {
		Map<String, Object> salida = new HashMap<String, Object>();
		try {
				
				Edificio objSalida = service.insertaActualizaEdifico(obj);
				if (objSalida == null) {
					salida.put("mensaje", "Error en el registro");
				} else {
					salida.put("mensaje", "Se registro correctamente");
				}
		} catch (Exception e) {
			e.printStackTrace();
			salida.put("mensaje", "Error en el registro");
		}
		return ResponseEntity.ok(salida);
	}
}
