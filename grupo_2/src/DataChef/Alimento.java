/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataChef;

/**
 *
 * @author Daniel
 */
public abstract class Alimento {
    private String nome;
    private double preco;
    
    public Alimento (String nome, double preco){
        this.nome=nome;
        this.preco=preco;
    }
    
    public String retornaNome(){
        return nome;
    }
    
    public double retornaPreco(){
        return preco;
    }

    
}
