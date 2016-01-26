package hotelLP11;

/**
* Em orde Alfab�tica:	
* @author Eber, Edmundo, jorlan, Luan, Roberto 
*/


import java.util.ArrayList;
import javax.swing.JOptionPane;

public class repositorioHotelPousada {
   
	private ArrayList<hotel> listaH;         // Optei por implementar ArrayList, � mais adequado para armazenar objetos;
    private ArrayList<pousada> listaP;
    
	    public repositorioHotelPousada(){
	        listaH = new ArrayList<hotel>() ;
	        listaP = new ArrayList<pousada>();
	    }
	    
	    public void inserirHotel (hotel h){
	    	listaH.add(h);
	    }
	
	    public void inserirPousada (pousada p){
	       	listaP.add(p);
	    }
	    
	    
	    public hotel procurarHotel(String n){
	    
	    	hotel temp = null;
	        
	    	for(int i = 0; i<listaH.size(); i++){
	            if(listaH.get(i).getNome().equals(n)){
	                    temp = listaH.get(i);
	                    break;
	            }
	        }
	        if (temp == null) {
            	JOptionPane.showMessageDialog(null,"Hotel n�o localizado, Verificque Suas Informa��es!");
            }
    
	    	return temp;
	    }
	   
	    public pousada procurarPousada(String n){
	    	pousada temp = null;
	        
	    	for(int i = 0; i<listaP.size(); i++){
	            
	    		if(listaP.get(i).getNome().equals(n)){
	                    temp = listaP.get(i);
	                    break;
	            }
	            
	        }
	    	
	    	if (temp == null) {                               // Condi��o retirada do for para acusar erro apenas se n�o localizado
                JOptionPane.showMessageDialog(null,"Pousada n�o localizada, Verificque Suas Informa��es!");   
            }
	    	return temp;
	    }
}
