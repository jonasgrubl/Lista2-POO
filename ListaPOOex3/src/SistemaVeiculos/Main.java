package SistemaVeiculos;

public class Main {

	public static void main(String[] args) {
		
		Carro Carro = new Carro("BMW","i30",2025,4);
		Moto Moto = new Moto("BMW","1250gs", 2025,1250);
	
		Carro.exibirInfo();
		System.out.println();
		
		Moto.exibirInfo();
		System.out.println();
	}

}
