package com.example.demo.pizzaServices;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.demo.pizzaModels.PizzaModel;

@Service
public class PizzaService {

	Map<Integer, PizzaModel> listaPizzas = new HashMap<Integer, PizzaModel>() {
		{
			put(1, new PizzaModel("Eu que mando", "Calabresa sem cebola", "normal", "com recheiro", 15.00));
			put(2, new PizzaModel("Da casa", "Bacon com mussarela", "normal", "sem recheio", 20.00));

		}

	};

	public Collection<PizzaModel> exibirCardatio() {
		return this.listaPizzas.values();
	}

	public void novaPizza(PizzaModel pizzaModel) {
		listaPizzas.put(listaPizzas.size() + 1, pizzaModel);

	}
	public List<Integer> pegarChaves() {
		List<Integer> chaves = new ArrayList<Integer>();
		
		for (Integer chave : listaPizzas.keySet()) {
			chaves.add(chave);
		}
			
		return chaves;
	}
	
	public PizzaModel pegarPizza(Integer id) {
		return listaPizzas.get(id);
	}
	
}
