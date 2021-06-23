package com.udec.reparamos.entity;

public class Reparacion {

	private String tipoArreglo;
	private String valor;
	private String duracion;
	private String observaciones;
	
	public String getTipoArreglo() {
		return tipoArreglo;
	}
	public void setTipoArreglo(String tipoArreglo) {
		this.tipoArreglo = tipoArreglo;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public String getDuracion() {
		return duracion;
	}
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	
	
}
