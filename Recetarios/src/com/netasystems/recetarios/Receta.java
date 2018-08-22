package com.netasystems.recetarios;

import java.util.List;

public class Receta {

	private String nombre;
	private String autor;
	private List<Ingrediente> ingredientes;
	private List<String> procedimiento;
	
	public Receta(String nombre, String autor, List<Ingrediente> ingredientes, List<String> procedimiento) {
		super();
		if(nombre.isEmpty()||autor.isEmpty()) {
			System.out.println("Nombre de la receta y/o nombre del autor vacio");
		}else {
		this.nombre = nombre;
		this.autor = autor;
		this.ingredientes = ingredientes;
		this.procedimiento = procedimiento;
		}
	}	
	
	public void mostrarProcedimiento() {
		for(String s : procedimiento) {
			System.out.println(s);
		}
	}
	
	public void mostrarIngredientes() {
		for(Ingrediente i : ingredientes) {
			System.out.println(i.getNombre()+"  "+i.getMedida());
		}
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public List<Ingrediente> getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(List<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
	}
	public List<String> getProcedimiento() {
		return procedimiento;
	}
	public void setProcedimiento(List<String> procedimiento) {
		this.procedimiento = procedimiento;
	}
	
	
	
}
