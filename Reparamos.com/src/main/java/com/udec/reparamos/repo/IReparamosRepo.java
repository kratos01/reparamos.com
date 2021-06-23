package com.udec.reparamos.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.udec.reparamos.entity.Cliente;

@Repository
public interface IReparamosRepo extends JpaRepository<Cliente, Integer>{

	//BigInteger validarExistenciaCedulaEditar(Integer id, int cedula);
	
	@Query(value = "select count(*) from public.cliente where cedula = :cedula and id != :id", nativeQuery = true)				
	Object validarExistenciaCedulaEditar(@Param("id") Integer id, @Param("cedula") int cedula);
}
