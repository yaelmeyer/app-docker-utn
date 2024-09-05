package com.curso.docker.tp.services;

import java.util.List;

import com.curso.docker.tp.models.Usuario;

public interface IUsuarioService {

	public List<Usuario> getAll();
	
	public void agregar(Usuario usuario);
}
