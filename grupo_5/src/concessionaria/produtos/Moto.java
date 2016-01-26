package concessionaria.produtos;

public class Moto extends Veiculo{
	private int CC;
	
	public Moto(String fabricante, String modelo, String ano, String cor, double valor, int CC, int qtdEstoque){
		super(fabricante,modelo,ano, cor, valor, qtdEstoque);
		this.CC = CC;
                System.out.println("Carro: " + modelo + " do fabricante " + fabricante + " cadastrado com sucesso.");
	}
	
	public int getCC() {
		return CC;
	}

	public void setCC(int CC) {
		this.CC = CC;
	}

}
