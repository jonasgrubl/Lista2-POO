package SistemaVeiculos;

public class Moto extends Veiculo{
private int cilindradas = 1250;
	public Moto(String marca, String modelo, int ano, int cilindradas) {
		super(marca, modelo, ano);
		setMarca(marca);
		setModelo(modelo);
		setAno(ano);
		this.cilindradas = cilindradas;
	}
	public int getcilindradas() {
		return cilindradas;
	}
	public void setcilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}
@Override
public void exibirInfo() {
	System.out.println("Marca" +getMarca());
	System.out.println("Modelo"+getModelo());
	System.out.println("Ano"+getAno());
	System.out.println("Quantidade de cilindradas "+cilindradas);
	}
	
	
	
	
	
}
