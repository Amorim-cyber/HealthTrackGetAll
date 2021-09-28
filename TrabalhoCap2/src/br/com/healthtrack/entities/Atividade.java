package br.com.healthtrack.entities;

public class Atividade {
	
	private Academia academia;
	private Equipamento equipamento;
	private Exercicio exercicio;
	private Instrutor instrutor;
	private LocalTreino local;
	private Plano plano;
	private SegmentoCorporal segmento;
	private Turno turno;
	private Usuario usuario;
	private Video video;
	
	
	
	public Atividade(Academia academia, Equipamento equipamento, Exercicio exercicio, Instrutor instrutor,
			LocalTreino local, Plano plano, SegmentoCorporal segmento, Turno turno, Usuario usuario, Video video) {
		this.academia = academia;
		this.equipamento = equipamento;
		this.exercicio = exercicio;
		this.instrutor = instrutor;
		this.local = local;
		this.plano = plano;
		this.segmento = segmento;
		this.turno = turno;
		this.usuario = usuario;
		this.video = video;
	}



	@Override
	public String toString() {
		return "Atividade [\n"+
				"\t Exercício = " + exercicio + ",\n"+
				"\t Segmento Muscular = " + segmento.getValue() + ",\n"+
				"\t Equipamento = " + equipamento + ",\n"+
				"\t Vídeo = " + video + ",\n"+
				"\t Usuário = " + usuario + ",\n"+
				"\t Plano = " + plano.getValue() + ",\n"+
				"\t Turno = " + turno.getValue() + ",\n"+
				"\t Instrutor = " + instrutor + ",\n"+
				"\t Academia = " + academia.getValue() + ",\n"+
				"\t Local = " + local + "\n"+
				"]";
	}
	
	

}
