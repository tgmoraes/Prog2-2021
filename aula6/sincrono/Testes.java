package aula6.sincrono;


public class Testes {

	public static void main(String[] args) {
		Vendedor maria = new Vendedor("Maria Julia", 1100);
		Vendedor joao = new Vendedor("João zinho 30", 1130);
		Vendedor sofrencio = new Vendedor("Colorado cansado", 1250);
		Vendedor sofrida = new Vendedor("Godofrida Silva", 1100);
		
		//vender
		maria.vende(50);
		maria.vende(500);
		maria.vende(230);
		maria.vende(1800);

		joao.vende(5000);
		joao.vende(50000);
		
		Diretor dir1 = new Diretor("Bruno Tomaz", 5000, "32323232");
		Diretor dir2 = new Diretor("Comendador José Alfredo", 7500, "12345678");
		
		System.out.println(dir1 instanceof Funcionario);
		
		
		Loja lojin = new Loja("Renner");
		
		lojin.contrata(maria);
		lojin.contrata(joao);
		lojin.contrata(sofrencio);
		lojin.contrata(sofrida);
		lojin.contrata(dir1);
		lojin.contrata(dir2);
		
		double totalGasto= lojin.getTotalFolhaSalarial();
		System.out.println(totalGasto);

	}

}
