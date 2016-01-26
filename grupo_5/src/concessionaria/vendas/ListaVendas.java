package concessionaria.vendas;

import javax.swing.DefaultListModel;

public class ListaVendas {
	private static Venda vendas[];
	private static int indice;

	public ListaVendas() {
		vendas = new Venda[200];
		indice = 0;
	}

	public static void inserir(Venda venda) {
		try {
			vendas[indice] = venda;
			indice++;
		} catch (Exception e) {
			System.out.println("Alcançado o limite do vetor. erro: " + e);
		}
	}

	public static int procurar(Venda venda) {
		int resposta = -1;
		for (int i = 0; i < indice - 1; i++) {
			if (vendas[i] == venda) {
				resposta = i;
			}
		}
		return resposta;
	}

	public static void remover(int numero) {
		try {
			vendas[numero].toString();//gera exception
			vendas[numero] = null;
			vendas[numero] = vendas[indice - 1];
			vendas[indice - 1] = null;
			indice--;
		} catch (NullPointerException e) {
			System.out.println("Fora da quantidade Armazenada no Array, erro: " + e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Fora da capacidade de veiculos. erro: " + e);
		}
	}

	public static String detalhes(int numero){
		Venda x = vendas[numero];
		return x.getCliente().getNome() + "|" + x.getVeiculo().getModelo() + "|" + x.getVendedor().getNome();
	}

	public static DefaultListModel<String> getLista() {
		DefaultListModel<String> model = new DefaultListModel<String>();
		//String lista[] = new String[indice];
		try {
			for (int i = 0; i < indice; i++) {
				model.addElement("Veiculo: " + vendas[i].getVeiculo().getModelo() +
						 " - Cliente: " + vendas[i].getCliente().getNome());
			}
		} catch (Exception e) {
			System.out.println("erro: " + e);
		}
		return model;
	}
}