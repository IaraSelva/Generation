package POO;

public class aviao {
	
	private String classeVoo;
	private int numeroVoo;
	private String aeroportoSaida;
	private String aeroportoChegada;
	
	public aviao(int numero, String classe, String decola, String pousa) 
	{
		this.numeroVoo = numero;
		this.classeVoo = classe;
		this.aeroportoSaida = decola;
		this.aeroportoChegada = pousa;
	}
	
	public void imprimirDadosVoo() {
		System.out.println("Voo "+ numeroVoo + " classe "+ classeVoo+ " saindo de "+ aeroportoSaida + " com destino a "+ aeroportoChegada);
	}
		

}
