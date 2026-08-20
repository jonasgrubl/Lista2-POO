package Biblioteca;

public class livro {

	private String titulo;
	private String autor;
	private int quantidadeDisponivel;
	
	public livro(String titulo, String autor, int quantidadeDisponivel) { 
	
	this.titulo = titulo;
	this.autor = autor;
	this.quantidadeDisponivel = quantidadeDisponivel; 
	}
	public String getTitulo() {
		return  titulo; 
		
	}
	public String getAutor() {
	return autor; 
	}
	
	public int getQuantidadeDisponivel() {
		return quantidadeDisponivel;
		
	}
	public void setTitular(String titulo) {
		this.titulo = titulo;
	}
		public void setAutor(String autor) {
			this.autor = autor;
		}
		public void setQuantidadeDisponivel(int quantidadeDisponivel) {
			this.quantidadeDisponivel = quantidadeDisponivel;
		}
		public void emprestar() {
			System.out.println(titulo+ " Foi emprestado" );
		}
		public void localizar() {
			System.out.println(titulo +"Ta na pratileira");
		}
		public void exibirInfo() {
			System.out.println("Titulo :"+titulo);
			System.out.println("Autor :"+autor);
			System.out.println("QuantidadeDisponivel :"+quantidadeDisponivel);
	
			
			
			
		}
	
}
