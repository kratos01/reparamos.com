package com.udec.reparamos.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.udec.reparamos.entity.Reparacion;

public interface IReparamosReparacion extends JpaRepository<Reparacion, Integer>{

	@Query(value = "SELECT c.nombre, c.apellido, c.cedula, c.telefono, c.direccion, r.tipo_arreglo, r.valor, r.garantia, r.observaciones "
			+ "FROM cliente c JOIN reparacion r ON  c.id = r.id_cliente", nativeQuery = true)
	List<Object> findbyinforme();
}
