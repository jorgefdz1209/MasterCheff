package com.netasystems.recetarios;

public class Ingrediente {
	private String nombre;
	private String medida;
	
	public Ingrediente(String nombre, String medida) {
		super();
		if (nombre.isEmpty()||medida.isEmpty()) {
			System.out.println("No has ingresado el nombre y/o la medida");
		}else {
			this.nombre = nombre;
			this.medida = medida;	
		}
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMedida() {
		return medida;
	}
	public void setMedida(String medida) {
		this.medida = medida;
	}
	
}
