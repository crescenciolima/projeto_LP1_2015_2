/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalholp1;

import java.util.Scanner;

/**
 *
 * @author Bruno
 */
public abstract class VooAtraso extends VooAbstrata{
    Scanner s = new Scanner(System.in);
    public VooAtraso(String numeroV){
        super(numeroV);
    }
    
    public void atraso(String Atrasar){
        int diaP = this.diaP;
        int diaC = this.diaC;
        double partida = this.partida;
        double chegada = this.chegada;
        String atrasar = this.atrasar;
        if(("N".equals(getAtrasar()))||("NAO".equals(getAtrasar()))||(("nao".equals(getAtrasar())))){
            System.out.println("Não houve atraso.");
        }
        else{
            System.out.println("Voo atrasou");
            System.out.print("Novo dia partida: ");
            this.diaP = s.nextInt();
            System.out.print("Novo dia de chegada: ");
            this.diaC = s.nextInt();
            System.out.print("Novo horario de partida: ");
            this.partida = s.nextDouble();
            System.out.print("Novo horario de chegada: ");
            this.chegada = s.nextDouble();
        }
    }
}
