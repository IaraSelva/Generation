package projetoMod1;

		public class PessoasTeste {

			public static void main(String[] args) {

				Postos p1 []= new Postos[7];
				
				for(int i=0; i<p1.length ;i++) {
					p1[i]= new Postos(null);
					p1[i].cadastrarPessoa();
					p1[i].setSenha();
					p1[i].listaPostos();
					p1[i].escolhaPosto();
					//teste[i].verificaCad();
					//teste[i].setStatusVacina();
							
			}
	}
}

