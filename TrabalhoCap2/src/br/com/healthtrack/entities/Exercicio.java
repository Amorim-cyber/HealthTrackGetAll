package br.com.healthtrack.entities;

public class Exercicio {
	
	private String nome;
	private Integer numSets;
	private Integer numRepeticoes;
	
	public Exercicio(String nome, Integer numSets, Integer numRepeticoes) {
		this.nome = nome;
		this.numSets = numSets;
		this.numRepeticoes = numRepeticoes;
	}

	@Override
	public String toString() {
		return "[\n"+
				"\t\t Nome = " + nome + ",\n"+
				"\t\t N?mero de blocos = " + numSets + ",\n"+
				"\t\t N?mero de repeti??es = " + numRepeticoes + "\n"+
				"\t\t]";
	}
	
	

}
