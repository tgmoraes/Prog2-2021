package aula6.assincrono.outroPacote;

import aula6.assincrono.Estudante;

public  class EstudanteSuperior extends Estudante{
	
	public EstudanteSuperior(String nome, String matricula) {
		super(nome, matricula); // chamando construtor da classe pai(superclasse) Estudante
	}
	@Override
	public String quemSou() {
		String retorno = "Sou ";
		retorno+= this.nome;	// mesmo fora do pacote, consegue usar pois é protected e recebe por herança indireta
		retorno+= " e sou estudante do ensino superior!";
		return retorno;
	}
}
