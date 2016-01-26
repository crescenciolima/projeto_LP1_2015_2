package hotelLP11;
/**
* Em orde Alfabética:	
* @author Eber, Edmundo, jorlan, Luan, Roberto 
*/


import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import java.util.ArrayList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.border.BevelBorder;
import java.awt.Font;

public class MainHotelGui extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JTextField textHP;
	private JTextField textCidade;
	private JTextField textDiaria;
	private JTextField textCliente;
	private JTextField textCpf;
	private JTextField textHotel;
	private JButton btnReserva;
	
	private int tipoHP; // Identifica se é Hotel ou Pousada "Poderia ser um campo, mas utilizei flag para permitir 2 repositórios".
	
	private String nome;
	private String cidade;
	private String quarto;
	private Double diaria;
	private String cliente;
	private String cpf;
	private String nomeHotel;
	private String Seleto;
	private int flag = 0;
	
	
	/**
	 * Launch the application.
	 */

	static repositorioHotelPousada rep =  new repositorioHotelPousada();
	static repositorioReserva repReserva =  new repositorioReserva();
	
	reserva re;
	hotel h;

	public static String gravaHotelPousada(int id, String nome, String cidade, String quarto, Double diaria){
		
		String busca = "none";
        hotel a;
		pousada b;
		
		if(id == 1){
			//repositorioHotelPousada rep =  new repositorioHotelPousada();
			a = new hotel(nome, cidade, quarto, diaria); 	
			
			try{         	         	
				rep.inserirHotel(a);	
				busca = "O Hotel/Pousada: " + rep.procurarHotel(nome).getNome()+" Foi Cadastrado!";
			}catch (Exception NullPointerException){
		    	JOptionPane.showMessageDialog(null, "Hotel não Cadastrado!"); 
		    } 
		}else{
			//repositorioHotelPousada rep =  new repositorioHotelPousada();
			b = new pousada(nome, cidade, quarto, diaria);
			try{
				rep.inserirPousada(b);
				busca = "O Hotel/Pousada: " + rep.procurarPousada(nome).getNome()+" Foi Cadastrado!";
			}catch (Exception NullPointerException){
				JOptionPane.showMessageDialog(null, "Hotel não Cadastrado!");
			}
		}
		return busca;
	}	
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainHotelGui frame = new MainHotelGui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	
	/**
	 * Create the frame.
	 */
	public MainHotelGui() {
		setFont(new Font("Arial", Font.BOLD, 14));
		setTitle("SGR - Sistema de Gest\u00E3o de Reserva");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 487, 389);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLayeredPane layeredHotel = new JLayeredPane();
		layeredHotel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		layeredHotel.setBounds(143, 37, 287, 168);
		layeredHotel.setVisible(false);
		
		JLayeredPane layeredReserva = new JLayeredPane();
		layeredReserva.setBounds(138, 37, 292, 262);
		contentPane.add(layeredReserva);
		layeredReserva.setForeground(Color.ORANGE);
		layeredReserva.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		layeredReserva.setVisible(false);
		
//***************************************************************
		
		textCliente = new JTextField();
		textCliente.setBounds(100, 11, 135, 20);
		layeredReserva.add(textCliente);
		textCliente.setColumns(10);
		
		textCpf = new JTextField();
		textCpf.setBounds(100, 42, 102, 20);
		layeredReserva.add(textCpf);
		textCpf.setColumns(10);
		JLabel lblCliente = new JLabel("Cliente");
		lblCliente.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCliente.setBounds(44, 14, 46, 14);
		layeredReserva.add(lblCliente);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCpf.setBounds(44, 45, 46, 14);
		layeredReserva.add(lblCpf);	
		
		JList listCadastro = new JList();
		listCadastro.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		listCadastro.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent arg0) {
				Seleto = listCadastro.getSelectedValue().toString();
				
			}
		});
		listCadastro.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		listCadastro.setModel(new AbstractListModel() {
			String[] values = new String[] {"N\u00E3o consegui", "Fazer o Array", "Preencher o JList"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		
		listCadastro.setBounds(10, 203, 272, 48);
		layeredReserva.add(listCadastro);
		
		textHotel = new JTextField();
		textHotel.setBounds(100, 73, 86, 20);
		layeredReserva.add(textHotel);
		textHotel.setColumns(10);
		
		JLabel lblNomeDoHotel = new JLabel("Nome do Hotel");
		lblNomeDoHotel.setBounds(23, 76, 80, 14);
		layeredReserva.add(lblNomeDoHotel);
		contentPane.add(layeredHotel);
		
		JRadioButton rdbtnHotel = new JRadioButton("Hotel");
		rdbtnHotel.setSelected(true);
		rdbtnHotel.setBounds(6, 7, 63, 23);
		layeredHotel.add(rdbtnHotel);
		
		JRadioButton rdbtnPousada = new JRadioButton("Pousada");
		rdbtnPousada.setBounds(71, 7, 109, 23);
		layeredHotel.add(rdbtnPousada);
		
		textHP = new JTextField();
		textHP.setBounds(81, 37, 177, 20);
		layeredHotel.add(textHP);
		textHP.setColumns(10);
		
		textCidade = new JTextField();
		textCidade.setBounds(81, 68, 149, 20);
		layeredHotel.add(textCidade);
		textCidade.setColumns(10);
		
		JRadioButton rdbtnStandard = new JRadioButton("Standard");
		rdbtnStandard.setSelected(true);
		rdbtnStandard.setBounds(6, 95, 77, 23);
		layeredHotel.add(rdbtnStandard);
		
		JRadioButton rdbtnSuite = new JRadioButton("Suite");
		rdbtnSuite.setBounds(90, 95, 77, 23);
		layeredHotel.add(rdbtnSuite);
		
		JRadioButton rdbtnSMaster = new JRadioButton("St Master");
		rdbtnSMaster.setBounds(186, 95, 83, 23);
		layeredHotel.add(rdbtnSMaster);
		
		textDiaria = new JTextField();
		textDiaria.setBounds(81, 134, 86, 20);
		layeredHotel.add(textDiaria);
		textDiaria.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNome.setBounds(23, 40, 46, 14);
		layeredHotel.add(lblNome);
		
		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCidade.setBounds(23, 71, 46, 14);
		layeredHotel.add(lblCidade);
		
		JLabel lblDiria = new JLabel("Di\u00E1ria R$");
		lblDiria.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDiria.setBounds(23, 137, 46, 14);
		layeredHotel.add(lblDiria);
		
//**********************************************		
		
		JButton btnNovo = new JButton("Novo Hotel");
		btnNovo.setBounds(10, 42, 106, 23);
		contentPane.add(btnNovo);
		btnNovo.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) { 
				layeredHotel.setVisible(true);
				layeredReserva.setVisible(false);
				flag = 1;
			
				/*btnReserva.setEnabled(false);
				btnGravar.setEnabled(true);
				btnCancelar.setEnabled(true);
				setEnabled(false);*/
		}
		});
		
		btnReserva = new JButton("Reserva");
		btnReserva.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				layeredHotel.setVisible(false); 
				layeredReserva.setVisible(true);
				flag = 2;
				
				/*btnNovo.setEnabled(false);
				btnReserva.setEnabled(false);
				btnGravar.setEnabled(true);
				btnCancelar.setEnabled(true);*/
			}
		});
		btnReserva.setBounds(10, 76, 106, 23);
		contentPane.add(btnReserva);
	
		JButton btnGravar = new JButton("Gravar");
		btnGravar.addActionListener(new ActionListener() {
	
		public void actionPerformed(ActionEvent e) {
				
			if(flag== 1){    //Verifica se é um cadastro de Hotel 
				if(rdbtnHotel.isSelected()== true){
					tipoHP = 0;
					if(rdbtnStandard.isSelected()== true){
						quarto = "Standard";
					}else if(rdbtnSuite.isSelected()== true){
						quarto = "Suite";
					}else{
						quarto = "Suite Master";
					}
					
					nome = textHP.getText();
					cidade = textCidade.getText();
					diaria = Double.parseDouble(textDiaria.getText());
	
				}else{
					tipoHP = 1;
					if(rdbtnStandard.isSelected()== true){
						quarto = "Simples";
					}else if(rdbtnSuite.isSelected()== true){
						quarto = "Duplo";
					}else{
						quarto = "Triplo";
					}	
				}
				
				nome = textHP.getText();
				cidade = textCidade.getText();
				diaria = Double.parseDouble(textDiaria.getText());
				
				gravaHotelPousada(tipoHP,nome,cidade,quarto,diaria);
				
				JOptionPane.showMessageDialog(null, gravaHotelPousada(tipoHP,nome,cidade,quarto, diaria));
				
				flag = 0;
				
				textHP.setText("");
			    textCidade.setText("");
				textDiaria.setText("");
	
			}else{   // Nesse caso é um cadastro de Reserva
					
					cliente = textCliente.getText();
					cpf = textCpf.getText();
					nomeHotel = textHotel.getText();
	
					h = rep.procurarHotel(nomeHotel); //procurar o hote para depois adicionar a reserva
			   		
					String messs = "Dados do Hotel \n";
			   		messs += "Hotel: " +rep.procurarHotel(nomeHotel).getNome() + "\n";
			    	messs += "Cidade: " + rep.procurarHotel(nomeHotel).getCidade()+ "\n";
			    	messs += "Diária: " + rep.procurarHotel(nomeHotel).getDiaria()+ "\n";
			    		   	
			    	JOptionPane.showMessageDialog(null, messs, "Sistema de Gerenciamento de Reserva", 1);
			    		   	
				    re = new reserva(cliente, cpf, h);
				    repReserva.inserirReserva(re);
				    
				    		messs = "Verifique Sua Reserva! \n\n";
				    		messs += "Cliente	: " +repReserva.procurarReserva(cliente).getNomeCliente()+ "\n";
				    		messs += "Cpf		: " +repReserva.procurarReserva(cliente).getCpf()+ "\n";
				    		messs += "Hotel		: " +repReserva.procurarReserva(cliente).getR().getNome()+ "\n";
				    		messs += "Cidade	: " +repReserva.procurarReserva(cliente).getR().getCidade()+ "\n";
				    		messs += "Quarto	: " +repReserva.procurarReserva(cliente).getR().getQuarto()+ "\n";
				    		messs += "VL Diraria: " +repReserva.procurarReserva(cliente).getR().getDiaria()+ "\n";
				   			
				    		JOptionPane.showMessageDialog(null,messs, "Sistema de Gerenciamento de Reserva", 1);	
			
					flag= 0; 
					textCliente.setText("");
					textCpf.setText("");
					textHotel.setText("");
			
			}
				
		  }
		});
		btnGravar.setBounds(10, 152, 106, 23);
		contentPane.add(btnGravar);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/*btnReserva.setEnabled(true);
				btnNovo.setEnabled(true);
				btnGravar.setEnabled(false);
				setEnabled(false);*/
			}
		});
		btnCancelar.setBounds(10, 186, 106, 23);
		contentPane.add(btnCancelar);
		
	}
}
