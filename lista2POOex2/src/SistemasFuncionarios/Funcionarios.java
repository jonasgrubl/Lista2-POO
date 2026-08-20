
package SistemasFuncionarios;

public class Funcionarios {
	private String nome;
	private int matricula;
	private double salario;
	
	public Funcionarios() {
		
	}
	
	public Funcionarios(String nome, int matricula, double salario) {
		this.nome = nome;
		this.matricula = matricula;
		this.salario = salario;
	}
		
		public String getNome() {
			return nome;
		}
		public int getMatricula() {
			return matricula;
		}
		public double getSalario() {
			return salario;
		}
		
		
		
		public void setNome(String nome) {
			this.nome = nome;
		}
		public void setMatricula(int matricula) {
			this.matricula = matricula;
		}
		public void setSalario(double salario) {
			this.salario = salario;
		}
		
		public void exibirInfo(){
			System.out.println("Nome: " +nome);
			System.out.println("matricula: "+matricula );
			System.out.println("salario: " +salario);
		}	
		public double calcularSalario() {
			return salario;
		}
}
			
		
		
	