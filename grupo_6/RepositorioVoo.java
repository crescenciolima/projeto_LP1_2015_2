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
public class RepositorioVoo {
    private Voo[] voos;
    private int indice;
    private final static int MAX=3;
    
    public RepositorioVoo(){
        indice = 0;
        voos = new Voo[MAX];
    }
    
    public void inserir(Voo a1){
        voos[indice] = a1;
        indice++;
    }
    
    public Voo pesquisaVoo(String numeroV){
        int i = 0;
        Voo achado = null;
        for(i=0;i<indice;i++){
            if(voos[i].getNumeroV().equals(numeroV)){
                achado = voos[i];
                break;
            }
        }
        return achado;
    }
    
    public void retirarVoo(String numeroV){
        int y = 1;
        int i = 0;
        for(i=0;i<indice;i++){
            if(voos[i].getNumeroV().equals(numeroV)){
                y = 1;
                voos[i] = voos[i-1];
                voos[i-1] = null;
                indice--;
            }
        }
        if(y==1){
            System.out.print("O : " + voos[i] + " foi cancelado");
        }
        else{
            System.out.print("Não existe o cliente solicitado.");
        }
    }
    
    public void mostrarVoo(){
        int i = 0;
        for(i=0;i<indice;i++){
            System.out.println();
            System.out.println("Voo: " + i);
            System.out.println("NumeroV: " + voos[i].getNumeroV());
            System.out.println("Partida do dia " + voos[i].getDiaP() + " às " + voos[i].getHorarioP() + " com previsão de chegada às " + voos[i].getDiaC() + " no dia " + voos[i].getHorarioC());
        }
    }
}
