package br.com.healthtrack.mock;

import br.com.healthtrack.entities.Academia;
import br.com.healthtrack.entities.Equipamento;
import br.com.healthtrack.entities.Exercicio;
import br.com.healthtrack.entities.Instrutor;
import br.com.healthtrack.entities.LocalTreino;
import br.com.healthtrack.entities.Plano;
import br.com.healthtrack.entities.SegmentoCorporal;
import br.com.healthtrack.entities.Turno;
import br.com.healthtrack.entities.Usuario;
import br.com.healthtrack.entities.Video;

public class Mock {
	
	private int indexAcademias;
	private int indexSegmentos;
	private int indexPlanos;
	private int indexTurnos;
	
	

	public Mock() {
		indexAcademias = (int)Math.floor(Math.random()*(5));
		indexSegmentos = (int)Math.floor(Math.random()*(5));
		indexPlanos = (int)Math.floor(Math.random()*(4));
		indexTurnos = (int)Math.floor(Math.random()*(3));
	}

	Academia[] academias = {
			Academia.SMARTFIT,
			Academia.BODYTECH,
			Academia.COMPANHIAATHLETICA,
			Academia.BIORITMO,
			Academia.IRONBOX
	};
	
	LocalTreino[] locais = {
			new LocalTreino("Av. Dom H?lder C?mara",5229,"Cachambi",
					"Rio de Janeiro","Rio de Janeiro","20771-001"),
			new LocalTreino("Av. Am?rico Buaiz",200,"Enseada do Su?",
					"Vit?ria","Espirito Santo","29050-902"),
			new LocalTreino("Av. Roque Petroni J?nior",1089,"Ch?cara Santo Ant?nio (Zona Sul)",
					"S?o Paulo","S?o Paulo","04707-000"),
			new LocalTreino("R. Dr. Washington Lu?s",55,"Centro",
					"Cabo de Santo Agostinho","Pernambuco","54510-440"),
			new LocalTreino("Av. do Pep?",600,"Barra da Tijuca",
					"Rio de Janeiro","Rio de Janeiro","22620-170")
	};
	
	SegmentoCorporal[] segmentos = {
			SegmentoCorporal.PEITO,
			SegmentoCorporal.BRACOS,
			SegmentoCorporal.COSTAS,
			SegmentoCorporal.PERNAS,
			SegmentoCorporal.ABDOMEN
	};
	
	Video[] videos = {
			new Video("Supino Reto com Barra - Exerc?cio para Peito","0:59",
					"https://www.youtube.com/watch?v=Kr2erpSyu3M"),
			new Video("COMO FAZER TR?CEPS TESTA COM BARRA W - Fisioprev","1:06",
					"https://www.youtube.com/watch?v=-zCw46DgI5M"),
			new Video("Exerc?cio 5 Kettlebell Domyos - Gl?teos/Costas - Exclusividade Decathlon","0:20",
					"https://www.youtube.com/watch?v=xT45IujhS40"),
			new Video("Agachamento livre com halteres","1:14",
					"https://www.youtube.com/watch?v=taK1dUUT2_I"),
			new Video("Treino top abdominal com bola","0:53",
					"https://www.youtube.com/watch?v=KcCA0PzLKA8")
	};
	
	Equipamento[] equipamentos = {
			new Equipamento("Barra Reta + 4 Anilhas de 10 kg",40d),
			new Equipamento("Barra W + 2 Anilhas de 5 kg",10d),
			new Equipamento("Kettlebell de 10 kg",10d),
			new Equipamento("2 Halteres de 10 kg",20d),
			new Equipamento("Bola com peso de 20 kg",20d)
			
	};
	
	Exercicio[] exercicios = {
			new Exercicio("Supino Reto com Barra",3,10),
			new Exercicio("Tr?ceps Testa com Barra W",3,20),
			new Exercicio("Kettlebell - Gl?teos/Costas",3,12),
			new Exercicio("Agachamento livre com halteres",4,12),
			new Exercicio("Abdominal com bola",3,10)
	};
	
	Plano[] planos = {
			Plano.ANUAL,
			Plano.SEMESTRAL,
			Plano.TRIMESTRAL,
			Plano.MENSAL
	};
	
	Usuario[] usuarios = {
			new Usuario("Carlos Alberto",30,98.5),
			new Usuario("Renato Lorenzo",58,81.75),
			new Usuario("Cristina Albuquerque",44,75d),
			new Usuario("Maria de F?tima",18,68.85)
	};
	
	Instrutor[] instrutores = {
			new Instrutor("Junior Almeida",48,15,4d),
			new Instrutor("Carolina Freitas",32,4,4.5),
			new Instrutor("Victor Bastos",60,25,3.8),
			new Instrutor("Vit?ria Estrela",36,6,3d)
	};
	
	Turno[] turnos = {
			Turno.MANHA,
			Turno.TARDE,
			Turno.NOITE
	};
	
	public Academia getAcademia(){
		return academias[indexAcademias];
	}
	
	public LocalTreino getLocal() {
		return locais[indexAcademias];
	}
	
	public SegmentoCorporal getSegmento() {
		return segmentos[indexSegmentos];
	}
	
	public Video getVideo() {
		return videos[indexSegmentos];
	}
	
	public Equipamento getEquip() {
		return equipamentos[indexSegmentos];
	}
	
	public Exercicio getExercicios() {
		return exercicios[indexSegmentos];
	}
	
	public Plano getPlano() {
		return planos[indexPlanos];
	}
	
	public Usuario getUsuario() {
		return usuarios[indexPlanos];
	}
	
	public Instrutor getInstrutor() {
		return instrutores[indexPlanos];
	}
	
	public Turno getTurno() {
		return turnos[indexTurnos];
	}
	
}
