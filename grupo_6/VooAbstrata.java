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
public abstract class VooAbstrata {
    Scanner s = new Scanner(System.in);
    protected String numeroV;
    protected double partida;
    protected double chegada;
    protected int diaC;
    protected int diaP;
    protected String atrasar;
    protected int capacidade;
    protected String [] Passageiros;
    protected String nome; // eliminei o array (nao vi necessidade)
    protected String cpf; // eliminei o array
    protected String portao;
    
    public VooAbstrata(String numeroV){
        this.numeroV = "2347";
        this.portao = "A3";
        this.partida = 12.30;
        this.chegada = 18.15;
        this.atrasar = "N";
        this.capacidade = 3; // Diminui o numero para fazer o teste
        this.Passageiros = new String[capacidade];
        for(int i=0;i<capacidade;i++){
            System.out.print("Digite seu nome: ");
            nome = s.nextLine(); // elimiei o array
            Passageiros[i] = nome; // guardando o nome dos passageiros
            System.out.print("Digite seu cpf: ");
            cpf = s.nextLine(); // eliminei o array
            
        }
    }
    
    public String getNumeroV(){
        return numeroV;
    }
    
    public void setNumeroV(String numeroV){
        this.numeroV = numeroV;
    }
            
    public double getPartida(){
        return partida;
    }
    
    public void setPartida(double partida){
        this.partida = partida;
    }
    
    public double getChegada(){
        return chegada;
    }
    
    public void setChegada(double chegada){
        this.chegada = chegada;
    }
    
    public int getCapacidade(){
        return capacidade;
    }
    
    public void setCapacidade(int capacidade){
        this.capacidade = capacidade;
    }
    
    public int getDiaC(){
        return diaC;
    }
    
    public void setDiaC(){
        this.diaC = diaC;
    }
    
    public int getDiaP(){
        return diaP;
    }
    
    public void setDiaP(){
        this.diaP = diaP;
    }
    
    public String getAtrasar(){
        return atrasar;
    }
    
    public void setAtrasar(String atrasar){
        this.atrasar = atrasar;
    }
    
    public void setPortao(String portao){
        this.portao = portao;
    }
    
    public String setPortao(){
        return portao;
    }
    
    public void setPassageiros(String Passageiros){
        int i;
        for(i=0;i<capacidade;i++){
            System.out.println("Cliente: " + nome + "   e cpf: " + cpf);
            System.out.println();
        }
    }
    
    public void getPassageiros(){	//Alterei a funcao para permitir a impressao dos nomes dos passageiros
        for(int i=0; i < capacidade; i++){
        	System.out.println(Passageiros[i]);
        }
    }
    
    public abstract void atraso(String atrasar);
}