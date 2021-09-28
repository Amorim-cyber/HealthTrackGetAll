package br.com.healthtrack.entities;

public class Video {
	
	private String titulo;
	private String duracao;
	private String url;
	
	public Video(String titulo, String duracao, String url) {
		this.titulo = titulo;
		this.duracao = duracao;
		this.url = url;
	}

	@Override
	public String toString() {
		return "[\n"+
				"\t\t T�tulo = " + titulo + ",\n"+
				"\t\t Dura��o = " + duracao + ",\n"+
				"\t\t Url = " + url + "\n"+
				"\t\t]";
	}
	
	

}
