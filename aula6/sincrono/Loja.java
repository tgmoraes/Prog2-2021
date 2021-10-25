package aula6.sincrono;

import java.util.ArrayList;

public class Loja {
	private final String nome;
	private final ArrayList<Funcionario> funcionarios; //agregação
	
	public Loja(String nome) {
		this.nome=nome;
		this.funcionarios = new ArrayList<Funcionario>();
	}
	public String getNome() {
		return this.nome;
	}
	public void contrata(Funcionario f) {
		funcionarios.add(f);
	}
	public double getTotalFolhaSalarial() {
		double acumulador = 0 ;
		for(Funcionario f: funcionarios) {
			acumulador+= f.getSalarioFinal();
		}
		return acumulador;
	}
}
