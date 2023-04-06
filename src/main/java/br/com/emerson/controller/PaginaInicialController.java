package br.com.emerson.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class PaginaInicialController {

	@GetMapping("home")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("home");
		return mv;
	}
	
	@GetMapping("/teste")
	@ResponseBody
	public String teste() {
		String nome = "Emerson";
		return nome;
	}
	
}
