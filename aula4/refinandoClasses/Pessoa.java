package aula4.refinandoClasses;

class Pessoa {
	private final String nome;
	private double peso;
	private static int populacao=0;
	
	
	public Pessoa(String nome, double peso) {
		this.nome=nome;
		this.peso=peso;
		Pessoa.populacao++;
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setPeso(double peso) {
		this.peso=peso;
	}
	public double getPeso() {
		return this.peso;
	}
	@Override
	public String toString() {
		return "Nome: "+this.nome+" - "+this.peso+"Kg";
	}
	@Override
	public boolean equals(Object o) {
		if(o==null) return false;
		if(!(o.getClass().isInstance(this))) return false;
		if(this==o)return true;
		
		Pessoa param = (Pessoa)o;
		return (this.peso==param.peso && this.nome.equals(param.nome));
	}
	public static int getPopulacao() {
		return Pessoa.populacao;
	}
}




