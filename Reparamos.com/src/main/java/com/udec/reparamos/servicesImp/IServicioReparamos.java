package com.udec.reparamos.servicesImp;


import java.util.List;

import org.springframework.stereotype.Component;

import com.udec.reparamos.entity.Cliente;
import com.udec.reparamos.entity.Reparacion;


@Component
public interface IServicioReparamos {

	public List<Cliente> consultarCliente();
	public void registroCliente(Cliente cliente);
	public Cliente editarCliente(Cliente cliente);
	public void eliminarCliente(Integer id);
	public void registroReparacion(Reparacion reparacion);
	public List<Object> informeReparacion();
}
