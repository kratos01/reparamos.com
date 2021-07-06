package com.udec.reparamos.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.udec.reparamos.entity.Cliente;
import com.udec.reparamos.entity.Reparacion;
import com.udec.reparamos.servicesImp.IServicioReparamos;

@RestController
@RequestMapping("/usuario")
public class ReparamosController {

	@Autowired
	 IServicioReparamos service;
	
	
	//servicios CRUD Cliente
	@GetMapping(path = "/consultarCliente")
	public ResponseEntity<List<Cliente>> consultarUsuario() {
		 List<Cliente> cliente = service.consultarCliente();
		return new ResponseEntity<List<Cliente>>(cliente, HttpStatus.OK);
	}
	
	@PostMapping(path = "/guardar")
	public ResponseEntity<Cliente> guardarUsuario(@RequestBody Cliente cliente) {
		 service.registroCliente(cliente);
		return new ResponseEntity<Cliente>(cliente, HttpStatus.OK);
	}
	
	@PutMapping(path = "/editar")
	public ResponseEntity<Cliente> editarUsuario(@RequestBody Cliente cliente) {
		 service.editarCliente(cliente);
		return new ResponseEntity<Cliente>(cliente, HttpStatus.OK);
	}
	
	@DeleteMapping(path = "/eliminar")
	public ResponseEntity<Object> eliminarUsuario(@RequestParam(value ="id", required = true)int id){
		service.eliminarCliente(id);
		return new ResponseEntity<Object>(HttpStatus.NO_CONTENT);
	}
	
	//Servicios Insercion de reparaciones
	@PostMapping(path = "/guardarReparacion")
	public ResponseEntity<Reparacion> guardarReparacion(@RequestBody Reparacion reparacion) {
		 service.registroReparacion(reparacion);
		return new ResponseEntity<Reparacion>(reparacion, HttpStatus.OK);
	}
}
