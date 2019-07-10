package com.example.demo.pizzaServices;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.pizzaModels.PizzaModel;
import com.example.demo.pizzaModels.PizzaModelRepository;

@Service
public class PizzaService {

	@Autowired
	PizzaModelRepository pizzaRepositiry;

	public void novaPizza(PizzaModel pizza) {
		pizzaRepositiry.save(pizza);
	}

	public Iterable<PizzaModel> exibirCardatio() {
		return pizzaRepositiry.findAll();
	}

//	
//	public List<Integer> pegarChaves() {
//		List<Integer> chaves = new ArrayList<Integer>();
//		
//		for (Integer chave : listaPizzas.keySet()) {
//			chaves.add(chave);
//		}
//			
//		return chaves;
//	}
//	
//	public PizzaModel pegarPizza(Integer id) {
//		return listaPizzas.get(id);
//	}
	
}
