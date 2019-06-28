package com.example.demo.pizzaControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.pizzaModels.PizzaModel;
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
		modelAnsView.addObject("chaves", pizzaService.pegarChaves());
		return modelAnsView;
	}
	
	@GetMapping("/criarpizza")
	public ModelAndView criarPizza() {
		ModelAndView modelAnsView = new ModelAndView("criarpizza.html");
		return modelAnsView;
	}
	@PostMapping("/criarpizza")
	public String novoPost(PizzaModel pizzaModel) {
		pizzaService.novaPizza(pizzaModel);
		return "/criarpizza";
	}
	
	@GetMapping("/pizza/{id}")
	public ModelAndView pegarPizza(@PathVariable Integer id) {
		ModelAndView modelAnsView = new ModelAndView("pizza.html");
		modelAnsView.addObject("pizza", pizzaService.pegarPizza(id));
		return modelAnsView;
	}
}
