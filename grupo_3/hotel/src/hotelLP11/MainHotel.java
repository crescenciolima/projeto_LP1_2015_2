package hotelLP11;

/**
* Em orde Alfabética:	
* @author Eber, Edmundo, jorlan, Luan, Roberto 
*/


import javax.swing.JOptionPane;


public class MainHotel {
	
	static  repositorioHotelPousada rep =  new repositorioHotelPousada();
	
		public static String gravaHotelPousada(int id, String nome, String cidade, String quarto, Double diaria){
			
			String busca = "none";
		    hotel a;
			pousada b;
			
			if(id == 1){
				a = new hotel(nome, cidade, quarto, diaria); 	
				try{         	         	
					rep.inserirHotel(a);	// necessário ter uma variável static global do tipo repositório HotelPousada
					busca = "O Hotel/Pousada: " + rep.procurarHotel(nome).getNome()+" Foi Cadastrado!";
				}catch (Exception NullPointerException){
				    
			    	JOptionPane.showMessageDialog(null, "Hotel não Cadastrado!"); 
			    } 
			}else{
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
		
	   public static void main(String[] args) throws Exception {
		
		    int mess = 0;
	    	int tipo = 1;
	    	String nome = "none";
	    	String cidade;
	    	String quarto;
	    	Double diaria;
	    	String Rel;
	    	
	    	// Criadas para testar repositorio de reserva
	    	String nomeCliente; 
		   	String cpfCliente; 
	   	   	String nomeHotel;
	   	   
	   	   	hotel h;
	   	   	reserva re;
	
	   	   try{	
		   		Rel = "Bem vido ao Cadastro de Hoteis e Pousadas!\n\n";
	   			Rel +="Em seguida o sistema irá lhe solicitar os dados básico\n"   ;
	   			Rel +="Todos os dados são importantes para que o cadastro ocorra. \n\n" ;
	   			Rel +="Ao final será exibida uma tela com a confirmação do Cadastro!\n\n" ;	
	   		   
	   			JOptionPane.showMessageDialog(null,Rel  , "Sistema de Gerenciamento de Reservas", 1);
	   			
	   			do{
		    	   
	   				tipo = Integer.parseInt(JOptionPane.showInputDialog(null, "informe tipo de hospedagem \n 1-Hotel ou 2-Pousada "));
		    	    
			    	    switch (tipo){
			    	    case 1:
			    	    	nome = JOptionPane.showInputDialog(null, "informe o nome do Hotel ");
				        	cidade = JOptionPane.showInputDialog(null, "informe a Cidade ");
				        	quarto = JOptionPane.showInputDialog(null, "informe o tipo de Quarto ");
				            diaria = Double.parseDouble(JOptionPane.showInputDialog("Diaria Base: "));
				        	
				        	gravaHotelPousada(tipo,nome,cidade,quarto,diaria);
				        	
				        	/***** Trecho utilizado para teste
				        	System.out.println(gravaHotelPousada(tipo, nome, cidade, quarto, diaria));
				        	*/
				        	
				        break;
			    	    case 2:
			    	    	nome = JOptionPane.showInputDialog(null, "informe o nome do Pousada ");
				        	cidade = JOptionPane.showInputDialog(null, "informe a Cidade ");
				        	quarto = JOptionPane.showInputDialog(null, "informe o tipo de Quarto ");
				        	diaria = Double.parseDouble(JOptionPane.showInputDialog("Diaria Base: "));
				        			        	
				        	gravaHotelPousada(tipo, nome, cidade, quarto, diaria);
				        	/***** Trecho utilizado para teste
				        	System.out.println(gravaHotelPousada(tipo, nome, cidade, quarto, diaria));
							*/
				        	
				        break;
			    	    default:
					    
			    	    		JOptionPane.showMessageDialog(null, "Tipo de Hospedagem Inválido! \n Digite um valor inteiro \n 1-HOTEL \n 2-POUSADA");
		    	    		
			     		}
		    	    
		            mess = JOptionPane.showConfirmDialog(null, "Deseja efetuar NOVO CADASTRO?");
		        	
		            System.out.println("Confirmação de Hotel " + nome);	
		        	
	   			}while(mess == 0);
		       	
		   	   	//*********** Bloco de código do sistema de Reserva, Funciona apenas se o Array estiver populado;
			   	
			   	mess = 1; // Flag para confirmar nova reserva
			   	
			   			Rel = "Você Está entrando no sistema de Gestão de Reserva!\n\n";
			   			Rel +="Precisaremos do nome Hotel para fazer a Reserva! \n"   ;
			   			Rel +="Obrigado por Escolher nossa Empresa, Boa Viagem! \n\n" ;
			   			
			   	   	
			   	JOptionPane.showMessageDialog(null,Rel  , "Sistema de Gerenciamento de Reservas", 1);   	
			   	  	
			   	repositorioReserva repReserva =  new repositorioReserva(); // Inicia ArrayList de Reserva    
		       	
		   	
			   	do{
	
			   		    mess = JOptionPane.showConfirmDialog(null, "Deseja Prosseguir?"); // Se o usuário confirmar repete o laço.
			   		
			   		    nomeCliente = JOptionPane.showInputDialog(null, "informe o nome do cliente ");
					   	cpfCliente = JOptionPane.showInputDialog(null, "informe o cpf do cliente ");
					   	nomeHotel = JOptionPane.showInputDialog(null, "informe o nome do hotel do cliente ");
					   	
					   	h = rep.procurarHotel(nomeHotel); //procurar o hote Válido para depois adicionar a reserva
					   	
					   			/************************************************ Saida de Código apenas para Confirmar consulta de dados no Array
					   			System.out.println(rep.procurarHotel(nome).getNome());
					   			System.out.println(rep.procurarHotel(nome).getCidade());
					   			System.out.println(rep.procurarHotel(nome).getDiaria());
				    		   	*/
					    re = new reserva(nomeCliente, cpfCliente, h);
					    repReserva.inserirReserva(re);
					   	
					    Rel = "Reserva Efetuada! \n";
					    Rel += "Cliente : " + repReserva.procurarReserva(nomeCliente).getNomeCliente().toString()+"\n";
					    Rel += "CPF     : " + repReserva.procurarReserva(nomeCliente).getCpf().toString() +"\n";
						Rel += "Hotel   : " + repReserva.procurarReserva(nomeCliente).getR().getNome()+"\n";
						Rel += "Cidade  : " + repReserva.procurarReserva(nomeCliente).getR().getCidade()+"\n";
						Rel += "Quarto  : " + repReserva.procurarReserva(nomeCliente).getR().getQuarto()+"\n";
						Rel += "Diária  : " + repReserva.procurarReserva(nomeCliente).getR().getDiaria()+"\n\n";
				
						JOptionPane.showMessageDialog(null, Rel , "Sistema de Gerenciamento de Reservas", 1);
						
						mess = JOptionPane.showConfirmDialog(null, "Deseja efetuar NOVA RESERVA?"); // Se o usuário confirmar repete o laço.
	    	
			   	}while(mess == 0);    		
			
	   	}catch(Exception NumberFromatException){
	   
	   		JOptionPane.showMessageDialog(null, "Operação Cancelada Pelo Usuário!" , "Sistema de Gerenciamento de Reservas", 1);
	   	}finally{
	   		JOptionPane.showMessageDialog(null, "Por favor verifique as informações antes de continuar!" , "Sistema de Gerenciamento de Reservas", 1);
	   		
	   	}
	   
	   }
   
}
