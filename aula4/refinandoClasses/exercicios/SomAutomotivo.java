package aula4.refinandoClasses.exercicios;

public class SomAutomotivo {
	private final String marca;
	private double faixa; // 87,5 a 108 FM e 500 a 1600 AM
	private String modulacao;
	private CD leitorCD;
	private String modo;
	private boolean ligado;
	private boolean repetir;

	private int musicaAtual;

	public SomAutomotivo(String marca) {
		this.marca = marca;
		this.faixa = 87.5;
		this.modo = "Radio";
		this.leitorCD = null;
		this.modulacao = "FM";
		this.ligado = false;
		this.repetir = false;
	}

	public String getMarca() {
		return this.marca;
	}

	public double getFaixa() {
		return this.faixa;
	}

	public String getModo() {
		return this.modo;
	}

	public String getModulacao() {
		return this.modulacao;
	}

	public CD getCDLeitor() {
		return this.leitorCD;
	}

	public boolean isLigado() {
		return this.ligado;
	}

	public void desliga() {
		this.ligado = false;
	}

	public void liga() {
		this.ligado = true;
	}

	public boolean isRepetir() {
		return this.repetir;
	}

	public void repetir() {
		this.repetir = true;
	}

	public void naoRepetir() {
		this.repetir = false;
	}

	public void colocaCD(CD cd) {
		if (this.leitorCD == null) {
			this.liga();
			this.leitorCD = cd;
			this.modo = "CD";
			this.musicaAtual = 0;
			//foi utilizado o sout só para mostrar que a música está tocando
			System.out.println(this.leitorCD.tocaMusica(0));
		}
	}

	public CD ejetaCD() {
		CD retorno = null;
		if (this.leitorCD != null) {
			retorno = this.leitorCD;
			this.leitorCD = null;
			if (this.modo.equals("CD"))
				this.modo = "radio";
		}
		return retorno;
	}

	public void alteraModo() {
		if (this.modo.equals("radio")) {
			this.modo = "CD";
			if (leitorCD != null) {
				//foi utilizado o sout só para mostrar que a música está tocando
				System.out.println(this.leitorCD.tocaMusica(0));
				this.musicaAtual = 0;
			}
		} else if (this.modo.equals("CD")) {
			this.modo = "auxiliar";
		} else if (this.modo.equals("auxiliar")) {
			this.modo = "radio";
		}
	}

	public void alteraModulcao() {
		if (this.modulacao.equals("FM"))
			this.modulacao = "AM";
		else
			this.modulacao = "FM";
	}

	// avancaMusica()  caso em modo CD, toca a próxima música do CD. Caso na última
	// música, executa novamente a mesma música ou vá para primeira, dependendo do
	// atributo repetir.
	public void avancaMusica() {
		if (this.modo.equals("CD")) {
			int tamanhoCD = this.leitorCD.getMusicas().length;
			int proxMusica = (this.musicaAtual + 1);
			if (proxMusica == tamanhoCD) {
				if (this.repetir)
					proxMusica = 0;
				else
					proxMusica--;
			}
			this.musicaAtual = proxMusica;
			//foi utilizado o sout só para mostrar que a música está tocando
			System.out.println(this.leitorCD.tocaMusica(proxMusica));
		}
	}

	// retrocedeMusica() executa a música anterior, caso esteja na primeira,
	// executa ela
	// novamente.
	public void retrocedeMusica() {
		if (this.modo.equals("CD")) {
			if (this.musicaAtual != 0) {

				this.musicaAtual--;
			}
			//foi utilizado o sout só para mostrar que a música está tocando
			System.out.println(this.leitorCD.tocaMusica(this.musicaAtual));
		}
	}

	public void setFaixa(double faixa) {
		if (this.modulacao.equals("FM")) {
			if (faixa >= 87.5 && faixa <= 108)
				this.faixa = faixa;
		} else if (this.modulacao.equals("AM")) {
			if (faixa >= 500 && faixa <= 1600)
				this.faixa = faixa;
		}
	}

}
