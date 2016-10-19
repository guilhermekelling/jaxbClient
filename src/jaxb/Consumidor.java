package jaxb;


public class Consumidor {
	public static void main(String[] args) {
		// Service
		GeradorService service = new GeradorService();
		
		// Proxy
		Gerador proxy = service.getGeradorPort();
		
		// Consumindo
		double numero = proxy.geraNumero();
		System.out.println(numero);
	}

}