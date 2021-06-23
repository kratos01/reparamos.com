package com.udec.reparamos.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.udec.reparamos.entity.Cliente;
import com.udec.reparamos.servicesImp.IServicioReparamos;

@RestController
@RequestMapping("/usuario")
public class ReparamosController {

	@Autowired
	 IServicioReparamos service;
	
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
	public ResponseEntity<Object> borrar(@RequestParam(value ="id", required = true)int id){
		service.eliminarCliente(id);
		return new ResponseEntity<Object>(HttpStatus.NO_CONTENT);
	}
}
