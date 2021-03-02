package POO;

import java.util.*;

public class cliente {
	
	private String nomeCliente;
	private String produto;
	private int dataCompra;
	
	public cliente(String nome, String compra, int dia) {
		this.nomeCliente = nome;
		this.produto = compra;
		this.dataCompra = dia;
	}
	
	public void imprimirInfo() {
		System.out.println(nomeCliente + " comprou " + produto + " no dia " + dataCompra);
	}

}
