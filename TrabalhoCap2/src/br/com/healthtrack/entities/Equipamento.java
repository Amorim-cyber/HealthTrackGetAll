package br.com.healthtrack.entities;

public class Equipamento {

	private String nome;
	private Double carga;
	
	public Equipamento(String nome, Double carga) {
		this.nome = nome;
		this.carga = carga;
	}

	@Override
	public String toString() {
		return "[\n"+
				"\t\t Nome = " + nome + ",\n"+
				"\t\t Carga = " + Double.toString(carga).replace(".", ",") + " KG\n"+ 
				"\t\t]";
	}
	
	
	
}
