package com.example.demo.pizzaControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.pizzaServices.PizzaService;

@Controller
public class PizzaController {

	@Autowired
	private PizzaService pizzaService;

	@GetMapping("/")
	public ModelAndView exibirCardapio() {
		ModelAndView modelAnsView = new ModelAndView("pizzaria.html");		
		return modelAnsView;
	}
	
	@GetMapping("/cardapio")
	public ModelAndView cardapio() {
		ModelAndView modelAnsView = new ModelAndView("cardapio.html");
		modelAnsView.addObject("cardapio", pizzaService.exibirCardatio());
		return modelAnsView;
	}
	
	@GetMapping("/criarpizza")
	public ModelAndView criarPizza() {
		ModelAndView modelAnsView = new ModelAndView("criarpizza.html");
		return modelAnsView;
	}
}
