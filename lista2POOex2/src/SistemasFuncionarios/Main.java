
package SistemasFuncionarios;

public class Main {


public static void main(String[] args) {
	// TODO Auto-generated method stub
	Gerente gerente = new Gerente("Jonas Grubl",676767,424242,6161);
	Vendedor vendedor = new Vendedor("Henrique Bernardes",54321,1000,200);
	
	gerente.exibirInfo();
	System.out.println("seu salario: "+	gerente.calcularSalario());
	
	System.out.println();
	
	vendedor.exibirInfo();
	System.out.println("seu salario: "+vendedor.calcularSalario());
}

}