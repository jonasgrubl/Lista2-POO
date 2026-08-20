package SistemaVeiculos;

public class Carro extends Veiculo {
private int quantidadePortas = 4;
	public Carro(String marca, String modelo, int ano, int quantidadePortas) {
		super(marca, modelo, ano);
		setMarca(marca);
		setModelo(modelo);
		setAno(ano);
		this.quantidadePortas = quantidadePortas;
	}
	public int getquantidadePortas() {
		return quantidadePortas;
	}
	public void setQuantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
		
	}

	@Override
	public void exibirInfo() {
	System.out.println("Marca: "+getMarca());
	System.out.println("Modelo: "+getModelo());
	System.out.println("Marca: "+getAno());
	System.out.println("Quantidade de portas: "+quantidadePortas);
	
	}
	
	
}
