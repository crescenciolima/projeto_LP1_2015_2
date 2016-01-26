package concessionaria.produtos;

import javax.swing.DefaultListModel;

public class ListaVeiculos {
	private static Veiculo[] veiculos = new Veiculo[100];
	private static int indice = 0;

	public ListaVeiculos() {
		veiculos = new Veiculo[100];
		indice = 0;
	}

	public static void inserir(Veiculo novo) {
		try {
			veiculos[indice] = novo;
			indice++;
                        System.out.println("Veiculo " + novo.getModelo() + " inserido na lista.");
		} catch (Exception e) {
			System.out.println("Alcançado o limite do vetor. erro: " + e);
		}
	}

	public static Veiculo getVeiculo(int numero) {
		return veiculos[numero - 1];
	}

	public static int procurar(String Modelo) {
		int resposta = -1;
		for (int i = 0; i < indice - 1; i++) {
			if (veiculos[i].getModelo().equals(Modelo)) {
				resposta = i;
			}
		}
		return resposta;
	}

	public static void remover(int procura) {
		
			veiculos[procura].toString();// para gerar exception caso seja um
											// indice sem dado
			veiculos[procura] = null;
			veiculos[procura] = veiculos[indice - 1];
			veiculos[indice - 1] = null;
			indice--;
		
	}

	public static String detalhes(int numero) {
		Veiculo x = veiculos[numero];
		return numero + " | " + x.getModelo() + " | " + x.getFabricante() + " | " + x.getAno();
	}

	public static DefaultListModel<String> getLista() {
		DefaultListModel<String> model = new DefaultListModel<>();
		// String lista[] = new String[indice];
		try {
			for (int i = 0; i < indice; i++) {
				model.addElement(
						"Id: " + (i+1) +" | Veiculo: " + veiculos[i].getModelo() + " | Fabricante: " + veiculos[i].getFabricante() + " | Estoque: " + veiculos[i].getQtdEstoque());
			}
		} catch (Exception e) {
			System.out.println("erro: " + e);
		}
		return model;
	}
}
