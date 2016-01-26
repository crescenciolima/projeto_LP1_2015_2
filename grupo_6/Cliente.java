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
public abstract class Cliente {
    protected String nome;
    protected String telefone;
    protected String email;
    protected String cpf;
    
    public Cliente(String nome, String telefone, String email, String cpf){
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getTelefone(){
        return telefone;
    }
    
    public void setTelefone(String nome){
        this.telefone = telefone;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getCpf(){
        return cpf;
    }
    
    public void getCpf(String cpf){
        this.cpf = cpf;
    }
}
