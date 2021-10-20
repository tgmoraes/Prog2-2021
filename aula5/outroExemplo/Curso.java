package aula5.outroExemplo;

import java.util.ArrayList;

// agregação  muitos para muitos
public class Curso {
	private final String nome;
	private final String area;
	// atributo com a agregacao para autores
	private ArrayList<Estudante> estudantes;
	private ArrayList<Modulo> modulos;
	
	public Curso(String nome, String area) {
		this.estudantes = new ArrayList<Estudante>();
		this.modulos = new ArrayList<Modulo>();
		this.nome = nome;
		this.area = area;
	}
	
	public void addModulo(String nome, int horas){
		this.modulos.add(new Modulo(nome, horas));
	}
	public Modulo getModulo(int pos) {
		return this.modulos.get(pos);
	}
	public int getTotalHoras() {
		int acum =0;
		for(Modulo elem: this.modulos) {
			acum+= elem.getHoras(); 
		}
		return acum;
	}
	
	
	
	
	
 	public String getNome() {
		return nome;
	}
	public String getArea() {
		return area;
	}
	public void matricula(Estudante e) {
		this.estudantes.add(e);
		//this.estudantes[this.estudantesQtde] = e;
		//this.estudantesQtde++;
	}
	public Estudante getEstudante(int pos) {
		return this.estudantes.get(pos);
		//return this.estudantes[pos];
	}
	public int getTotalEstudantes() {
		return this.estudantes.size();
		//return this.estudantesQtde;
	}
	public boolean excluiEstudante(Estudante e) {
		return this.estudantes.remove(e);
//		boolean achou = false;
//		int i;
//		for(i =0;i<this.estudantesQtde;i++) {
//			if(this.estudantes[i].equals(e)) {
//				achou = true;
//				break;
//			}
//		}
//		if(achou) {
//			for(int j=i;j<this.estudantesQtde-1;j++) {
//				this.estudantes[j] = this.estudantes[j+1];
//			}
//			this.estudantesQtde --;
//		}
//		return achou;
	}

	
}
