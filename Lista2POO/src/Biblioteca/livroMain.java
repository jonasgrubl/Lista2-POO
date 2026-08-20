
	package Biblioteca;

	public class livroMain {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			LivroFisico livroFisico = new LivroFisico("O pequeno principe","Antoine de Saint-Exupéry",42,"pratileira A2");
			LivroDigital livroDigital = new LivroDigital("Livro dos Brainrots","Tung Sahur",67);
			
			livroFisico.exibirInfo();
			livroFisico.emprestar();
			livroFisico.localizar();
			System.out.println();
			
			livroDigital.exibirInfo();
			livroDigital.emprestar();
			livroDigital.baixarLivro();
		}

	}

