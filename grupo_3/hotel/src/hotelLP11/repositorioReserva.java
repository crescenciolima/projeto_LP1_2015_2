package hotelLP11;


import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
* Em orde Alfab�tica:	
* @author Eber, Edmundo, jorlan, Luan, Roberto 
*/


public class repositorioReserva {
    
    private ArrayList<reserva> listaReserva;
//    private final int MAX = 100;
//    private int indicereserva;
    
    public repositorioReserva(){
        listaReserva = new ArrayList<reserva>();
    }
    
    public void inserirReserva (reserva res){
        listaReserva.add(res);
    }
    
    public reserva procurarReserva(String cli){
    
    	reserva temp = null;
        
    	for(int i = 0; i<listaReserva.size(); i++){
            if(listaReserva.get(i).getNomeCliente().equals(cli)){
                    temp = listaReserva.get(i);
                    break;
            }
    	}
    	if (temp == null) {   // Condi��o retirada do For
            JOptionPane.showMessageDialog(null, "Reserva n�o encontrada !!!", 
                     "Alerta", JOptionPane.WARNING_MESSAGE); 
         }
    	return temp;
    }
    
}
