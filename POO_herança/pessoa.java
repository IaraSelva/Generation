package POO_herança;

public class pessoa {
	
	private String nome;
	private String endereco;
	private String telefone;
	public String nascimento;
	public boolean fumante;
	public int numFilhos;
	
	public pessoa(String nome, String endereco, String telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	public pessoa(String nome, String endereco, String telefone, String nascimento, boolean fumante, int numFilhos) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.nascimento = nascimento;
		this.fumante = fumante;
		this.numFilhos = numFilhos;
	}

	public void mostraDados() {
		System.out.println("Nome: "+nome+"\nEndereço: "+endereco+"\nTelefone: "+telefone);
	}
	
	public void fumante(String sn) {
		if (sn == "s") {
			setFumante(true);
		}else if(sn == "n") {
			setFumante(false);
		}
	}
	
	public void mostrarAniversário() {
		System.out.println(getNascimento());
	}
	
	/*public void nomeFilhos() {
		int i;
		int filhos [];
		if (numFilhos > 0) {
			for (i=0; i <= numFilhos; i++) {
				System.out.println("Digite o nome do filho: ");
				
			}
		}
	}*/


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getNascimento() {
		return nascimento;
	}


	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}


	public boolean isFumante() {
		return fumante;
	}


	public void setFumante(boolean fumante) {
		this.fumante = fumante;
	}


	public int getNumFilhos() {
		return numFilhos;
	}


	public void setNumFilhos(int numFilhos) {
		this.numFilhos = numFilhos;
	}
	
	
	
}



	
	
