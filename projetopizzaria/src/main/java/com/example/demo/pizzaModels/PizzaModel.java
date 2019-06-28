package com.example.demo.pizzaModels;

public class PizzaModel {
	
	private String nome;
	private String sabor;
	private String massa;
	private String borda;
	private double valor;
	
	public PizzaModel() {
		
	}
	public PizzaModel(String nome, String sabor, String massa, String borda, double valor) {
		this.nome = nome;
		this.sabor = sabor;
		this.massa = massa;
		this.borda = borda;
		this.valor = valor;
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
