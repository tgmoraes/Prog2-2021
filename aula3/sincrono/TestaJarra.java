package aula3.sincrono;
//lógica da classe Jarra:

public class TestaJarra {
	public static void main(String[] args) {
		Jarra jar = new Jarra();
		Jarra var = new Jarra("Philips",1500);
		
		System.out.println(var.getMarca());
		
		Jarra jarra2 = new Jarra("Walita", 2000);
		
		System.out.println("enchendo a jarra...");		
		System.out.println(jarra2.status());
		jarra2.encher(1000);
		System.out.println(jarra2.status());
		jarra2.encher(1500);
		System.out.println(jarra2.status());
		jarra2.encher(1000);
		System.out.println(jarra2.getVolumePreenchido());
		
		System.out.println(jarra2.status());
	
		
		
	}
}
