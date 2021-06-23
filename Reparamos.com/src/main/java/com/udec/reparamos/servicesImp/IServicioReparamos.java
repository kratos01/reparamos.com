package com.udec.reparamos.servicesImp;


import org.springframework.stereotype.Component;

import com.udec.reparamos.entity.Cliente;


@Component
public interface IServicioReparamos {

	public void registroCliente(Cliente cliente);
	public Cliente editarCliente(Cliente cliente);
	public void eliminarCliente(Integer id);
}
