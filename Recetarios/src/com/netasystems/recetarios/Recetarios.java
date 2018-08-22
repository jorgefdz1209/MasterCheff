package com.netasystems.recetarios;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Recetarios {

private Map<String,Receta> lista;
	
	
	public Recetarios() {
		lista = new HashMap<String, Receta>();
	}
	
	public void mostrarList() {
		Set<String> key = lista.keySet();
		for(String i : key) {
			System.out.println(i);
			Receta receta = lista.get(i);
			receta.mostrarIngredientes();
			receta.mostrarProcedimiento(); 
		}
	} 
	
	public void añadirReceta(String nombre,Receta receta) {
		lista.put(nombre, receta);
	}
	
	public boolean borraReceta(String nombre){
		if(checkNombre(nombre)) {
			Receta r = lista.remove(nombre);
			if( r!=null) return true; return false;
		}else {
			System.out.println("No existe la receta que intentas borrar");
			return false;
		}
		
	}
	
	public Set<String> listaLLaves() {
		return lista.keySet();
	}
	
	public boolean checkNombre(String n) {
		return this.lista.containsKey(n);
	}
	
	public Map<String, Receta> getListado() {
		return lista;
	}

	public void setListado(Map<String, Receta> listado) {
		this.lista = listado;
	}
}
