package concessionaria.produtos;

public class Carro extends Veiculo {
	private int qtdPortas;

	public int getQtdPortas() {
		return qtdPortas;
	}

	public void setQtdPortas(int qtdPortas) {
		this.qtdPortas = qtdPortas;
	}

	// inicio da sobrecarga de metodos
	public Carro(String modelo, double valor) {
		super(modelo, valor);
	}

	public Carro(String fabricante, String modelo, String ano, String cor, double valor, int qtdPortas, int qtdEstoque) {
		super(fabricante, modelo, ano, cor, valor, qtdEstoque);
		this.qtdPortas = qtdPortas;
                System.out.println("Carro: " + modelo + " do fabricante " + fabricante + " cadastrado com sucesso.");
	}
	// fim da sobrecarga de metodos
	/*
	 * A classe carro pode ser invocada com o parametro com todos os parametros
	 * ou só com o parametro modelo
	 */
}
