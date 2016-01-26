/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hotelLP11;

//import javax.swing.JOptionPane;

/**
* Em orde Alfabética:	
* @author Eber, Edmundo, jorlan, Luan, Roberto 
*/


public class hotel extends hotelAbstrata {

	//private double diariaBase;  
        
    public hotel(String nome, String cidade, String quarto, double diaria ){
        super(nome, cidade);
        setQuarto(quarto);
        setDiaria(calculaDiaria(diaria));
    }
    
    public double calculaDiaria(Double diaria){	
    	   
    	  if(quarto.equals("Suite Masteris")){   //aqui usei o equal
    		   diaria = diaria * 2;
    	   }
    	   else if(quarto.equals("Suite")){
    	       diaria = diaria * 1.5; 
    	   }
    	   else{
    		   diaria = diaria * 1 ;
    	   } 
    	   return diaria;
    	}
   
}



