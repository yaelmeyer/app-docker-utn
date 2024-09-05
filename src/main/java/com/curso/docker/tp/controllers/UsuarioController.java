package com.curso.docker.tp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.curso.docker.tp.helpers.viewRouteHelper;
import com.curso.docker.tp.models.Usuario;
import com.curso.docker.tp.services.IUsuarioService;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	@Qualifier("usuarioService")
	private IUsuarioService usuarioService;
	
	@GetMapping("/new")
	public String get(Model model) {
		model.addAttribute("usuario", new Usuario());
		return viewRouteHelper.NEW_USUARIO;
	}
	
	@PostMapping("/new")
	public ModelAndView crearUsuario(@ModelAttribute("usuario") Usuario usuario) {
		this.usuarioService.agregar(usuario);
		ModelAndView mV = new ModelAndView();
		mV.setViewName(viewRouteHelper.USUARIO);
		mV.addObject("usuario", usuario);
		return mV;
	}
	
	@GetMapping("/all")
	public String all(Model model) {
		List<Usuario> usuarios = this.usuarioService.getAll();
		model.addAttribute("usuarios", usuarios);	
		return viewRouteHelper.ALL_USERS;
	}
}
