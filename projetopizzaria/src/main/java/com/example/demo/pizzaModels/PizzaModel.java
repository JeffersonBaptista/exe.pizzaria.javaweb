package com.example.demo.pizzaModels;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class PizzaModel implements Serializable{
	private static final long serilVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@NotNull
	private String nome;
	@NotNull
	private String sabor;
	@NotNull
	private String massa;
	@NotNull
	private String borda;
	@NotNull
	private double valor;
	
	public PizzaModel() {
		
	}
	public PizzaModel(Integer id, String nome, String sabor, String massa, String borda, double valor) {
		this.id = id;
		this.nome = nome;
		this.sabor = sabor;
		this.massa = massa;
		this.borda = borda;
		this.valor = valor;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	public String getMassa() {
		return massa;
	}
	public void setMassa(String massa) {
		this.massa = massa;
	}
	public String getBorda() {
		return borda;
	}
	public void setBorda(String borda) {
		this.borda = borda;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public String toString() {
		StringBuilder modelo = new StringBuilder();
		modelo.append("************\nNome da Pizza\n");
		modelo.append(this.nome+"\n____________\nIngredientes\n");
		modelo.append("Sabor "+ this.sabor);
		modelo.append("\nMassa "+ this.massa);
		modelo.append("\nBorda "+ this.borda);
		modelo.append("Valor " + this.sabor+"\n____________");
		
		return modelo.toString();
	}
	
	
	
	

}
