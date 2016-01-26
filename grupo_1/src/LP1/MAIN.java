
package LP1;

import java.util.Scanner;
public class MAIN {


    public static void main(String[] args) {
        
        Scanner entradaNumero = new Scanner(System.in);
        Scanner entradaTexto = new Scanner(System.in);
        int escolha=1;
        
        
        //criação dos Repositórios
        RepositorioProduto ESTOQUE = new RepositorioProduto();
        RepositorioClientes CLIENTES = new RepositorioClientes();
        RepositorioFunci FUNCIONARIOS = new RepositorioFunci();
        
        
        //Variáveis temporárias
        String NomeTemp, MarcaTemp, TipoTemp, ProdutoTemp,  CPFTemp;
        double ValorTemp, QtEstoqueTemp = 0;
        int CodTemp, CodigoProduto = 1, CodigoCliente = 1, CodigoFunci = 1;   
        
        
        
        
        //MENU - do while para repetir - switch case pra escolher
        do{
           
            System.out.println("\n\n---------------------------------------------------");
            System.out.println("O QUE DESEJA FAZER?");
            System.out.println("   1-Cadastrar uma Bicicleta");
            System.out.println("   2-Cadastrar uma Peça");
            System.out.println("   3-Excluir um produto cadastrado");
            System.out.println("   4-Cadastrar Funcionario");
            System.out.println("   5-Excluir Funcionario");
            System.out.println("   6-Cadastrar Cliente");
            System.out.println("   7-Excluir Cliente");
            System.out.println("   8-Registrar Compra (Inserir no Estoque)");
            System.out.println("   9-Registrar Venda");
            System.out.println("   10-Imprimir Estoque");
            System.out.println("   11-Imprimir Funcionarios");
            System.out.println("   12-Imprimir Clientes");
            System.out.println("   0-Sair");
            System.out.println("---------------------------------------------------\n");
            escolha = entradaNumero.nextInt();
            
            switch(escolha){
                
//Incluir Bicicleta
                case 1:
                    System.out.println("NOME:");
                    NomeTemp = entradaTexto.nextLine();
                    NomeTemp = NomeTemp.toUpperCase();
                    System.out.println("MARCA:");
                    MarcaTemp = entradaTexto.nextLine();
                    MarcaTemp = MarcaTemp.toUpperCase();
                    System.out.println("QUANTIDADE EM ESTOQUE:");
                    QtEstoqueTemp = entradaNumero.nextInt();
                    System.out.println("VALOR DE VENDA:");
                    ValorTemp = entradaNumero.nextDouble(); 
                    
                    Produto BicicletaTemp = new Bicicleta(CodigoProduto,NomeTemp,MarcaTemp,QtEstoqueTemp,ValorTemp);
                    ESTOQUE.inserir(BicicletaTemp); 
                    CodigoProduto++;                  
                    break;
                
//Incluir Pe�a
                case 2:
                    System.out.println("TIPO (roda,guidão,...):");
                    TipoTemp = entradaTexto.nextLine();
                    TipoTemp = TipoTemp.toUpperCase();
                    System.out.println("NOME:");
                    NomeTemp = entradaTexto.nextLine();
                    NomeTemp = NomeTemp.toUpperCase();
                    System.out.println("MARCA:");
                    MarcaTemp = entradaTexto.nextLine();
                    MarcaTemp = MarcaTemp.toUpperCase();
                    System.out.println("QUANTIDADE EM ESTOQUE:");
                    QtEstoqueTemp = entradaNumero.nextInt();
                    System.out.println("VALOR DE VENDA:");
                    ValorTemp = entradaNumero.nextDouble(); 
                    
                    Produto PecaTemp = new Pecas(CodigoProduto,TipoTemp,NomeTemp,MarcaTemp,QtEstoqueTemp,ValorTemp);
                    ESTOQUE.inserir(PecaTemp);
                    CodigoProduto++; 
                    break;

//Excluir Produto
                case 3:
                    System.out.println("Digite o Codigo do Produto: ");
                    CodTemp = entradaNumero.nextInt();
                    ESTOQUE.remover(CodTemp);
                    break;

//Cadastrar Funcionario
                case 4:
                    System.out.println("NOME:");
                    NomeTemp = entradaTexto.nextLine();
                    System.out.println("CPF:");
                    CPFTemp = entradaTexto.nextLine();
                    
                    PessoaAbstrato FuncionarioTemp = new Funcionario(CodigoFunci,NomeTemp,CPFTemp);
                    FUNCIONARIOS.cadastrar(FuncionarioTemp);
                    CodigoFunci++;
                    break;

//Excluir Funcionario
                case 5:
                    FUNCIONARIOS.imprimirFuncionarios();
                    System.out.println("Digite o Codigo do Funcionario:");
                    CodTemp = entradaTexto.nextInt();
                    FUNCIONARIOS.removerFF(CodTemp);
                    break;

//Cadastrar Cliente
                case 6:
                    System.out.println("NOME:");
                    NomeTemp = entradaTexto.nextLine();
                    NomeTemp = NomeTemp.toUpperCase();
                    System.out.println("CPF:");
                    CPFTemp = entradaTexto.nextLine();
                    
                    PessoaAbstrato ClienteTemp = new Cliente(CodigoCliente,NomeTemp,CPFTemp);
                    CLIENTES.cadastrar(ClienteTemp);
                    CodigoCliente++;                  
                    break;

//Excluir Cliente
                case 7:
                    CLIENTES.imprimirClientes();
                    System.out.println("Digite o Codigo do Cliente:");
                    CodTemp = entradaNumero.nextInt();
                    CLIENTES.removerCC(CodTemp);
                    break;

//Registrar compra (adicionar estoque)
                case 8:
                    System.out.println("Digite o nome do Produto:");
                    NomeTemp = entradaTexto.nextLine();
                    System.out.println("Digite a quantidade:");
                    QtEstoqueTemp = entradaNumero.nextDouble();
                    ESTOQUE.adicionarEstoque(NomeTemp, QtEstoqueTemp);
                    break;

//Registrar venda
                case 9:
                    System.out.println("Digite o Nome do Cliente:");
                    NomeTemp = entradaTexto.nextLine();
                    System.out.println("Digite o nome do Produto:");
                    ProdutoTemp = entradaTexto.nextLine();
                    System.out.println("Digite a quantidade:");
                    QtEstoqueTemp = entradaNumero.nextDouble();
                    ESTOQUE.Venda(ProdutoTemp, QtEstoqueTemp, NomeTemp);
                    break;
                    
//Imprimir Estoque
                case 10:
                    ESTOQUE.imprimirEstoque();
                    break;
                
//Imprimir Funcionarios
                case 11:
                    FUNCIONARIOS.imprimirFuncionarios();
                    break;
                
//Imprimir Clientes                	
                case 12:
                    CLIENTES.imprimirClientes();
                    break;
                    
//Função Escondida - Teste de Cadastro
                case 13:
                    Produto BicicletaTemp1 = new Bicicleta(CodigoProduto,"BARRA CIRCULAR","MONARK",50,350);
                    ESTOQUE.inserir(BicicletaTemp1); 
                    CodigoProduto++;
                    Produto BicicletaTemp2 = new Bicicleta(CodigoProduto,"CALOI 10","CALOI",12,400);
                    ESTOQUE.inserir(BicicletaTemp2); 
                    CodigoProduto++;
                    Produto BicicletaTemp3 = new Bicicleta(CodigoProduto,"CECI","CALOI",20,300);
                    ESTOQUE.inserir(BicicletaTemp3); 
                    CodigoProduto++;
                    
                    Produto PecaTemp1 = new Pecas(CodigoProduto,"PNEU","ARO 22","PIRELLI",10,25.5);
                    ESTOQUE.inserir(PecaTemp1);
                    CodigoProduto++; 
                    Produto PecaTemp2 = new Pecas(CodigoProduto,"PUNHO","RACE","QUALQUER",15,8.40);
                    ESTOQUE.inserir(PecaTemp2);
                    CodigoProduto++; 
                    Produto PecaTemp3 = new Pecas(CodigoProduto,"BANCO","GEL","MACIOZINHO",5,27);
                    ESTOQUE.inserir(PecaTemp3);
                    CodigoProduto++; 
                    
                    PessoaAbstrato FuncionarioTemp1 = new Funcionario(CodigoFunci,"JOÃO","111222333-44");
                    FUNCIONARIOS.cadastrar(FuncionarioTemp1);
                    CodigoFunci++;
                    PessoaAbstrato FuncionarioTemp2 = new Funcionario(CodigoFunci,"MARIA","555666777-88");
                    FUNCIONARIOS.cadastrar(FuncionarioTemp2);
                    CodigoFunci++;
                    PessoaAbstrato FuncionarioTemp3 = new Funcionario(CodigoFunci,"JOSÉ","999000111-22");
                    FUNCIONARIOS.cadastrar(FuncionarioTemp3);
                    CodigoFunci++;
                    
                    PessoaAbstrato ClienteTemp1 = new Cliente(CodigoCliente,"PEDRO","333444555-66");
                    CLIENTES.cadastrar(ClienteTemp1);
                    CodigoCliente++; 
                    PessoaAbstrato ClienteTemp2 = new Cliente(CodigoCliente,"TIAGO","777888999-00");
                    CLIENTES.cadastrar(ClienteTemp2);
                    CodigoCliente++; 
                    PessoaAbstrato ClienteTemp3 = new Cliente(CodigoCliente,"JOÃO","222333444-55");
                    CLIENTES.cadastrar(ClienteTemp3);
                    CodigoCliente++; 
                    break;
                    
                    

//Sair
                default:
                    escolha = 0;
                    System.out.println("ATÉ LOGO!");
            }      
        }while(escolha!=0);
        
        
        
        
        
        

        
    }
    
}
