/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelLP11;

/**
* Em orde Alfabética:	
* @author Eber, Edmundo, jorlan, Luan, Roberto 
*/

public abstract class hotelAbstrata {
    
	protected String nome;
 	protected String cidade;
    protected String quarto; 
    protected double diaria;
    
    //private Boolean wifi, piscina, cafe;
    
    public hotelAbstrata(String nome, String cidade){
        this.nome = nome;
        this.cidade = cidade;
    }

    
    public abstract double calculaDiaria(Double diaria);   	//Classe Abstrata Obrigatória para os Objetos Filhos
    

    // INÍCIO DOS **** Get's e Set's HOTEIS
       
    public String getNome() {   				
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    
	// INÍCIO DOS **** Get's e Set's QUARTOS
    public double getDiaria() {  		
        return diaria;
    }

    public void setDiaria(double diaria) {
        this.diaria = diaria;
    }

    public String getQuarto() {
        return quarto;
    }
    
    public void setQuarto(String quarto) {
        this.quarto = quarto;
    }

    
    
    
    
    
    
}
