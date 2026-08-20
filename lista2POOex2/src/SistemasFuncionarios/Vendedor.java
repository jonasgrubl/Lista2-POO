
package SistemasFuncionarios;

public class Vendedor extends Funcionarios{

	private double comissao;
	
	public Vendedor(String nome, int matricula, double salario, double comissao) {
		setNome(nome);
		setMatricula(matricula);
		setSalario(salario);
		this.comissao = comissao;
	}
	public double getComissao() {
		return comissao;
	}
	
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	public double calcularSalario() {
		return getSalario() + comissao;
	}


}