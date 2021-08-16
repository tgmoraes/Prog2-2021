package aula3.sincrono;

//implementa a ideia de uma Jarra Eletrica
//encapsulamento:
//modificadores de acesso:
//default (pacote-package):
//public: total visibilidade
//private: só tem acesso elementos da própria classe

//getters setters
//getNomeAtributo()
//setNomeAtributo()

//construtor: método especial para construir objetos
public class Jarra {
	private String marca;
	private int volumeMaximo;
	private int volumePreenchido;
	private boolean ligado;
	//construtores
	
	public Jarra() {
		this.ligado=false;
		this.volumePreenchido=0;
	}
	public Jarra(String marca) {
		this();
		this.marca=marca;
	}
	public Jarra(String marca, int volumeMaximo) {
		this(marca);
		this.setVolumeMaximo(volumeMaximo); 
	}
	
	public int getVolumePreencido() {
		return this.volumePreenchido;
	}
	public String getMarca() {
		return this.marca;
	}
	public void setMarca(String marca) {
		this.marca=marca;
	}
	public int getVolumeMaximo() {
		return this.volumeMaximo;
	}
	public void setVolumeMaximo(int volumeMaximo) {
		if(volumeMaximo>0) this.volumeMaximo = volumeMaximo;
	}
	public void liga() {
		this.ligado =true;
	}
	public void desliga() {
		this.ligado =false;
	}
	public boolean isLigado() {
		return this.ligado;
	}
	public void encher(int qtde) {
		if (qtde + this.volumePreenchido > this.volumeMaximo) {
			this.volumePreenchido = this.volumeMaximo;
		} else {
			this.volumePreenchido += qtde;
		}
	}

	public int esvaziar(int volume) {
		int retorno;
		if(volume> this.volumePreenchido) {
			retorno = this.volumePreenchido;
		} else {
			retorno = volume;
		}
		this.volumePreenchido -= retorno;
		return retorno;
	}
	public int getVolumePreenchido() {
		return this.volumePreenchido;
	}
	public String status() {
		//outra forma útil para concatenar strings
		//%d -> espaço para variável decimal (inteira)
		//%s -> espaço para variável string
		//%f -> espaço para variável real, double (float)
		return String.format("%s (%d/%d)", 
				this.marca, this.volumePreenchido, this.volumeMaximo);
		
	}
}
