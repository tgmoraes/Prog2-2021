package aula5.outroExemplo;

public class TesteCurso {

	public static void main(String[] args) {
		Estudante joao = new Estudante("João Silva", "125.564.987-98");
		Estudante maria = new Estudante("Maria Lurdes", "789.456.123-98");
		Estudante carlos = new Estudante("Carlos", "111.522.464-88");
		Estudante mario = new Estudante("Mario Luiz", "111.552.444-88");
		Estudante julia = new Estudante("Julia mas não lia", "121.522.444-88");
		Estudante ana = new Estudante("Ana Maria", "111.522.404-88");
		
		Curso progJava = new Curso("Progração OO com Java", "computação");
		Curso progPHP = new Curso("Programação Web com PHP", "computação");
		
		progJava.matricula(joao);
		progJava.matricula(maria);
		progJava.matricula(carlos);
		progJava.matricula(ana);

	
//		for(int i=0;i<progJava.getTotalEstudantes() ;i++) {
//			System.out.println(progJava.getEstudante(i));
//		}
		
		progJava.addModulo("Introducao a OO", 10);
		progJava.addModulo("encapsulamento", 8);
		
		System.out.println(progJava.getModulo(1));
		System.out.println(progJava.getTotalHoras());
	}

}
