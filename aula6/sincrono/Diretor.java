package aula6.sincrono;


public class Diretor extends Funcionario {
	
	private String telefone;
	public Diretor(String nome, double salarioBase, String telefone) {
		super(nome, salarioBase);
		this.setTelefone(telefone);
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	@Override
	public String toString() {
		return super.toString()+" ("+this.telefone+")";
	}
}
