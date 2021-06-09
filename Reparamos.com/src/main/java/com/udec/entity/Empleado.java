package com.udec.entity;

public class Empleado extends Persona{

	private Integer id;
	private String rol;
	
	public Empleado(Integer id, String rol) {
		super();
		this.id = id;
		this.rol = rol;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}
	
	
	
}
