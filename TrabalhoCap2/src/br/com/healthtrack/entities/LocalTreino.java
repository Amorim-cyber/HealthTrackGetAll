package br.com.healthtrack.entities;

public class LocalTreino {

	private String endereco;
	private Integer numero;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;
	
	public LocalTreino(String endereco, Integer numero, String bairro, String cidade, String estado, String cep) {
		this.endereco = endereco;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
	}

	@Override
	public String toString() {
		return "[\n" + 
				"\t\t Endereço = " +endereco + ",\n"+
				"\t\t Número = " + numero + ",\n"+
				"\t\t Bairro = " + bairro + ",\n"+ 
				"\t\t Cidade = " + cidade + ",\n"+
				"\t\t Estado = " + estado + ",\n"+
				"\t\t Cep = " + cep + "\n"+ 
				"\t\t]";
	}
	
	
	
}
