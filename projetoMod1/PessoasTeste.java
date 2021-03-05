package projetoMod1;

		public class PessoasTeste {

			public static void main(String[] args) {

				Postos p1 []= new Postos[8];
				Vacina v1 = new Vacina();
				
				v1.printVacina();
				
				for(int i=0; i<p1.length ;i++) {
					p1[i]= new Postos(null);
					p1[i].cadastrarPessoa();
					p1[i].setSenha();
					p1[i].listaPostos();
					p1[i].escolhaPosto();
					//p1[i].verificaCad();
					p1[i].setStatusVacina();
					p1[i].calendario();
			}
	}
}

