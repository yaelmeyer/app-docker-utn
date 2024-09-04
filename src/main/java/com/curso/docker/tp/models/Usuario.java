package com.curso.docker.tp.models;

public class Usuario {

	private int id;
	
	
	public Usuario() {
		super();
	}
	public Usuario(String nombre) {
		super();
		this.nombre = nombre;
	}
	private String nombre;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
