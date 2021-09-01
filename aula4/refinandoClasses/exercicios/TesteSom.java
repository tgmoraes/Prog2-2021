package aula4.refinandoClasses.exercicios;

import java.time.LocalDate;
import java.time.LocalDateTime;

import aula3.sincrono.Jarra;

public class TesteSom {
	public static void main(String[] args) {
		
		String[] musicas = {"musica 1", "musica 2","musica 3"};
		
		
		CD  cd1 = new CD("cd 1", musicas);
		
		SomAutomotivo som = new SomAutomotivo("sony");
		som.colocaCD(cd1);
		som.retrocedeMusica();
		som.avancaMusica();
		som.avancaMusica();
		som.retrocedeMusica();
		som.avancaMusica();
		som.avancaMusica();
		System.out.println(som.getModo());
		som.alteraModo();
		System.out.println(som.getModo());
		som.alteraModo();
		System.out.println(som.getModo());
		som.alteraModo();
		System.out.println(som.getModo());
	}
}
