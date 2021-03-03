package poo;

public class testeContaBanco {
	public static void main (String args[]) {
		
		contaBanco conta01 = new contaBanco();
		
		conta01.setDono("Adriana Andrade");
		conta01.setNumConta(0013);
		
		conta01.abrirConta("cp");
		conta01.depositar(200.0);
		conta01.sacar(100.0);
		conta01.pagarMensal();
		conta01.fecharConta();
		conta01.sacar(200.0);
		conta01.fecharConta();
		conta01.exibirSaldo();
	}

}
