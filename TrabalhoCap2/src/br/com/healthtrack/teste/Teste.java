package br.com.healthtrack.teste;


import java.util.Scanner;

import br.com.healthtrack.entities.dao.AtividadeDAO;

public class Teste {

	public static void main(String[] args) {
		
		System.out.println("x-----------------------------------------x");
		System.out.println("|               ATIVIDADES                |");
		System.out.println("x-----------------------------------------x");
		System.out.println();
		System.out.print("Deseja visualizar todas as atividades?(s/n) ");
		Scanner sc = new Scanner(System.in);
		String op = sc.next();
		
		switch(op.toLowerCase()) {
			case "s":{
				
				new AtividadeDAO().getAll();
				
				break;
			}
			case "n":{
				System.out.println("Tudo bem. At� a proxima!");
				break;
			}
			default:
				System.out.println("Erro! Recome�e a aplica��o");
			
		}
		
		sc.close();
		
	}

}
