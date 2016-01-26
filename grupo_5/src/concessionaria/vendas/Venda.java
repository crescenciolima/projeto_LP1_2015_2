package concessionaria.vendas;

import concessionaria.pessoas.Cliente;
import concessionaria.pessoas.ListaClientes;
import concessionaria.pessoas.ListaVendedores;
import concessionaria.pessoas.Vendedor;
import concessionaria.produtos.ListaVeiculos;
import concessionaria.produtos.Veiculo;

public class Venda {
	private Veiculo veiculo;
	private Cliente cliente;
	private Vendedor vendedor;
	private String data;
	private String frmPagamento;

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getFrmPagamento() {
		return frmPagamento;
	}

	public void setFrmPagamento(String frmPagamento) {
		this.frmPagamento = frmPagamento;
	}

	public Venda(int veiculo, int cliente, int vendedor, String data, String frmPagamento, int qtd){
                ListaVeiculos.getVeiculo(veiculo).baixarEstoque(qtd);
                this.veiculo = ListaVeiculos.getVeiculo(veiculo - 1);
		this.cliente = ListaClientes.getCliente(cliente - 1);
		this.vendedor = ListaVendedores.getVendedor(vendedor - 1);
		this.data = data;
		this.frmPagamento = frmPagamento;
                
	}

	
}