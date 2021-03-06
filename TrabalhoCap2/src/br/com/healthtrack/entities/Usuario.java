package br.com.healthtrack.entities;

public class Usuario {
	
	private String nome;
	private Integer idade;
	private Double peso;
	
	public Usuario(String nome, Integer idade, Double peso) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "[\n"+
				"\t\t Nome = " + nome + ",\n"+
				"\t\t Idade = " + idade + " anos,\n"+ 
				"\t\t Peso = " + Double.toString(peso).replace(".", ",") + " KG\n"+ 
				"\t\t]";
	}
	
	
	

}
