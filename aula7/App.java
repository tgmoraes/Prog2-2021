package aula7;

import java.util.Scanner;



public class App {
	
	public static void main(String[] args) {
		System.out.println("Olá, bem-vindo ao Sia capenga!\n");
		String[] opcoes = { "sair", "adicionar módulo", "remover módulo",
		"ver curso", "ver módulo"}; 
		TelaCurso tc = new TelaCurso(opcoes);
		Curso curso = tc.iniciaCurso();
		// inicializa a variavel com qualquer valor diferente de zero
		int opcaoEscolhida = -1; 
		while (opcaoEscolhida != 0) {
			opcaoEscolhida = tc.montaTelaMenu();
			switch (opcaoEscolhida) {
			case 1:
				tc.adicionaModulo(curso);
				break;
			case 2:
				tc.removerModulo(curso);
				break;
			case 3:
				tc.printaCurso(curso);
				break;
			case 4:
				tc.printaModulo(curso);
				break;
			}
		}
		System.out.println("Tchau! Até mais!");
	}
}
