package aula5.outroExemplo;

public class Estudante {
	private final String nome;
	private final String cpf;

	public Estudante(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	
	@Override
	public String toString() {
		return this.nome+" - "+this.cpf;
	}
}
