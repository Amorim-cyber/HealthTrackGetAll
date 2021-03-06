package br.com.healthtrack.entities.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.healthtrack.entities.Atividade;
import br.com.healthtrack.mock.Mock;

public class AtividadeDAO {

	public void getAll() {
		
		List<Atividade> listaAtividades = new ArrayList<Atividade>();
		
		Mock m1 = new Mock();
		listaAtividades.add(new Atividade(m1.getAcademia(),
											m1.getEquip(),
											m1.getExercicios(),
											m1.getInstrutor(),
											m1.getLocal(),
											m1.getPlano(),
											m1.getSegmento(),
											m1.getTurno(),
											m1.getUsuario(),
											m1.getVideo()));
		
		Mock m2 = new Mock();
		listaAtividades.add(new Atividade(m2.getAcademia(),
											m2.getEquip(),
											m2.getExercicios(),
											m2.getInstrutor(),
											m2.getLocal(),
											m2.getPlano(),
											m2.getSegmento(),
											m2.getTurno(),
											m2.getUsuario(),
											m2.getVideo()));
		
		Mock m3 = new Mock();
		listaAtividades.add(new Atividade(m3.getAcademia(),
											m3.getEquip(),
											m3.getExercicios(),
											m3.getInstrutor(),
											m3.getLocal(),
											m3.getPlano(),
											m3.getSegmento(),
											m3.getTurno(),
											m3.getUsuario(),
											m3.getVideo()));
		
		Mock m4 = new Mock();
		listaAtividades.add(new Atividade(m4.getAcademia(),
											m4.getEquip(),
											m4.getExercicios(),
											m4.getInstrutor(),
											m4.getLocal(),
											m4.getPlano(),
											m4.getSegmento(),
											m4.getTurno(),
											m4.getUsuario(),
											m4.getVideo()));
		
		Mock m5 = new Mock();
		listaAtividades.add(new Atividade(m5.getAcademia(),
											m5.getEquip(),
											m5.getExercicios(),
											m5.getInstrutor(),
											m5.getLocal(),
											m5.getPlano(),
											m5.getSegmento(),
											m5.getTurno(),
											m5.getUsuario(),
											m5.getVideo()));
		
		
		
		int i = 1;
		for(Atividade atividade : listaAtividades) {
			System.out.println(">>>>>>>>>    ATIVIDADE  ("+i+")  <<<<<<<<<<\n");
			
			System.out.println(atividade + "\n");
			
			i++;
		}
		
	}

}
