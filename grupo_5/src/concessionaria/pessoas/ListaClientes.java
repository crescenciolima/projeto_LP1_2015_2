package concessionaria.pessoas;

import javax.swing.DefaultListModel;

public class ListaClientes {

    private static Cliente clientes[] = new Cliente[200];
    private static int indice = 0;

    public static void inserir(Cliente cliente) {

        clientes[indice] = cliente;
        try {
            indice++;
            System.out.println("Cliente " + cliente.getNome() + " inserido na lista.");
        } catch (Exception e) {
            System.out.println("Alcançado o limite do vetor. erro: " + e);
        }
    }

    public static Cliente getCliente(int numero) {
        return clientes[numero - 1];
    }

    public static int procurar(String nome) {
        int resposta = -1;
        for (int i = 0; i < indice - 1; i++) {
            if (clientes[i].getNome().equals(nome)) {
                resposta = i;
            }
        }
        return resposta;
    }

    public static void remover(int numero) {
        
            clientes[numero].toString();// para gerar exception caso seja um indice sem dado
            clientes[numero] = null;
            clientes[numero] = clientes[indice - 1];
            clientes[indice - 1] = null;
            indice--;
        

    }

    public static String detalhes(int numero) {
        Pessoa x = clientes[numero];
        return numero + " | " + x.getNome() + " | "
                + x.getCpf() + " | " + x.getEndereco();
    }

    public static DefaultListModel<String> getLista() {
        DefaultListModel<String> model = new DefaultListModel<String>();
        //String lista[] = new String[indice];
        try {
            for (int i = 0; i < indice; i++) {
                model.addElement("Id: " + (i+1) +" | Nome: " + clientes[i].getNome() + " | CPF: "
                        + clientes[i].getCpf() + " | D. Nasc: " + clientes[i].getNascimento());
            }
        } catch (Exception e) {
            System.out.println("erro: " + e);
        }
        return model;
    }
}
