package concessionaria.produtos;

public abstract class Veiculo {
	private String fabricante;
	private String modelo;
	private String ano;
	private String cor;
	private double valor;
	private int qtdEstoque; // duvida se deixar estoque aqui ou classe
								// separada

	public Veiculo(String modelo, double valor) {
		this.modelo = modelo;
		this.valor = valor;
	}

	public Veiculo(String fabricante, String modelo, String ano, String cor, double valor) {
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
		this.valor = valor;
		qtdEstoque = 0; // iniciar com estoque zero ou setar ao criar o objeto?
	}

	public Veiculo(String fabricante, String modelo, String ano, String cor, double valor, int qtdEstoque) {
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
		this.valor = valor;
		this.qtdEstoque = qtdEstoque; // recebe o estoque inicial como parametro
	}

	public String getFabricante() {
		return fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public String getAno() {
		return ano;
	}
	
	public String getCor() {
		return cor;
	}
	
	public double getValor() {
		return valor;
	}
	
	public int getQtdEstoque() {
		return qtdEstoque;
	}
	
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void setValor(float valor) {
		this.valor = valor;
	}

	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}

	public void subirEstoque(int qtd) {
		qtdEstoque = qtdEstoque + qtd;
	}

	public void baixarEstoque(int qtd) {
            if (qtd < 1 || qtd > this.qtdEstoque) {
                throw new IllegalArgumentException("Impossivel dar baixa nessa quantidade.");
            }else{
                qtdEstoque = qtdEstoque - qtd;
            }
	}

}
