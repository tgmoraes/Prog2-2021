package aula7;

public class Modulo {
	private String nome;
	private int horas;
	
	public Modulo(String nome, int horas) {
		super();
		this.nome = nome;
		this.horas = horas;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	@Override
	public String toString() {
		return this.nome+" ("+this.horas+" horas)";
	}
}
