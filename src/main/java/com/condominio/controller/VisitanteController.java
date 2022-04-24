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

import com.condominio.entity.Visitante;
import com.condominio.service.VisitanteService;

@RestController
@RequestMapping("/rest/Visitante")
public class VisitanteController {
	
	@Autowired
	private VisitanteService service;

	@GetMapping
	@ResponseBody
	public ResponseEntity<List<Visitante>> listaVisitante() {
		List<Visitante> lista = service.listaVisitante();
		return ResponseEntity.ok(lista);
	}
	
	@PostMapping
	@ResponseBody
	public ResponseEntity<HashMap<String, Object>> insertaVisitante(@RequestBody Visitante obj){
		HashMap<String, Object> salida = new HashMap<String, Object>();
		try {
			List<Visitante> lstVisitante = service.listarVisitantePorDni(obj.getDniVisitante());
			if (CollectionUtils.isEmpty(lstVisitante)) {
				Visitante objSalida = 	service.insertaActualizaVisitante(obj);
				if (objSalida == null) {
					salida.put("mensaje", "Error en el registro");
				}else {
					salida.put("mensaje", "Se registro correctamente");
				}	
			}else {
				salida.put("mensaje", "El dni " + obj.getDniVisitante() + " ya existe.");
			}
		} catch (Exception e) {
			e.printStackTrace();
			salida.put("mensaje", "Error en el registro");
		}	
		return ResponseEntity.ok(salida);
	}
	
	@PutMapping
	@ResponseBody
	public ResponseEntity<HashMap<String, Object>> actualizaVisitante(@RequestBody Visitante obj){
		HashMap<String, Object> salida = new HashMap<String, Object>();
		try {
			Optional<Visitante> optional = service.buscarPorId(obj.getIdVisitante());
			if (optional.isEmpty()) {
				salida.put("mensaje", "No existe Visitante de ID: " + obj.getIdVisitante());
			}
			else {
				List<Visitante> lstVistante= service.listaVisitantePorDniDiferenteAlMismo(obj.getDniVisitante(),obj.getIdVisitante());
				if(CollectionUtils.isEmpty(lstVistante)){
					Visitante objSalida = 	service.insertaActualizaVisitante(obj);
					if (objSalida == null) {
						salida.put("mensaje", "Error al Actualizar");
					}	
					else {
						salida.put("mensaje", "Se actualizó correctamente");
					}
				}
				else {
					salida.put("mensaje", "El dni " + obj.getDniVisitante() + " ya existe.");
				}	
			}
		}
		catch (Exception e) {
			e.printStackTrace();
			salida.put("mensaje", "Error en el registro");
		}	
		return ResponseEntity.ok(salida);
	}
	
	@DeleteMapping("/{id}")
	@ResponseBody
	public ResponseEntity<HashMap<String, Object>> eliminaVisitante(@PathVariable("id") int idVisitante){
		HashMap<String, Object> salida = new HashMap<String, Object>();
		Optional<Visitante> optional = service.buscarPorId(idVisitante);
		if (optional.isPresent()) {
			service.eliminaPorId(idVisitante);
			salida.put("mensaje", "Se eliminó correctamente");
		} else {
			salida.put("mensaje", "No existe el id : " + idVisitante);
		}
		return ResponseEntity.ok(salida);
	}	
}

