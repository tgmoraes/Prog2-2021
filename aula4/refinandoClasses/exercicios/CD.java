package aula4.refinandoClasses.exercicios;

public class CD {
	 private final String nome;
	 private String[] musicas;
	 
	 public CD(String nome, String[] musicas) {
		 this.nome = nome;
		 this.musicas = musicas;
	 }
	 public String getNome() {
		 return this.nome;
	 }
	 public String[] getMusicas() {
		 return this.musicas;
	 }
	 public void setMusicas(String[] musicas) {
		 this.musicas = musicas;
	 }
	 public String tocaMusica(int pos) {
		 return  "Tocando "+this.musicas[pos]+" :D";
	 }
}
//DESAFIO: Projeto 2: rádio (classes para simular o rádio de um carro que toca CD’s ou rádio
//AM/FM)
