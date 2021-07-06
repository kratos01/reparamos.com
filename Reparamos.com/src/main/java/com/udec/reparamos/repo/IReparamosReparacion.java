package com.udec.reparamos.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udec.reparamos.entity.Reparacion;

public interface IReparamosReparacion extends JpaRepository<Reparacion, Integer>{

}
