package com.example.demo.pizzaModels;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzaModelRepository extends CrudRepository<PizzaModel, Integer>{
	

}
