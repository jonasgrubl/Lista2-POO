package Biblioteca;

public class LivroFisico extends livro {

	private String posicaoLivro;
	
	public LivroFisico(String titulo, String autor, int quantidadeDisponivel,String posicaoLivro) {
		
		super(titulo, autor, quantidadeDisponivel);
		this.posicaoLivro = posicaoLivro;
		
	}
	@Override
	public void exibirInfo() {
		super.exibirInfo();
		System.out.println("Posição na prateleira " + posicaoLivro);
	}
	

}
