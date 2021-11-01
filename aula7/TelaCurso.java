package aula7;

import java.util.Scanner;

public class TelaCurso {
	private String[] opcoes;
	private Scanner inp;
	
	public TelaCurso(String[] opcoes) {
		this.opcoes = opcoes;
		inp = new Scanner(System.in);
	}
	private void printaMenu() {
		System.out.println("<-- Menu -->");
		for (int i = 0; i < opcoes.length; i++) {
			System.out.println("(" + i + ")" + opcoes[i]);
		}
		System.out.println("Digite a opcao desejada (de 0 a " + (opcoes.length-1) + "):");
	}

	public int montaTelaMenu() {
		
		int ret = -1;
		while (ret < 0 || ret >= this.opcoes.length) {
			this.printaMenu();
			ret = inp.nextInt();
		}
		//para limpar caracter fim de linha '\n'
		inp.nextLine();
		return ret;
	}
	public Curso iniciaCurso() {		
		System.out.print("Informe o nome do curso:");
		String nome = inp.nextLine();
		System.out.print("Informe a área do curso:");
		String area = inp.nextLine();
		System.out.print("Curso criado com sucesso!\n");
		Curso curso = new Curso(nome, area);
		
		return curso;
	}
	public void adicionaModulo(Curso curso) {
		System.out.print("digite o nome do módulo:");
		String nome = inp.nextLine();
		System.out.print("digite quantas horas tem o módulo:");
		int horas = inp.nextInt();
		curso.addModulo(nome, horas);
	}
	public void removerModulo(Curso curso) {
		System.out.print("digite a posição que deseja retirar (0 a "
							+(curso.getNumModulos()-1)+")");
		int pos = inp.nextInt();
		curso.removeModulo(pos);
		
	}
	public void printaCurso(Curso curso) {
		System.out.println(curso);
	}
	public void printaModulo(Curso curso) {
		System.out.print("digite a posição do módulo (0 a "
				+(curso.getNumModulos()-1)+")");
		int pos = inp.nextInt();
		System.out.println(curso.getModulo(pos));
	}
}
