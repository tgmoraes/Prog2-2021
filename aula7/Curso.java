package aula7;

import java.util.ArrayList;


public class Curso {
	private final String nome;
	private final String area;
	private ArrayList<Modulo> modulos;
	
	public Curso(String nome, String area) {
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
	public int getNumModulos() {
		return this.modulos.size();
	}

	public void removeModulo(int pos) {
		this.modulos.remove(pos);
	}
	@Override
	public String toString() {
		return String.format("Curso %s - area: %s (%d modulos)",
				this.nome, this.area, this.getNumModulos());
	}
}
