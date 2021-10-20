package aula5.outroExemplo;

import java.util.ArrayList;

public class TesteArray {
	public static void main(String[] args) {
		int[] vet = new int[10];
		//System.out.println(vet[1]);
		vet[0] = 8;
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		lista.add(8);
		lista.add(7);
		lista.add(80);
		lista.add(1, 5);

		System.out.println(lista.size());
		System.out.println("pos 1:"+lista.remove(1));
		
		for(Integer elem: lista) {
			System.out.println(elem);
		}
		
	}
}
