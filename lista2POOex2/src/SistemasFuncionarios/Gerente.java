
package SistemasFuncionarios;


public class Gerente extends Funcionarios{

			private double bonus;
			
			public Gerente(String nome, int matricula, double salario, double bonus) {
				setNome(nome);
				setMatricula(matricula);
				setSalario(salario);
				this.bonus = bonus;
			}
			public double getBonus() {
				return bonus;
			}
			
			public void setBonus(double bonus) {
				this.bonus = bonus;
			}
			public double calcularSalario() {
				return getSalario() + bonus;
			}
		

	}