 package Biblioteca;

public class LivroDigital extends livro{
	private double tamanhoArquivo;
	
	public LivroDigital(String titulo, String autor, int quantidadeDisponivel) {
		super(titulo, autor, quantidadeDisponivel);
		this.tamanhoArquivo = tamanhoArquivo;
		// TODO Auto-generated constructor stub
	}
	public void baixarLivro() {
		System.out.println(getTitulo() +"Foi baixado com sucesso.");
	}
	@Override
	public void exibirInfo() {
		super.exibirInfo();
		System.out.println("Tamanho do arquivo: " +tamanhoArquivo + "MB");
	

	}
	public static void main(String[] args) {
		LivroDigital digital = new LivroDigital("O alienigena", "Machado de Assis", 999);
		 digital.exibirInfo();
		 digital.baixarLivro();
	
	}
}
	
	
	