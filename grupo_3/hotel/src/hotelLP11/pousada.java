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


public class pousada extends hotelAbstrata {
	    
	    //private  double diariaBase = 85;  
	    
	    public pousada(String nome, String cidade, String quarto, Double diaria){
	        super(nome, cidade);
	        setQuarto(quarto);
	        setDiaria(calculaDiaria(diaria));
	    }
	    
	    public double calculaDiaria(Double diaria){
	    		   
		   if(quarto == "Triplo"){
			   diaria = diaria * 2.5;
	       }
		   else if(quarto == "Duplo"){
	           diaria = diaria * 1.5; 
	       }
		   else{
			   diaria = diaria* 1;
	       } 
		   
		   return diaria;
		}
}

