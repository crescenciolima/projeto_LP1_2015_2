/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalholp1;

/**
 *
 * @author Bruno
 */
public class RepositorioCliente{
    private Cliente[] clientes;
    private int indice;
    private final static int MAX=5;
    

    public RepositorioCliente(){
        indice = 0;
        clientes = new Cliente[MAX];
    }
    
    public void inserir(Cliente z){
        clientes[indice] = z;
        indice++;
    }
    public Cliente pesquisaCliente(String cpf){
        int i = 0;
        Cliente achado = null;
        for(i=0;i<indice;i++){
            if(clientes[i].getCpf().equals(cpf)){
                achado = clientes[i];
                break;
            }
        }
        return achado;
    }
    
    public void retirarCliente(String cpf){
        int y = 1;
        int i = 0;
        for(i=0;i<indice;i++){
            if(clientes[i].getCpf().equals(cpf)){
                y = 1;
                clientes[i] = clientes[i-1];
                clientes[i-1] = null;
                indice--;
            }
        }
        if(y==1){
            System.out.print("Cliente: " + clientes[i] + " com o cpf: " + clientes[i].getCpf() + " cancelou sua passagem");
        }
        else{
            System.out.print("Não existe o cliente solicitado.");
        }
    }
}