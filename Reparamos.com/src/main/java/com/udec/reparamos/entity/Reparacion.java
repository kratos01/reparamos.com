package com.udec.reparamos.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reparacion")
public class Reparacion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String tipoArreglo;
	private Double valor;
	private String garantia;
	private String observaciones;
	private String duracion;
	
	public String getTipoArreglo() {
		return tipoArreglo;
	}
	public void setTipoArreglo(String tipoArreglo) {
		this.tipoArreglo = tipoArreglo;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public String getDuracion() {
		return garantia;
	}
	public void setDuracion(String duracion) {
		this.garantia = duracion;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getGarantia() {
		return garantia;
	}
	public void setGarantia(String garantia) {
		this.garantia = garantia;
	}
	
	
}
