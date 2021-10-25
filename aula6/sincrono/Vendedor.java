package aula6.sincrono;

public class Vendedor extends Funcionario {
	private double totalEmVendas; // quantidade total em reais vendida
	private int numVendas; // quantidade de vendas

	public Vendedor(String nome, double salarioBase) {
		super(nome, salarioBase);
		this.numVendas = 0;
		this.totalEmVendas = 0;
	}
	public double getTotalEmVendas() {
		return this.totalEmVendas;
	}
	public int getNumVendas() {
		return this.numVendas;
	}
	public void vende(double valorVenda) {
		this.totalEmVendas += valorVenda;
		this.numVendas++;
	}

	@Override
	public double getSalarioFinal() {
		// um bônus de 1 real por venda + 0,1% do valor 
		//das vendas + salario base
		return this.getSalarioBase() + this.totalEmVendas * 0.001 
				+ this.numVendas;
	}

}
