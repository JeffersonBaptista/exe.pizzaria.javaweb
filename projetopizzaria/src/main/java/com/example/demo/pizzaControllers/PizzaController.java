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

	@GetMapping
	public ModelAndView exibirCardapio() {
		ModelAndView modelAnsView = new ModelAndView("pizzaria.html");
		modelAnsView.addObject("cardapio", pizzaService.exibirCardatio());
		return modelAnsView;
	}
}
