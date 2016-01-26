package concessionaria.pessoas;

import javax.swing.DefaultListModel;

public class ListaVendedores {

    private static Vendedor vendedores[] = new Vendedor[200];
    private static int indice = 0;

    public static void inserir(Vendedor vendedor) {
        try {
            vendedores[indice] = vendedor;
            indice++;
            System.out.println("Vendedor " + vendedor.getNome() + " inserido na lista.");
        } catch (Exception e) {
            System.out.println("Alcançado o limite do vetor. erro: " + e);
        }
    }

    public static Vendedor getVendedor(int numero) {
        return vendedores[numero - 1 ];
    }

    public static int procurar(String nome) {
        int resposta = -1;
        for (int i = 0; i < indice - 1; i++) {
            if (vendedores[i].getNome().equals(nome)) {
                resposta = i;
            }
        }
        return resposta;
    }

    public static void remover(int numero) {
        
            vendedores[numero].toString();//gera exception para null
            vendedores[numero] = null;
            vendedores[numero] = vendedores[indice - 1];
            vendedores[indice - 1] = null;
            indice--;
        
    }

    public static String detalhes(int numero) {
        Vendedor x = vendedores[numero];
        return numero + " | " + x.getNome() + " | "
                + x.getCpf() + " | " + x.getSalario();
    }

    public static DefaultListModel<String> getLista() {
        DefaultListModel<String> model = new DefaultListModel<String>();
        //String lista[] = new String[indice];
        try {
            for (int i = 0; i < indice; i++) {
                model.addElement("Id: " + (i+1) +" | Vendedor: " + vendedores[i].getNome() + " | CPF: "
                        + vendedores[i].getCpf());
            }
        } catch (Exception e) {
            System.out.println("erro: " + e);
        }
        return model;
    }
}
