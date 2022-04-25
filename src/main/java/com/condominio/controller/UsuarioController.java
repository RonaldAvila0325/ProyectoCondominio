package com.condominio.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.condominio.entity.*;
import com.condominio.service.UsuarioServicio;

@Controller
public class UsuarioController {

	@Autowired
	private UsuarioServicio userser;
	
	@RequestMapping("/login")
	public String login(UsuarioEntity user, HttpSession session, HttpServletRequest request) {
		UsuarioEntity usuario = userser.login(user);
		if (usuario == null) {
			request.setAttribute("mensaje", "El Usuario ingresado no existe");
			return "";
		} else {
			List<OptionUsuario> menus = userser.EnlaceUsuario(usuario.getIdUsuario());
			List<RoleUsuarioEntity> roles = userser.EnlaceRolesUsuario(usuario.getIdUsuario());
			
			session.setAttribute("objUsuario", usuario);
			session.setAttribute("objMenus", menus);
			session.setAttribute("objRoles", roles);
			
			return "user-form";
		}
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		session.invalidate();
		
		response.setHeader("Cache-control", "no-cache");
		response.setHeader("Expires", "0");
		response.setHeader("Pragma", "no-cache");
		
		request.setAttribute("mensaje", "El usuario salió de sesión");
		return "index";
	}
}
