package com.curso.docker.tp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.curso.docker.tp.helpers.viewRouteHelper;
import com.curso.docker.tp.models.Usuario;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

	@GetMapping("/new")public String get(Model model) {
		model.addAttribute("usuario", new Usuario());
		return viewRouteHelper.NEW_USUARIO;
	}
	
	@PostMapping("/new")
	public ModelAndView crearUsuario(@ModelAttribute("usuario") Usuario usuario) {
		ModelAndView mV = new ModelAndView();
		mV.setViewName(viewRouteHelper.USUARIO);
		mV.addObject("usuario", usuario);
		return mV;
	}
}
