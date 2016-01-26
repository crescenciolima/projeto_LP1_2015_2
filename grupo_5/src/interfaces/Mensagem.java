package interfaces;

import javax.swing.JOptionPane;

public class Mensagem {
	public  Mensagem(){
		
	}
	public static void informacao(String texto, String titulo){
        JOptionPane.showMessageDialog(null, texto,titulo, JOptionPane.INFORMATION_MESSAGE);
	}
	public static void erro(String texto, String titulo){
        JOptionPane.showMessageDialog(null, texto,titulo, JOptionPane.ERROR_MESSAGE);
	}
}
