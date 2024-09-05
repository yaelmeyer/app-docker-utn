package com.curso.docker.tp.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.curso.docker.tp.models.Usuario;
import com.curso.docker.tp.repositories.UsuarioRepository;
import com.curso.docker.tp.services.IUsuarioService;

@Service("usuarioService")
public class UsuarioService implements IUsuarioService {

	@Autowired
	@Qualifier("usuarioRepository")
	private UsuarioRepository usuarioRepository;
	
	@Override
	public List<Usuario> getAll() {
		
		return this.usuarioRepository.findAll();
	}

	@Override
	public void agregar(Usuario usuario) {
		this.usuarioRepository.save(usuario);
	}

}
