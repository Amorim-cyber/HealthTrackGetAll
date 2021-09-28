package br.com.healthtrack.entities;

public class Instrutor {

	private String nome;
	private Integer idade;
	private Integer anosExp;
	private Double rating;
	
	public Instrutor(String nome, Integer idade, Integer anosExp, Double rating) {
		this.nome = nome;
		this.idade = idade;
		this.anosExp = anosExp;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "[\n"+
				"\t\t Nome = " + nome + ",\n"+ 
				"\t\t Idade = " + idade + " anos,\n"+ 
				"\t\t Experiência = " + anosExp + " anos,\n"+
				"\t\t Rating = " + Double.toString(rating).replace(".", ",") + "\n"+
				"\t\t]";
	}
	
	
	
	
}
