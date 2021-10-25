package aula6.sincrono;


public class Funcionario{
	private final String nome;
	private double salarioBase;
	
	public Funcionario(String nome, double salarioBase) {
		this.nome = nome;
		this.salarioBase = salarioBase;
	}
	public String getNome() {
		return this.nome;
	}
	public double getSalarioBase() {
		return this.salarioBase;
	}
	public double getSalarioFinal() {
		return this.salarioBase;
	}
	
	@Override
	public String toString() {
		return "nome: "+ this.nome;
	}
	
}
