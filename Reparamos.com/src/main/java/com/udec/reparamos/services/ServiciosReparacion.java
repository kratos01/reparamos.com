package com.udec.reparamos.services;

import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udec.reparamos.entity.Cliente;
import com.udec.reparamos.repo.IReparamosRepo;
import com.udec.reparamos.servicesImp.IServicioReparamos;



@Service
public class ServiciosReparacion implements IServicioReparamos{

	@Autowired
	IReparamosRepo repo;
	
	@Override
	public void registroCliente(Cliente cliente) {
		repo.save(cliente);
	}

	@Override
	public Cliente editarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		if (cliente.getId() == null) {
			throw new RuntimeException("Id Autor es requerido");
		}
		Cliente cli = repo.findById(cliente.getId()).orElseThrow(() -> new RuntimeException("Autor no encontrado"));
		
		BigInteger contador = (BigInteger) repo.validarExistenciaCedulaEditar(cliente.getId(), cliente.getCedula());

		if (contador.intValue() > 0)
			throw new RuntimeException("Ya existe un Autor con esta cédula");
		
		cli.setApellido(cliente.getApellido());
		cli.setNombre(cliente.getNombre());
		cli.setCedula(cliente.getCedula());
		cli.setTelefono(cliente.getTelefono());
		cli.setDireccion(cliente.getDireccion());
		cli.setFechaNacimiento(cliente.getFechaNacimiento());

		repo.save(cli);
		return cli;
	}
	
	@Override
	public void eliminarCliente(Integer id) {
		Cliente cli = repo.findById(id).orElseThrow(() -> new RuntimeException("Autor no encontrado"));
		repo.delete(cli);
	}

	
}
