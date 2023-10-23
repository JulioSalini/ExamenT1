package org.cibertec.pe.controller;

import java.util.List;

import org.cibertec.pe.InterfaceListado.ITrabajadorListado;
import org.cibertec.pe.model.Trabajador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TrabajadorController {
	
	@Autowired
	private ITrabajadorListado listado;
	
	//Metodo para Listar
	@GetMapping("/listar")
	public String Listar(Model m) {
		List<Trabajador> LTratrabajador = listado.Listado();
		m.addAttribute("listTra",LTratrabajador);
		return"Listado";
	}
	
	//Metodo para buscar
	
	//Metodo para Agregar
	@GetMapping("/form")
	public String agregar(Model m) {
		m.addAttribute("trabajador", new Trabajador());
		return "form";
	}
	@GetMapping("/salvar")
	public String grabar(Trabajador t,Model m) {
		listado.grabar(t);
		return "redirect:/listar";
	}
}
