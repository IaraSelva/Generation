package POO_herança;

public class fornecedor extends pessoa {
	
	private double valorCredito;
	private double valorDivida;
	
	public fornecedor(String nome, String endereco, String telefone, double credito, double divida) {
		super(nome, endereco, telefone);
		this.valorCredito = credito;
		this.valorDivida = divida;
	}
	
	public void obterSaldo() {
		double d;
		d = valorCredito - valorDivida;
		System.out.println("Dívida = " + d);
	}
	
	 public void dados() {
		 super.mostraDados();
		 this.obterSaldo();
	}

	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
}
