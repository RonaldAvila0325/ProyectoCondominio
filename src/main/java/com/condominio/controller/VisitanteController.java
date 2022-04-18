package com.condominio.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.condominio.entity.Visitante;
import com.condominio.service.VisitanteService;
import com.condominio.util.Util;

@RequestMapping("/rest/visitante")
@CrossOrigin(origins ="http://localhost:4200")
@RestController	
public class VisitanteController {
	
	@Autowired
	private VisitanteService Service;

	@GetMapping
	@ResponseBody
	public ResponseEntity<List<Visitante>>listaVisitante(){
		List<Visitante> lista = Service.listaTodos();
		return ResponseEntity.ok(lista);
	}

	@PostMapping
	@ResponseBody
	public  ResponseEntity<Map<String, Object>> insertaVisitante(@RequestBody Visitante obj){
		Map<String, Object> salida = new HashMap<>();
		try {
			Visitante objSalida = Service.insertaVisitante(obj);
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
